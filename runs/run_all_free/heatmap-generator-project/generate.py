#!/usr/bin/env python3
"""
Generate a coverage heatmap from CSV data with a full range of coverage
(so we get a nice gradient from green to red, no white cells).
Usage:
    python generate_heatmap.py -i coverage_data.csv -o coverage_heatmap.png
"""

import pandas as pd
import seaborn as sns
import matplotlib.pyplot as plt
from matplotlib.colors import LinearSegmentedColormap
import argparse
import os

def main():
    parser = argparse.ArgumentParser(description="Generate a coverage heatmap with no white cells.")
    parser.add_argument('-i', '--input', type=str, default='coverage_data.csv',
                        help="Path to the CSV file (default: coverage_data.csv)")
    parser.add_argument('-o', '--output', type=str, default='coverage_heatmap.png',
                        help="Output filename for the heatmap (default: coverage_heatmap.png)")
    args = parser.parse_args()

    if not os.path.exists(args.input):
        print(f"Error: Input file '{args.input}' does not exist.")
        return

    # Read the CSV
    df = pd.read_csv(args.input)
    # Ensure we have all columns: 'package','class','coverage'
    required_cols = {'class','test_case','coverage'}
    if not required_cols.issubset(df.columns):
        print("Error: CSV must contain 'package','class','coverage' columns.")
        return

    # Pivot so rows = classes, columns = packages
    heatmap_data = df.pivot(index='class', columns='test_case', values='coverage')

    # We want to be certain no missing data is left. If CSV is complete, no fill is needed, but let's ensure:
    heatmap_data = heatmap_data.fillna(0)

    # Create a custom colormap from green to red
    # (lowest coverage is green, highest coverage is red)
    custom_cmap = LinearSegmentedColormap.from_list(
        "green_yellow_orange_red",
        ["red", "orange", "yellow", "green"]
    )

    plt.figure(figsize=(10, 6))
    ax = sns.heatmap(
        heatmap_data,
        annot=True,
        fmt=".0f",        # round coverage to integer
        cmap=custom_cmap,
        cbar_kws={'label': 'Coverage (%)'},
        linewidths=0.5,
        linecolor='gray'
    )
    plt.title('Code Coverage Heatmap')
    plt.xlabel('Test Cases')
    plt.ylabel('Classes')
    plt.tight_layout()

    # Decide the format from the file extension, default to png
    ext = os.path.splitext(args.output)[1][1:] or 'png'
    plt.savefig(args.output, format=ext)
    plt.show()
    print(f"Heatmap saved to '{args.output}'.")

if __name__ == '__main__':
    main()

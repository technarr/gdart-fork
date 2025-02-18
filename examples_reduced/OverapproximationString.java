/*
 * Contributed to SV-COMP by Malte Mues
 * License: MIT (see /java/jdart-regression/LICENSE-MIT)
 */

import org.sosy_lab.sv_benchmarks.Verifier;

public class OverapproximationString {
  public void foo(String s) {
    String prefix = "abc";
    String complete = prefix + s;
    if (complete.equals("not possible")) {
      assert (true);
    } else {
      assert (false);
    }
  }

  public static void main(String args[]) {
    OverapproximationString c = new OverapproximationString();
    String input = Verifier.nondetString();
    c.foo(input);
  }
}

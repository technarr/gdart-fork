/*
 * Contributed to SV-COMP by Falk Howar
 * License: MIT (see /java/jdart-regression/LICENSE-MIT)
 *
 */

import tools.aqua.concolic.Verifier;

public class BoundCheck100 {

  private static void recursion(int i) {
    if (i == 0) {
      return;
    }
    if (i > 0) {
      recursion(i - 1);
    }
    if (i < 0) {
      assert false;
    }
  }

  public static void main(String[] args) {
    int x = Verifier.nondetInt();
    if (x < 100 || x > 100) {
      return;
    }

    recursion(x);

    assert false;
  }
}

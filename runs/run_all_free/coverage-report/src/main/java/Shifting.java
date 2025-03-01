/*
 * Contributed to SV-COMP by Falk Howar
 * License: MIT (see /java/jdart-regression/LICENSE-MIT)
 *
 */

import tools.aqua.concolic.Verifier;

public class Shifting {

  public static void main(String[] args) {

    int i = Verifier.nondetInt();

    if (i < 0 || i > 100) {
      return;
    }

    if ((1L << i) > Integer.MAX_VALUE) {
      assert false;
    }
  }
}

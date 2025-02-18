/*
 * Contributed to SV-COMP by Falk Howar
 * License: MIT (see /java/jdart-regression/LICENSE-MIT)
 *
 */

import tools.aqua.concolic.Verifier;

public class Shifting3 {

  public static void main(String[] args) {

    int i = Verifier.nondetInt();

    if (i < 1 || i > 100) {
      return;
    }

    assert ((1L << i) != 1L);
  }
}

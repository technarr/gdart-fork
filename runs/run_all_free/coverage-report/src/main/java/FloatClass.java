/*
 * Contributed to SV-COMP by Falk Howar
 * License: MIT (see /java/jdart-regression/LICENSE-MIT)
 *
 */

import tools.aqua.concolic.Verifier;

public class FloatClass {

  public static void main(String[] args) {
    float a = Verifier.nondetFloat();
    float b = Verifier.nondetFloat();
    assert (a + b != a || b == 0.0);
  }
}

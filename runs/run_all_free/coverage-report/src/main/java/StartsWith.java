/*
 * Contributed to SV-COMP by Falk Howar
 * License: MIT (see /java/jdart-regression/LICENSE-MIT)
 *
 */

import java.io.IOException;
import tools.aqua.concolic.Verifier;

public class StartsWith {
  public void doPost(String request) {
    String param = "";
    if (Verifier.nondetString() != null) {
      param = request;
    }

    String[] argsEnv = {param};

    if (param.equals("") && argsEnv[0].equals("GOTCHA")) {
      assert false;
    }
  }

  public static void main(String[] args) {
    String request = Verifier.nondetString();
    StartsWith b = new StartsWith();
    b.doPost(request);
  }
}

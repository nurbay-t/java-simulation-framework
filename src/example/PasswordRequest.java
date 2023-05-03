package example;

import kz.edu.nu.JavaSim.Component;
import kz.edu.nu.JavaSim.connection.Bool;

import java.util.Random;

public class PasswordRequest extends Component {
    public PasswordRequest(String name) {
        super(name);
    }

    final int MAX_NUM_ATTEMPTS = 3;

    @Override
    public void runCycle() {

        if (in.isEmpty()) return;
        super.runCycle();

        if (((Bool) in.get(0).getData()).equals(true)) {

            Random random = new Random();
            boolean isCorrectPassword = false;
            int attemts = 0;

            while (isCorrectPassword == false && attemts < MAX_NUM_ATTEMPTS) {
                attemts++;

                if (random.nextInt(10) < 8) {
                    isCorrectPassword = true;
                }
            }

            if (isCorrectPassword == false) {
                System.out.println("Authentication failed.");
                ((Bool) out.get(0).getData()).setValue(false);  // correct pass
                ((Bool) out.get(1).getData()).setValue(true);   // wrong pass
            } else {
                System.out.println("Successful authentication with password.");
                ((Bool) out.get(0).getData()).setValue(true);   // correct pass
                ((Bool) out.get(1).getData()).setValue(false);  // wrong pass
            }
        } else {
            ((Bool) out.get(0).getData()).setValue(false);
            ((Bool) out.get(1).getData()).setValue(false);
        }
    }
}

package example;

import kz.edu.nu.JavaSim.Component;
import kz.edu.nu.JavaSim.connection.Bool;

import java.util.Random;

public class MainMenu extends Component {
    public MainMenu(String name) {
        super(name);
    }

    @Override
    public void runCycle() {

        if (in.isEmpty()) return;
        super.runCycle();

        if (((Bool) in.get(0).getData()).equals(true) || ((Bool) in.get(1).getData()).equals(true)) {

            Random random = new Random();
            int nextAction = random.nextInt(3);
            switch (nextAction) {
                case (0):   // cancel
                    System.out.println("Operations were cancelled.");
                    ((Bool) out.get(0).getData()).setValue(true);
                    ((Bool) out.get(1).getData()).setValue(false);
                    ((Bool) out.get(2).getData()).setValue(false);
                    break;

                case (1):   // amount requested
                    System.out.println("The amount is requested.");
                    ((Bool) out.get(0).getData()).setValue(false);
                    ((Bool) out.get(1).getData()).setValue(true);
                    ((Bool) out.get(2).getData()).setValue(false);
                    break;

                case (2):   // cash requested
                    System.out.println("The cash is requested.");
                    ((Bool) out.get(0).getData()).setValue(false);
                    ((Bool) out.get(1).getData()).setValue(false);
                    ((Bool) out.get(2).getData()).setValue(true);
                    break;

                default:
                    break;
            }
        } else {
            ((Bool) out.get(0).getData()).setValue(false);
            ((Bool) out.get(1).getData()).setValue(false);
            ((Bool) out.get(2).getData()).setValue(false);
        }
    }
}
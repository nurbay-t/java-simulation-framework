package example;

import kz.edu.nu.JavaSim.Component;
import kz.edu.nu.JavaSim.connection.Bool;

import java.util.Random;

public class AmountRequest extends Component {
    public AmountRequest(String name) {
        super(name);
    }

    @Override
    public void runCycle() {

        if (in.isEmpty()) return;
        super.runCycle();
        if (((Bool) in.get(0).getData()).equals(true)) {
            System.out.println("The information is provided.");
            Random random = new Random();
            if (random.nextInt(10) < 5) {
                System.out.println("Another operation is needed.");
                ((Bool) out.get(0).getData()).setValue(false);
                ((Bool) out.get(1).getData()).setValue(true);
            } else {
                ((Bool) out.get(0).getData()).setValue(true);
                ((Bool) out.get(1).getData()).setValue(false);
            }
        }
    }
}
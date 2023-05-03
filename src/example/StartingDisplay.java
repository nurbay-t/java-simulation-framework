package example;

import kz.edu.nu.JavaSim.Component;
import kz.edu.nu.JavaSim.connection.Bool;

public class StartingDisplay extends Component {
    public StartingDisplay(String name) {
        super(name);
    }

    @Override
    public void runCycle() {

        if (in.isEmpty()) return;
        super.runCycle();

        if (((Bool) in.get(0).getData()).equals(true) || ((Bool) in.get(1).getData()).equals(true)) {
            System.out.println("Card has been inserted.");
            ((Bool) in.get(0).getData()).setValue(false);
            ((Bool) out.get(0).getData()).setValue(true);
        } else {
            ((Bool) out.get(0).getData()).setValue(false);
        }
    }
}



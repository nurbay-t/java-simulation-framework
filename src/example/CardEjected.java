package example;

import kz.edu.nu.JavaSim.Component;
import kz.edu.nu.JavaSim.connection.Bool;

public class CardEjected extends Component {
    public CardEjected(String name) {
        super(name);
    }

    @Override
    public void runCycle() {

        if (in.isEmpty()) return;
        super.runCycle();

        if (((Bool) in.get(0).getData()).equals(true)
                || ((Bool) in.get(1).getData()).equals(true)
                || ((Bool) in.get(2).getData()).equals(true)) {
            System.out.println("Card is taken.");
            ((Bool) out.get(0).getData()).setValue(true);
        } else {
            ((Bool) out.get(0).getData()).setValue(false);
        }
    }
}
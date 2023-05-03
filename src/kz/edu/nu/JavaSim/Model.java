package kz.edu.nu.JavaSim;

import java.util.ArrayList;
import java.util.List;

/**
 The Model class represents a simulation model that contains components and tracks time.
 It provides methods to add components to the model, run cycles of the simulation, and run
 a specified number of cycles. The maximum number of cycles that can be run is defined by
 the constant MAX_NUM_CYCLES.
 */
public class Model {

    /** The maximum number of cycles that can be run. */
    public static final int MAX_NUM_CYCLES = 10;
    /** The list of components */
    private List<Component> components;
    /** A unit of time */
    private Integer time;

    /**
     * Constructs an empty model with an initial time of 0.
     */
    public Model() {
        components = new ArrayList<>();
        time = 0;
    }

    /**
     * Returns the list of components in the model.
     * @return the list of components
     */

    public List<Component> getComponents() {
        return components;
    }

    /**
     * Sets the list of components in the model.
     * @param components the list of components
     */
    public void setComponents(List<Component> components) {
        this.components = components;
    }

    /**
     * Adds a component to the model.
     * @param component the component to add
     */
    public void addComponent(Component component) {
        components.add(component);
    }

    /**
     * Runs one cycle of the simulation by calling the runCycle() method on each component in the model
     * and incrementing the time by 1.
     */
    public void runCycle() {
        for (Component component: components) {
            component.runCycle();
            time++;
        }
    }

    /**
     * Runs the specified number of cycles of the simulation by calling the runCycle() method on each component
     * in the model for each cycle and incrementing the time by 1 for each cycle.
     * If the specified number of cycles exceeds the maximum number of cycles, the method returns without running the simulation.
     * @param n the number of cycles to run
     */
    public void runNCycles(Integer n) {

        if (n < 1 || n > MAX_NUM_CYCLES) {
            System.out.println("The number of cycles should be between 1 and " + MAX_NUM_CYCLES);
            return;
        }

        for (int i = 0; i < n; i++) {
            for (Component component: components) {
                component.runCycle();
                time++;
            }
        }
    }
}
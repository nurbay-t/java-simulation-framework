package kz.edu.nu.JavaSim;

import kz.edu.nu.JavaSim.connection.Connection;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 This is an abstract class representing a generic component in a simulation model.
 Each component has a name, and a list of incoming and outgoing connections.
 It provides methods for accessing and modifying these connections, as well as for running a single cycle of the component.
 */
public abstract class Component {

    /** The name of the component */
    protected String name;
    /** The list of incoming connections for the component */
    protected List<Connection> in;
    /** The list of outgoing connections for the component */
    protected List<Connection> out;

    /**
     Constructor for the Component class.
     @param name The name of the component.
     */
    public Component(String name) {
        this.name = name;
        this.in = new ArrayList<>();
        this.out = new ArrayList<>();
    }

    /**
     Returns the name of the component.
     @return The name of the component.
     */
    public String getName() {
        return name;
    }

    /**
     Sets the name of the component.
     @param name The new name for the component.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     Returns the list of incoming connections for the component.
     @return The list of incoming connections for the component.
     */
    public List<Connection> getIncomingConnection() {
        return in;
    }

    /**
     Sets the list of incoming connections for the component.
     @param in The new list of incoming connections for the component.
     */
    public void setIncomingConnection(List<Connection> in) {
        this.in = in;
    }

    /**
     Adds a new incoming connection to the component.
     @param in The incoming connection to add.
     */
    public void addIncomingConnection(Connection in) {
        this.in.add(in);
    }

    /**
     Returns the list of outgoing connections for the component.
     @return The list of outgoing connections for the component.
     */
    public List<Connection> getOutgoingConnection() {
        return out;
    }

    /**
     Sets the list of outgoing connections for the component.
     @param out The new list of outgoing connections for the component.
     */
    public void setOutgoingConnection(List<Connection> out) {
        this.out = out;
    }

    /**
     Adds a new outgoing connection to the component.
     @param out The outgoing connection to add.
     */
    public void addOutgoingConnection(Connection out) {
        this.out.add(out);
    }

    /**
     Runs a single cycle of the component.
     */
    public void runCycle() {
    }

    /**
     Determines if this Component is equal to another object.
     Two Components are considered equal if they have the same name.
     @param o The object to compare this Component to.
     @return True if the object is equal to this Component, false otherwise.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Component component = (Component) o;
        return Objects.equals(name, component.name);
    }

    /**
     * Returns the hash code of this object.
     * @return the hash code of this object
     */
    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    /**
     Returns a string representation of the component, including its connections.
     @return a string representation of the component
     */
    @Override
    public String toString() {
        return "Component " + name +
                "\nin: " + in +
                "\nout: " + out;
    }
}

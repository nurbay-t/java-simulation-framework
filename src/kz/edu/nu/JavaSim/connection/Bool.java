package kz.edu.nu.JavaSim.connection;

import java.util.Objects;

/**
 A boolean connection type representing a boolean value. This class implements the ConnectionType interface.
 */
public class Bool implements ConnectionType {
    /** The boolean value represented by this object. */
    private boolean value;

    /**
     * Constructs a new Bool object with the given boolean value.
     * @param value the boolean value to be represented by this object
     */
    public Bool(boolean value) {
        this.value = value;
    }

    /**
     * Returns the boolean value represented by this object.
     * @return the boolean value represented by this object
     */
    public boolean getValue() {
        return value;
    }

    /**
     * Sets the boolean value represented by this object.
     * @param value the boolean value to be represented by this object
     */
    public void setValue(boolean value) {
        this.value = value;
    }

    /**
     * Returns the boolean value represented by this object.
     * @return the boolean value represented by this object
     */
    @Override
    public Object getData() {
        return value;
    }

    /**
     * Compares the boolean value represented by this object with the given boolean value for equality.
     * @param b the boolean value to be compared with
     * @return true if the boolean value represented by this object is equal to the given boolean value, false otherwise
     */
    public boolean equals(boolean b) {
        return value == b;
    }

    /**
     * Compares this object with the given object for equality.
     *
     * @param o the object to be compared with
     * @return true if the given object is equal to this object, false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bool bool = (Bool) o;
        return value == bool.value;
    }

    /**
     * Returns the hash code of this object.
     * @return the hash code of this object
     */
    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    /**
     * Returns a string representation of this object.
     * @return a string representation of this object
     */
    @Override
    public String toString() {
        return Boolean.toString(value);
    }
}

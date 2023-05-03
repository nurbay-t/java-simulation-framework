package kz.edu.nu.JavaSim.connection;

/**
 This class represents an integer type for a connection in the system.
 It implements the ConnectionType interface and provides a value within the range of MIN_VALUE to MAX_VALUE.
 */
public class Int implements ConnectionType {
    /** The minimum value that can be assigned to an instance of this class. */
    public static final int MIN_VALUE = -100;
    /** The maximum value that can be assigned to an instance of this class. */
    public static final int MAX_VALUE = 100;

    /** The integer value represented by this instance. */
    private int value;

    /**
     Constructs a new Int object with the specified integer value.
     @param value the integer value to assign to this instance.
     */
    public Int(int value) {
        this.value = value;
    }

    /**
     Returns the integer value represented by this instance.
     @return the integer value represented by this instance.
     */
    public int getValue() {
        return value;
    }

    /**
     Sets the integer value represented by this instance.
     @param value the integer value to assign to this instance.
     */
    public void setValue(int value) {
        this.value = value;
    }

    /**
     Returns the integer value represented by this instance as an Object.
     @return the integer value represented by this instance as an Object.
     */
    @Override
    public Object getData() {
        return value;
    }

    /**
     Returns a string representation of the integer value represented by this instance.
     @return a string representation of the integer value represented by this instance.
     */
    @Override
    public String toString() {
        return Integer.toString(value);
    }
}

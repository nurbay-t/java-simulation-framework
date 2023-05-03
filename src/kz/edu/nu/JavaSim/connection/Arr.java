package kz.edu.nu.JavaSim.connection;

/**
 * A generic class representing an array of a specific connection type.
 * @param <T> the connection type of the array elements
 */
public class Arr<T extends ConnectionType> implements ConnectionType {
    private T[] array;

    /**
     * Constructs a new MyArr object with the given array.
     * @param array the array to be represented by this object
     */
    public Arr(T[] array) {
        this.array = array;
    }

    /**
     * Returns the array represented by this object.
     * @return the array represented by this object
     */
    public T[] getArray() {
        return array;
    }

    /**
     * Sets the array represented by this object.
     * @param array the array to be represented by this object
     */
    public void setArray(T[] array) {
        this.array = array;
    }

    /**
     * Returns the data of the array represented by this object.
     * @return the data of the array represented by this object
     */
    @Override
    public Object getData() {
        return array;
    }

    /**
     * Returns a string representation of the array represented by this object.
     * @return a string representation of the array represented by this object
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        for (int i = 0; i < array.length; i++) {
            builder.append(array[i].toString());
            if (i < array.length - 1) {
                builder.append(", ");
            }
        }
        builder.append("]");
        return builder.toString();
    }
}
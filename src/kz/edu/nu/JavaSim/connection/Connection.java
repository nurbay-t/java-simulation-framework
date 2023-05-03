package kz.edu.nu.JavaSim.connection;

/**
 A Connection class that holds a name and data of a specified type.
 @param <T> the type of the data the connection holds, must implement ConnectionType
 */
public class Connection<T extends ConnectionType> {

    /** The name of the connection. */
    private String name;

    /** The data held in the connection, of type T. */
    private T data;

    /**
     Creates a new connection with a given name and data.
     @param name the name of the connection
     @param data the data held in the connection
     */
    public Connection(String name, T data) {
        this.name = name;
        this.data = data;
    }

    /**
     Gets the name of the connection.
     @return the name of the connection
     */
    public String getName() {
        return name;
    }

    /**
     Sets the name of the connection.
     @param name the new name of the connection
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     Gets the data held in the connection.
     @return the data held in the connection
     */
    public T getData() {
        return data;
    }

    /**
     Sets the data held in the connection.
     @param data the new data to be held in the connection
     */
    public void setData(T data) {
        this.data = data;
    }

    /**
     Returns a string representation of the connection, including its data.
     @return a string representation of the connection
     */
    @Override
    public String toString() {
        return "The data is" + data;
    }
}

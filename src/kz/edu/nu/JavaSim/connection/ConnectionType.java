package kz.edu.nu.JavaSim.connection;

/**
 An interface representing a connection type.
 Implementations of this interface can be used to define the type of data that can be transmitted through a connection.
 */
public interface ConnectionType {

    /**
     Returns the data object transmitted through this connection.
     @return the data object transmitted through this connection.
     */
    public Object getData();
}

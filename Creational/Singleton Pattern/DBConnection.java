public class DBConnection {

    // Eager Initialization (first approach)

    private static DBConnection connection = new DBConnection();

    private DBConnection(){}

    public static DBConnection getInstance(){
        return connection;
    }

    // Lazy Initialization (Second approach)
    private static DBConnection connection;

    private DBConnection(){}

    public static DBConnection getInstance(){
        if(connection == null)
            connection = new DBConnection();
        return connection;
    }

    // Synchronized or locking Method (Third approach) Very Costly in times of time
    private static DBConnection connection;

    private DBConnection(){}

    synchronized public static DBConnection getInstance(){
        if(connection == null)
            connection = new DBConnection();
        return connection;
    }

    // Double Locking method (Fourth approach) Used in the industry
    private static DBConnection connection;

    private DBConnection(){}

    public static DBConnection getInstance(){
        if(connection == null){
            synchronized (DBConnection.class){
                if(connection == null)
                    connection = new DBConnection();
            }
        }
        return connection;
    }

}

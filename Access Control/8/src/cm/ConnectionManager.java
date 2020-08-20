package cm;

public class ConnectionManager {
    private static Connection[] conArray;
    private static int balance;
    private static int connectionsNumber;
    private static ConnectionManager conManager = new ConnectionManager();
    private ConnectionManager(){

    }
    static{
        connectionsNumber = 0;
        balance = 5;
        conArray = new Connection[balance];
    }

    public static Connection getConnection(){

        if (connectionsNumber < balance){
            conArray[connectionsNumber] = new Connection();
            System.out.println("Connection added. Number of connections: " + connectionsNumber);
            return conArray[connectionsNumber++];
        }
        System.out.println("Returned null");
        return null;

    }

    public static int getConnectionsNumber(){
        return connectionsNumber;
    }

}

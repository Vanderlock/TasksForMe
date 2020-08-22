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
        try {
            conArray[connectionsNumber] = new Connection();
            System.out.println("Connection added. Number of connections: " + (connectionsNumber+1));
            return conArray[connectionsNumber++];
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Returned null, balance used up");
            return null;
        }
    }

    public static int getConnectionsNumber(){
        return connectionsNumber;
    }

}

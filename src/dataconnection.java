import java.sql.Connection;
import java.sql.DriverManager;

public class dataconnection {

    private static Connection con;
    private static String URL;
    private static String USER;
    private static String PASSWORD;

    public static Connection getConnection() {
        con = null;
        Properties properties = new Properties();
        try {
            properties.load(new FileReader(new File("info.properties")));
            URL = properties.getProperty("url");
            USER = properties.getProperty("user");
            PASSWORD = properties.getProperty("password");
            // driver register
            DriverManager DriverManager;
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            con = (Connection) DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (IOException | SQLException ex) {
            Logger.getLogger(DataConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return (con);
    }

    public static void freeConnection() {
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(DataConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
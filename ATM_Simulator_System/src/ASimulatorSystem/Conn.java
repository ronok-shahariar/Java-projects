package ASimulatorSystem;
import java.sql.*;

/**
 *
 * @author Ronok Arya
 */
public class Conn {
    Connection c;
    Statement s;
    public Conn(){
        try{
            /**
             * JDBC needs to register only once in the program.
             * Class.forName()method
             * To load the driver's class file into memory, which automatically registers it.
             */
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///project2","root","");
            s = c.createStatement(); //used to access to our database. Useful when using static SQL statements at ryntime.

        }catch(Exception e){
            System.out.println(e);
        }

    }

}

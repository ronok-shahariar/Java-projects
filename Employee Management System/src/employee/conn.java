package employee;
import java.sql.*; //select,update contain in sql package

public class conn {
    public Connection c;
    public Statement s;
    
    public conn(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql///project3","root","");
            s = c.createStatement();
        }catch(Exception e){
            e.printStackTrace();
        }
    }    
}

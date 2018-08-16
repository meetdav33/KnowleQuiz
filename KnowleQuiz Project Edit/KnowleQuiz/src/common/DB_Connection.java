package common;

import java.sql.*;
import javax.swing.JOptionPane;
public class DB_Connection {
    Connection connect;
    
    public static Connection ConnectDB(){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection connect=DriverManager.getConnection("jdbc:sqlite:E:\\KnowleQuiz Project\\KnowleQuiz.sqlite");
                return connect;
        }catch(Exception e)
        {
                JOptionPane.showMessageDialog(null, e);
                        return null;
        }
}
}

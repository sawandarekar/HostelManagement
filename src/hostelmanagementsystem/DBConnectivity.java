/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hostelmanagementsystem;

import java.sql.*;
import javax.swing.JOptionPane;
/**
 *global class to handle database activity
 * for Hostel Management System
 * @author Shreeyash
 */
public class DBConnectivity {
    Connection con;   
    

DBConnectivity()
    {
    try
      {
         Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

         con=DriverManager.getConnection("jdbc:odbc:hostelmanagement");

      }catch(Exception e){System.out.println("in DBConnectivity class");}

}
int insertQuery(String ins_query)
    {
    try
         {
         Statement stmt = con.createStatement();

         int i = stmt.executeUpdate(ins_query);

         if(i==0)
         {
            JOptionPane.showMessageDialog(null, "Value not inserted");
            return 0;
         }
         else
            {
             return 1;
            }
        }
        catch(Exception e){System.out.println("error while inserting "+e);}
        return 0;
}
/**
 * returns ResultSet 
 * @param select_query
 * @return ResultSet
 */
ResultSet selectQuery(String select_query)
    {
    ResultSet rs = null;
    try
    {
    Statement stmt = con.createStatement();

    rs = stmt.executeQuery(select_query);
        }
    catch(Exception e){System.out.println("error while inserting "+e);}
    return rs;    
}
int updateQuery(String update_query)
    {
         try
         {
         Statement stmt = con.createStatement();

         int i = stmt.executeUpdate(update_query);

         if(i==0)
         {
            JOptionPane.showMessageDialog(null, "Value not Updated");
            return 0;
         }
         else
            {
             return 1;
            }
        }
        catch(Exception e){System.out.println("error while updating "+e);}
        return 0;
}
int deleteQuery(String delete_query)
    {
    try
         {
         Statement stmt = con.createStatement();

         int i = stmt.executeUpdate(delete_query);

         if(i==0)
         {
            JOptionPane.showMessageDialog(null, "Value not deleted");
            return 0;
         }
         else
            {
             return 1;
            }
        }
        catch(Exception e){System.out.println("error while deleting "+e);}
        return 0;
}
void closeConnection()
    {
    try
    {
    con.close();
        }
    catch(Exception e){System.out.println("error during connection close");}
}
}

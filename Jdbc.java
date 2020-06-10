package proiect;
/*
select * from proiect.student;

insert into proiect.student values('1','Diaconu','M.','Betty','8.65','9.10','bet@be.com','07456','CN ION NEC','2990922')
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;

public class Jdbc {
    public ResultSet readStudent(Statement statement,String db_table) {
        String query = "SELECT * FROM" +db_table;
        try{

            Threads t1 = new Threads("Thread-citire");
            t1.start();
            return statement.executeQuery(query);
        } catch (SQLException e) {
            System.out.println(e);
        } return null;
    }
    public void deleteStudent(Statement statement, int id,String db_table) {
        String query = "DELETE FROM "+db_table+" WHERE (`id` = '" + id + "')";
        try{
            statement.executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void updateStudent(Statement statement, float medie_bac,int id) {
        String query = "UPDATE `proiect`.`student` SET `medie_bac` = '" + medie_bac +"' WHERE (`id` = '"+ id +"')";
        try{
            statement.executeUpdate(query);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    public void createStudent(Statement statement,String db_table,String insert_values)
    {   String query = "INSERT INTO "+db_table+insert_values;
        try{
            statement.executeUpdate(query);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
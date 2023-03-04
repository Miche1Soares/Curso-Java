package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import db.DB;
import db.DbIntegrityException;

public class App {
    public static void main(String[] args) throws Exception {

        /*
        TESTANDO A EXECUÇÃO DO DATABASE

        Connection conn = DB.getConnection();
        DB.closeConnection();
        */





        // CONSULTANDO DADOS

        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;

        try
        {
            conn = DB.getConnection();

            st = conn.createStatement();

            rs = st.executeQuery("select * from department");

            while(rs.next())
            {
                System.out.println(rs.getInt("Id") + ", " + rs.getString("Name"));
            }
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        finally
        {
            // comentados para n afetar a execução seguinte


            //DB.closeResultSet(rs);
            //DB.closeStatement(st);
            //DB.closeConnection();
        }


        // INSERINDO DADOS


        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        conn = null;
        PreparedStatement pst = null;

        try
        {
            conn = DB.getConnection();

            pst = conn.prepareStatement(
                "INSERT INTO seller "
                + "(Name, Email, BirthDate, BaseSalary, DepartmentId) "
                + "VALUES "
                + "(?, ?, ?, ?, ?)",
                Statement.RETURN_GENERATED_KEYS);
            
            pst.setString(1, "Carl Purple");
            pst.setString(2, "carl@gmail.com");
            pst.setDate(3, new java.sql.Date(sdf.parse("22/04/1986").getTime()));
            pst.setDouble(4, 3000.0);
            pst.setInt(5, 4);

            int rowsAffected = pst.executeUpdate();

            if(rowsAffected > 0)
            {
                ResultSet rs2 = pst.getGeneratedKeys();
                while(rs2.next())
                {
                    int id = rs2.getInt(1);
                    System.out.println("Done! Id = " + id);
                }
            }
            else
            {
                System.out.println("No row affected!");
            }

        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        catch(ParseException e)
        {
            e.printStackTrace();
        }
        finally
        {
            DB.closeStatement(pst);
            //DB.closeConnection();
        }




        // ATUALIZANDO DADOS


        conn = null;
        PreparedStatement pst2 = null;

        try
        {
            conn = DB.getConnection();

            pst2 = conn.prepareStatement(
                "UPDATE seller "
                + "SET BaseSalary = BaseSalary + ? "
                + "WHERE "
                + "(DepartmentId = ?)");
            
            pst2.setDouble(1, 200.0);
            pst2.setInt(2, 2);

            int rowsAffected2 = pst2.executeUpdate();

            System.out.println("Done! Rows affected: " + rowsAffected2);

        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        finally
        {
            DB.closeStatement(pst2);
            //DB.closeConnection();
        }




        // DELETANDO DADOS


        conn = null;
        PreparedStatement pst3 = null;

        try
        {
            conn = DB.getConnection();

            pst3 = conn.prepareStatement(
                "DELETE FROM department "
                + "WHERE "
                + "Id = ?");
            
            pst3.setInt(1, 2);            

            int rowsAffected3 = pst3.executeUpdate();

            System.out.println("Done! Rows affected: " + rowsAffected3);

        }
        catch (SQLException e)
        {
            throw new DbIntegrityException(e.getMessage());
        }
        finally
        {
            DB.closeStatement(pst3);
            DB.closeConnection();
        }

    }
}

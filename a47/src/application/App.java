package application;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;
import db.DbException;

public class App {
    public static void main(String[] args) throws Exception {

        Connection conn = null;
        Statement st = null;

        try
        {
            conn = DB.getConnection();

            // com isso as alterações só serão confirmadas com o comando commit
            conn.setAutoCommit(false);

            st = conn.createStatement();
            
            int rows1 = st.executeUpdate("UPDATE seller SET BaseSalary = 2090 WHERE DepartmentId = 1");

            // com um erro entre duas operaçoes a primeira será executada mas a segunda não
            int x = 1;
            if(x<2) throw new SQLException("Fake error");

            int rows2 = st.executeUpdate("UPDATE seller SET BaseSalary = 3090 WHERE DepartmentId = 2");


            // com essa confirmação, se houver um erro entre as operações, nada será executado
            conn.commit();

            System.out.println("Rows 1: " + rows1);
            System.out.println("Rows 2: " + rows2);

        }
        catch(SQLException e)
        {
            try
            {
                // retorna o estado do banco de dados para antes da execução
                conn.rollback();
                throw new DbException("Transaction rolled back! Caused by: " + e.getMessage());
            }
            catch(SQLException e1)
            {
                throw new DbException("Error trying to rollback! Caused by: " + e1.getMessage());
            }
        }
        finally
        {
            DB.closeStatement(st);
            DB.closeConnection();
        }

    }
}

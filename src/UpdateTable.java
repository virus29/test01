import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateTable {
    //Этот метод будет обновлять значения в таблице:
    public static void UpdateTable() throws SQLException {
        Connection dbConnection = null;
        Statement statement = null;

        String updateTableSQL = "UPDATE DBUSER SET USERNAME = 'mkyong_new' WHERE USER_ID = 1";

        try {
            dbConnection = ConnectionToDatabase.getDBConnection();
            statement = dbConnection.createStatement();
            // выполнить SQL запрос
            statement.execute(updateTableSQL);
            System.out.println("Record is updated to DBUSER table!");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            if (statement != null) {
                statement.close();
            }
            if (dbConnection != null) {
                dbConnection.close();
            }
        }
    }
}

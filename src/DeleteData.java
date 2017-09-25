import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteData {
    //Этот метод будет удалять все записи в таблице:
    public static void DeleteData() throws SQLException {
        Connection dbConnection = null;
        Statement statement = null;

        String deleteTableSQL = "DELETE DBUSER WHERE USER_ID = 1";

        try {
            dbConnection = ConnectionToDatabase.getDBConnection();
            statement = dbConnection.createStatement();
            // выполнить SQL запрос
            statement.execute(deleteTableSQL);
            System.out.println("Record is deleted from DBUSER table!");
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


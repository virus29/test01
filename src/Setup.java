import java.sql.SQLException;
//public class Setup {
//    public static void main(String[] argv) {
//        try {
//            //Добавление значений в таблицу
//            AddNewEntry.AddNewEntry();
//            //Получаем значения из таблицы
//            ReceivingData.ReceivingData();
//            //Обновляем значение в таблице
//            UpdateTable.UpdateTable();
//            //Удаляем все значения из таблицы
//            DeleteData.DeleteData();
//        } catch (SQLException e) {
//            System.out.println(e.getMessage());
//        }
//    }
//}
public class Setup {
    public static void main(String[] argv) {
        //Добавление значений в таблицу
        try {
            AddNewEntry.AddNewEntry();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        //Получаем значения из таблицы
        try {
            ReceivingData.ReceivingData();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        //Обновляем значение в таблице
        try {
            UpdateTable.UpdateTable();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        //Удаляем все значения из таблицы
        try {
            DeleteData.DeleteData();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}

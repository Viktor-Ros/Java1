package MySQL;

import java.lang.reflect.InvocationTargetException;
import java.sql.*;

/*
 * ОСНОВНЫЕ ОПЕРАЦИИ С БД MySQL
 * 
 * 
 * 
 */

public class BaseOperationSQL {
	

	public static void main(String[] args) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
				
		String url = "jdbc:mysql://localhost:3306/users?useUnicode=true&serverTimezone=UTC";//адрес БД на сервере
		String user = "root";//имя пользователя
		String pass = "passpass11";//пароль пользователя
		
		Class.forName("com.mysql.cj.jdbc.Driver");//драйвер для соединения с БД
		
		Connection connection = DriverManager.getConnection(url, user, pass);//соединение с БД
				
		BaseOperationSQL.tablePrint(connection);//вывод таблицы в консоль
                
        String sqlCommandAdd = "INSERT INTO test1 (id, name, age) Values (?, ?, ?)";//Текст запроса на добавление позиции в таблицу
        
		PreparedStatement commandAdd = connection.prepareStatement(sqlCommandAdd);//Исполнение запроса
		
		//Данные которые нужно добавить
		int idAdd = 6;
		String nameAdd = "dick";
		int ageAdd = 29;

		//Добавление данных в запрос в соответствии с очередностью
		commandAdd.setInt(1, idAdd);
		commandAdd.setString(2, nameAdd);
		commandAdd.setInt(3, ageAdd);
		
		commandAdd.executeUpdate();
		
		commandAdd.close();//закрытие запроса
        		
		BaseOperationSQL.tablePrint(connection);
		
		//Удаление позиции в таблице
		
		String sqlCommandDel = "delete from test1 where name=?;";
		
		PreparedStatement commandDel = connection.prepareStatement(sqlCommandDel);
		
		String nameDel = "dick";
        
		commandDel.setString(1, nameDel);
		commandDel.executeUpdate();
		commandDel.close();
		
		BaseOperationSQL.tablePrint(connection);
		
		//Изменение позиции в таблице
		
		String sqlCommandUpd = "update test1 set name=? where name=?";
		
		PreparedStatement commandUpd = connection.prepareStatement(sqlCommandUpd);
		

		String nameUpd1 = "jerry";
		String nameUpd2 = "tom";
		
		commandUpd.setString(1, nameUpd1);
		commandUpd.setString(2, nameUpd2);
		
		commandUpd.executeUpdate();
		
		commandUpd.close();
		
		BaseOperationSQL.tablePrint(connection);
		
		//Получения значения из таблицы    
        
        String sqlCommandGetData= "select*from test1 where name=?";
		
		PreparedStatement commandGetData = connection.prepareStatement(sqlCommandGetData);
		
		String nameGet = "sara";
		
		commandGetData.setString(1,nameGet);
		
		commandGetData.execute();

        int saraAge = 0;

        ResultSet result = commandGetData.getResultSet();//Возвращение данных
        
        while (result.next()) {

    	   saraAge = result.getInt("age");
        }
        
        commandGetData.close();
        result.close();
        
        connection.close();

        System.out.println("saraAge = " + saraAge);
	}
	
    public static void tablePrint(Connection connection) throws SQLException {//Вывод БД в консоль
    	
		Statement commandPrint = connection.createStatement();

        ResultSet result = commandPrint.executeQuery("SELECT * FROM test1");
        
        while (result.next()) {
        	
            String str = result.getString("id") + " | " + result.getString("name") + "\t | " + result.getString("age");
            
            System.out.println(str);
        }
        
        commandPrint.close();
        result.close();
        
        System.out.println("-------------------------------------------------------");
    }
}
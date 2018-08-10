package javaApplication;

public class MainApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {		
		System.out.println("Hello World");
		
		DatabaseConnection databaseConn = new DatabaseConnection();
		
		databaseConn.createTables();
		//databaseConn.usersTable.insertUser("Pawel", "Musial", 26, "726384938", "pawcio16m@gmail.com", "Kraków");
		databaseConn.usersTable.printAllUsers();
		databaseConn.closeConnection();
	}

}

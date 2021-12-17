package users;

public class Supersafeuserslog {
	// list of users.
	// this is where you might put a database connection

	private static String users[] = { "Bob", "Marcus" };

	private static String password[] = { "admin1", "admin2" };

	public static String[] getUsers() {
		return users;
	}

	public static String[] getPassword() {
		return password;
	}

}

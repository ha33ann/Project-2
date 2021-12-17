package beans;

import users.Supersafeuserslog;

public class UserBean {
	private String name, password, age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getage() {
		return age;
	}

	public void setage(String age) {
		this.age = age;
	}

	public boolean validate() {
		// Check if username and password matches the list of users.
		for (int i = 0; i < Supersafeuserslog.getUsers().length; i++) {

			// check the if the info is correct
			if (name.equals(Supersafeuserslog.getUsers()[0]) && password.equals(Supersafeuserslog.getPassword()[0])) {
				return true;
				
			}
			else if (name.equals(Supersafeuserslog.getUsers()[1]) && password.equals(Supersafeuserslog.getPassword()[1])) {
				return true;
			}
		}
		return false;
	}
	public void resetUserBean() {
		this.password = null;
		this.name = null;
	}
}

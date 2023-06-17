public class User extends UserSave{
	public User(String name, String surname) {
		super(name, surname);
	}
	public void report() {
		System.out.println("Report for user: " + getName() + " " + getSurname());
	}
}
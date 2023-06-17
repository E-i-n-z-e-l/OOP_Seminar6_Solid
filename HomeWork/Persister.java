public class Persister extends UserSave{
	private UserSave user;

	public Persister(UserSave user) {
		super(user.getName(), user.getSurname());
		this.user = user;
	}

	public void save() {
		user.saveUser();
	}
}
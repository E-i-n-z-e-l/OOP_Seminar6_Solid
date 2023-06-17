public class UserSave implements SaveUser{
    private String name;
    private String surname;
    public UserSave(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    @Override
    public void saveUser() {
        save();
        System.out.println("Save user: " + name + " " + surname);
    }
    public void save() {
        // реализация сохранения
    }
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}


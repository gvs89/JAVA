package homework_4;

public interface UserController<T extends User> {
	void create(String surname, String firstname, String patronymic);
}

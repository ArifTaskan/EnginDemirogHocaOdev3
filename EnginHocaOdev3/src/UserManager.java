
public class UserManager {
	public void Add(User user) {
		System.out.println("Kayıt eklendi" + user.name);
	};
	
	public void Delete(User user) {
		System.out.println("Kayıt silindi" + user.name);
	};
}

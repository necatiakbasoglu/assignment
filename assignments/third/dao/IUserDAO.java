package dao;

import model.Login;
import model.User;

public interface IUserDAO {
	public void registerUser(User user);
	public User validateUser(Login login);
}

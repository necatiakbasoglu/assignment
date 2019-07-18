package dao;

import java.util.Date;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import model.Login;
import model.User;

public class UserDAOImpl implements IUserDAO {
	
	@Autowired
	DataSource dataSource;
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public void registerUser(User user) {
		// TODO Auto-generated method stub
		String sqlQuery = "insert into users values(?,?,?,?,?,?)";
		jdbcTemplate.update(sqlQuery,new Object[] {
				user.getUserName(),user.getPassword(),user.geteMail(),new Date(),user.getSex()
		});

	}

	@Override
	public User validateUser(Login login) {
		// TODO Auto-generated method stub
		return null;
	}

}

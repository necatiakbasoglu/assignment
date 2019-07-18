package model;

public class User {
	private String userName;
	private String password;
	private String eMail;
	private Sex sex;
	
	
	public User() {
		userName="default";
		password="default";
		eMail="default";
		sex = Sex.FEMALE;
	}
	
	
	
	
	public User(String userName, String password, String eMail, Sex sex) {
		super();
		this.userName = userName;
		this.password = password;
		this.eMail = eMail;
		this.sex = sex;
	}


	@Override
	public String toString() {
		return "User [userName=" + userName + ", password=" + password + ", eMail=" + eMail + ", sex=" + sex + "]";
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public Sex getSex() {
		return sex;
	}
	public void setSex(Sex sex) {
		this.sex = sex;
	}
	
}

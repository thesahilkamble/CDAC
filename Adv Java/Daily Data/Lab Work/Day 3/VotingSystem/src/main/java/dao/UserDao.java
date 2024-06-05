package dao;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

import entities.User;

public interface UserDao {

	User SignIn(String mail, String pass) throws SQLException;

	List<User> getUserDetails(Date begin, Date end) throws SQLException;

	String voterRegistration(User newbie) throws SQLException;

	String changePassword(String email, String oldPwd, String newPwd) throws SQLException;

	String deleteVoterDetails(int voterId) throws SQLException;

}

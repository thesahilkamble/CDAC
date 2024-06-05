package dao;

import static DButils.DbConnection.*;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entities.User;

public class UserDaoImp implements UserDao {

	private Connection connection;
	private PreparedStatement p1, p2, p3, p4, p5;

	public UserDaoImp() throws SQLException {
		connection = openConnection();

		p1 = connection.prepareStatement("select * from users where email=? and password=?");
		p2 = connection.prepareStatement("select * from users where role='voter' and dob between ? and ?");
		p3 = connection.prepareStatement("insert into users values(default,?,?,?,?,?,?,?)");
		p4 = connection.prepareStatement("update users set password=? where email=? and password=? and role='voter'");
		p5 = connection.prepareStatement("Delete from users where id=?");

		System.out.println("user dao created...");

	}

	@Override
	public User SignIn(String mail, String pass) throws SQLException {

		p1.setString(1, mail);
		p1.setString(2, pass);

		try {
			ResultSet resultset = p1.executeQuery();

			if (resultset.next()) {
				return new User(resultset.getInt(1), resultset.getString(2), resultset.getString(3), mail, pass,
						resultset.getDate(6), resultset.getBoolean(7), resultset.getString(8));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public List<User> getUserDetails(Date begin, Date end) throws SQLException {

		List<User> users = new ArrayList<>();

		p2.setDate(1, begin);
		p2.setDate(2, end);

		try (ResultSet rst = p2.executeQuery()) {

			users.add(new User(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5),
					rst.getDate(6), rst.getBoolean(7), rst.getString(8)));
		}

		return users;
	}

	@Override
	public String changePassword(String email, String oldPwd, String newPwd) throws SQLException {

		p4.setString(1, newPwd);
		p4.setString(2, email);
		p4.setString(3, oldPwd);

		int num = p4.executeUpdate();
		if (num == 1)
			return "Password Changed !";
		return "Changing password  failed(invalid credentials or role )!!!!";

	}

	@Override
	public String deleteVoterDetails(int voterId) throws SQLException {
		p5.setInt(1, voterId);

		int rows = p5.executeUpdate();
		if (rows == 0)
			return "Voter Dead ";
		return "Voter id deleted ";

	}

	@Override
	public String voterRegistration(User newbie) throws SQLException {
		p3.setString(1, newbie.getFirstName());
		p3.setString(2, newbie.getLastName());
		p3.setString(3, newbie.getEmail());
		p3.setString(4, newbie.getPassword());
		p3.setDate(5, newbie.getDob());
		p3.setBoolean(6, newbie.isStatus());
		p3.setString(7, newbie.getRole());

		int rows = p3.executeUpdate();
		if (rows == 1)
			return "Voter registered....";
		return "Voter registration failed !";

	}
	
	public void cleanUp() throws SQLException
	{
		if(p1!=null)
		p1.close();
		
		if(p2!=null)
			p2.close();
		if(p3!=null)
			p3.close();
		if(p4!=null)
			p4.close();
		if(p5!=null)
			p5.close();
		
		closeConnection();
		
		
		
	}

}

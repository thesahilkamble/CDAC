package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.mysql.cj.protocol.Resultset;

import static DButils.DbConnection.*;
import entities.Candidate;

public class CandidatelistImp implements Candidatelist {

	private Connection connection;
	private PreparedStatement p1 , p2 , p4;
	
	public CandidatelistImp() throws SQLException {
	connection = openConnection();
	p1 = connection.prepareStatement("select * from candidates");
	p2 = connection.prepareStatement("update candidates set votes = votes + 1 where id = ?");
	p4 = connection.prepareStatement("select * from candidates order by votes desc limit 2");
	
		
	}
	@Override
	public List<Candidate> getAllCandidates() throws SQLException {
		List<Candidate> candidates = new ArrayList<>();
		
		try (ResultSet t = p1.executeQuery()) {
			while(t.next()) {
				candidates.add(new Candidate(t.getInt(1), t.getString(2), t.getString(3), t.getInt(4)));

			}
		}
		return candidates;
	} 

	@Override
	public String incrementCandidateVotes(int candidateId) throws SQLException {
		
		p2.setInt(1, candidateId);
		
		int updatecount = p2.executeUpdate();
		if(updatecount==1)
			return "votes updated!";
		return "Update failed";
	}

	@Override
	public Map<String, Integer> getPartyWiseVotes() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Candidate> getTop2Candidates() throws SQLException {
		List<Candidate> candidates = new ArrayList<>();

		try (ResultSet t = p4.executeQuery()) {
			while(t.next()) {
				candidates.add(new Candidate(t.getInt(1), t.getString(2), t.getString(3), t.getInt(4)));
}
		}
		return candidates;

}
}

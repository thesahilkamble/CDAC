package tester;
import dependency.CricketCoach;
import dependency.ScienceTeacher;
import dependent.PublicSchool;

public class TestSchool {

	public static void main(String[] args) {
		PublicSchool mySch = new PublicSchool(new ScienceTeacher());
		mySch.manageAcademics();
		mySch.setSportsCoach(new CricketCoach());
		mySch.organizeSportsEvent();
		
	}

}
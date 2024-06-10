package dependent;

import dependency.Coach;
import dependency.Teacher;

public class PublicSchool implements School {	
	private Teacher subjectTeacher; // = new MathsTeacher();
	private Coach sportsCoach;
	// Ctor Based D.I (Dependency Injection)
	//DI = making the dependency available to dependent obj. directly at runtime.
	public PublicSchool(Teacher teacher) {
		this.subjectTeacher = teacher;
		System.out.println("In constructor - " + getClass());
	}

	public PublicSchool(Coach coach) {
		this.sportsCoach = coach;
		System.out.println("In Ctor 2" + getClass());
		
	}

	@Override
	public void manageAcademics() {
		System.out.println("Managing academics here -");
		subjectTeacher.teach();
	}

	@Override
	public void organizeSportsEvent() {
		System.out.println("Managing Sports Event");
		System.out.println(sportsCoach.getDailyWorkout());
	}


	public void setSportsCoach(Coach sportsCoach) {
		this.sportsCoach = sportsCoach;
	}
	

}

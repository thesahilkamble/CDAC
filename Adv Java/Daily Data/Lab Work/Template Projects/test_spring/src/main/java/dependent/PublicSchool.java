package dependent;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import dependency.Coach;
import dependency.Teacher;

// Singleton and Eager
@Component("my_school") //giving Id to the class
public class PublicSchool implements School {	
	@Autowired //Field level D.I = byType if not mentioned
	@Qualifier("scienceTeacher") // not yet created 
	private Teacher subjectTeacher; // = new MathsTeacher();
	@Autowired //Field level D.I = byType if not mentioned
	@Qualifier("cricket")
	private Coach sportsCoach;
	// Ctor Based D.I (Dependency Injection)
	//DI = making the dependency available to dependent obj. directly at runtime.
	
	public PublicSchool() {
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
	
// custom init & destro
	
	@PostConstruct
	public void anyInit() {
		System.out.println("in INIT");
	}
	
	@PreDestroy
	public void anyDestroy() {
	System.out.println("in Destro");	
	}
	
}

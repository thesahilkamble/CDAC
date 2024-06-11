package dependency;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
//prototype and derived bean id
@Component
@Scope(value = "prototype")
//
//<bean id = "footbalCoach" class ="dependency.FootballCoach" Scope = "prototype"/>
public class FootballCoach implements Coach {

    public FootballCoach() {
    	System.out.println("In constructor - " + getClass());
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes in strength training n cardio";
    }
}

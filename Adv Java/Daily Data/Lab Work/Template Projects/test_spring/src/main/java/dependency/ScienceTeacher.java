package dependency;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component // to tell SC, Following is an ordinary spring bean
// manage it's life cycle
//make it available
@Scope(value = "prototype")
public class ScienceTeacher implements Teacher {
	public ScienceTeacher() {
		System.out.println("In constructor - " + getClass());
	}

	@Override
	public void teach() {
		System.out.println("Learn Science through experiments !");
	}

}

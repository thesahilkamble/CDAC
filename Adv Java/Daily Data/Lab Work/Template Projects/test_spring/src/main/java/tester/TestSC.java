package tester;

import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dependent.PublicSchool;

public class TestSC {

	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("bean-config.xml")) {
		System.out.println("SC up n running");
		
		PublicSchool myschool = ctx.getBean("my_school", PublicSchool.class);
		
		myschool.manageAcademics();
		myschool.organizeSportsEvent();
		
		PublicSchool myschool2 = ctx.getBean("my_school", PublicSchool.class);
		
		myschool2.manageAcademics();
		myschool2.organizeSportsEvent();
		
		} catch (BeansException e) {
			e.printStackTrace();
		}

	}

}

package tester;

import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSC {

	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("bean-config")) {
		System.out.println("SC up n running");
		
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

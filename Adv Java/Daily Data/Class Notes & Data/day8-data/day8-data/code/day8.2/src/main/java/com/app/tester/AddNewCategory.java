package com.app.tester;

import static com.app.utils.HibernateUtils.getFactory;

import java.util.Scanner;

import org.hibernate.SessionFactory;

import com.app.dao.CategoryDao;
import com.app.dao.CategoryDaoImpl;
import com.app.entities.Category;

public class AddNewCategory {

	public static void main(String[] args) {
		try (SessionFactory sf = getFactory();
				Scanner sc=new Scanner(System.in)) {
			CategoryDao dao=new CategoryDaoImpl();
			System.out.println("Enter new category details - nm desc");
			System.out.println(dao.addNewCategory(new Category
					(sc.next(), sc.next())));
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

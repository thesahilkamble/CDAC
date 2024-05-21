package tester;

import java.time.LocalDate;
import java.util.Scanner;

import utils.VehicleValidationRules;
import static utils.VehicleValidationRules.*;

public class TestValidateSpeed {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter current speed");
			validateSpeed(sc.nextInt());

			System.out.println("Enter Fuel Type");
			validateFuel(sc.next());

			System.out.println("Enter Licence Expiry Date");
			LocalDate dob = LocalDate.parse(sc.next());
			VehicleValidationRules.validateLicence(dob);

		}

		catch (Exception e) {
			System.out.println(e);
		}

	}

}

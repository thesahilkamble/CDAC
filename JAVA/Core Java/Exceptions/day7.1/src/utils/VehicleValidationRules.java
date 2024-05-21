package utils;

import custom_exceptions.SpeedOutOfRangeException;
import java.time.LocalDate;
import java.time.chrono.ChronoPeriod;
import custom_exceptions.ExpireLicenceException;
import custom_exceptions.FuelTypeException;

public class VehicleValidationRules {
	// add speed limits as constants
	public static final int MIN_SPEED;
	public static final int MAX_SPEED;
	static {
		MIN_SPEED = 30;
		MAX_SPEED = 60;
	}

	public static void validateSpeed(int speed) throws SpeedOutOfRangeException {
		if (speed < MIN_SPEED)
			throw new SpeedOutOfRangeException("Speed too low !!!!");
		if (speed > MAX_SPEED)
			throw new SpeedOutOfRangeException("Speed too high , FATAL !!!!");
		System.out.println("speed within range");
	}

	public static void validateFuel(String s) throws FuelTypeException {
		if (s.equalsIgnoreCase("Petrol") || s.equalsIgnoreCase("CNG") || s.equalsIgnoreCase("EV")) {
			System.out.println("Tank Full!");

		} else {
			throw new FuelTypeException("Invalid Fuel Type");

		}

	}

	public static void validateLicence(LocalDate dob) throws ExpireLicenceException {
		if (dob.isAfter(LocalDate.now())) {

		ChronoPeriod dob2 = ChronoPeriod.between( dob , LocalDate.now());
		
		System.out.println(dob2);

			System.out.println("Licence is Valid");

		} else {
			throw new ExpireLicenceException("Licence is expired!!");

		}
	}
}

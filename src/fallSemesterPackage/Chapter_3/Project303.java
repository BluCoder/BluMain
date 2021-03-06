package fallSemesterPackage.Chapter_3;

import java.util.*;

public class Project303 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner (System.in);
		double mass;
		double velocity;
		double momentum;
		double time;
		double acceleration;
		double initialV;
		double kineticEnergy;
		boolean problemType;
		
		System.out.println("This program is designed to derive momentum and kinetic energy from mass, time, velocity, and acceleration.");
		System.out.println("The mass of the object in kilograms is:.. ");
		mass = reader.nextDouble();
		
		System.out.println("If velocity is known and acceleration is zero, type \"true\", if acceleration, initial velocity, and time are known, type \"false\":..");
		problemType = reader.nextBoolean();
		
		if (problemType == true) {
			System.out.println("The velocity of the object in meters per second is:.. ");
			velocity = reader.nextDouble();
		} else {
			System.out.println("The initial velocity of the object in meters per second is:.. ");
			initialV = reader.nextDouble();
			System.out.println("The time elapsed at constant acceleration in seconds is:.. ");
			time = reader.nextDouble();
			System.out.println("The constant acceleration of the object on the interval in meters per seconds squared is:.. ");
			acceleration = reader.nextDouble();
			velocity = initialV + (time * acceleration);
		}
		
		momentum = mass * velocity;
		kineticEnergy = 0.5 * momentum * velocity;
		
		System.out.println("The object's momentum is " +
							momentum + 
							" kilogram meters per second.");
		System.out.println("The object's kinetic energy is " + kineticEnergy + " kilogram meters squared per second squared.");
		
		reader.close();
	}

}

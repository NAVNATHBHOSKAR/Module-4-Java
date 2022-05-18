/*
Create a new Java class named Car that has the following private fields
⚫ year - The year field is an int that holds a car's year model (e.g. 2010)
⚫ make - The make field is a String object that holds the make of the car (e.g. "Porsche")
⚫ speed - The speed field is an double that holds a car's current speed (e.g. 25.0)

In addition, the Car class should have the following methods.
⚫ Constructor - The constructor should accept the car's year, make, and beginning speed as 
arguments
◆ These values should be used to initialize the Car's year, make, and speed fields
*/
class Car{
	private int year;
	private String make;
	private double speed;
	

	Car(int year, String make, double beg_speed){
		this.year=year;
		this.make=make;
		this.speed=beg_speed;
		
		
	}

	public int getYear(){
		return this.year;
	}
	public String getMake(){
		return this.make;
	}
	public double getSpeed(){
		return this.speed;
	}
	public void Accelerate(){
		 this.speed++;
	}
}






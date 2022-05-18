/*
c) Write a separate java class RaceTrack in a separate file with a main() method that
⚫ Create a new Car object (using the Car constructor method), passing in the year, make, and speed
⚫ Display the current status of the car object using the getter methods getYear(), getMake(), and
getSpeed()
⚫ Call the car's accelerate method and then re-display the car's speed using getSpeed()
*/


class Racetrack{


public static void main(String... args){

Car c1= new Car(2022,"TATA_Nexon",130.0);
Car c2= new Car(2021,"TATA_Altroz",105.0);
Car c3= new Car(2022,"Xuv",103.0);
System.out.println(c1.getYear()+" "+c1.getSpeed()+" "+c1.getMake());
System.out.println(c2.getYear()+" "+c2.getSpeed()+" "+c2.getMake());
System.out.println(c3.getYear()+" "+c3.getSpeed()+" "+c3.getMake());


c1.Accelerate();
c2.Accelerate();
c3.Accelerate();

System.out.println(c1.getSpeed());
System.out.println(c2.getSpeed());
System.out.println(c3.getSpeed());

}
}
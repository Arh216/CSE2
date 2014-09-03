//Ariana Hewitt
//CSE 002
//Lab2
//September 5, 2014
//This program will print the number of rotations of the front wheel of the bike
//As well as the minutes of each trip
//The distance of each trip
//And the distance for the two trips combined.
public class Cyclometer {
  //main method required for every Java program
  public static void main(String[] args) {
    //write down our input data
    int secsTrip1=480; // time in secs for trip 1
    int secsTrip2=3220; //time in secs for trip 2
    int countsTrip1=1561; //rotations for trip 1
    int countsTrip2=9037; //rotations for trip 2
    
//our intermediate variables and output data. Document!
    //all necessary for calculations of number of rotations
    double wheelDiameter=27.0, 
         PI= 3.14159, 
         feetPerMile=5280,
         inchesPerFoot=12,
         secondsPerMinute=60;
    double distanceTrip1, distanceTrip2, totalDistance; 
//will be names of equations
    
//Print out the input data.
    System.out.println("Trip 1 took "+
                       (secsTrip1/secondsPerMinute)+" minutes and had "
                            +countsTrip1+" counts.");
    System.out.println("Trip 2 took "+
                       (secsTrip2/secondsPerMinute)+" minutes and had "
                            +countsTrip2+" counts.");
    
    //Run the calculations; store the values.
    distanceTrip1 = countsTrip1*wheelDiameter*PI;// gives distance in inches
    //for each count, a rotation of the wheel travels 
    //the diameter in inches times PI
    distanceTrip1/= inchesPerFoot*feetPerMile; //distance in miles
    distanceTrip2 = countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
    totalDistance=distanceTrip1+distanceTrip2;
    
    //Print out the output data.
    System.out.println("Trip 1 was "+distanceTrip1+" miles"); 
    System.out.println("Trip 2 was "+distanceTrip2+" miles");
    System.out.println("The total distance was "+totalDistance+" miles");
  } //end of main method
}//end of class
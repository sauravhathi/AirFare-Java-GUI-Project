We want to provide a smooth transport experience for our audience. So we are developing an application for air transportation. Ther are 2 main companies that provide good services to our company. So let's create a program with the interface to show the fare details of these companies for traveling to different cities. Create AirFare as an interface and implement it in Indigo and AirIndia classes to show fair for requested travels.

Strictly adhere to the Object-Oriented specifications given in the problem statement. All class names, attribute names and method names should be the same as specified in the problem statement.

Create an interface AirFare with the following methods,

Method Description public Double showFare(String sourceCity, String destinationCity); An abstract method

Create a class Indigo which implements AirFare with the following methods,

Method Name Description public Double showFare(String sourceCity, String destinationCity) This method will get the sourceCity and destinationCity as arguments and get the fare between the cities and return the Fare between two cities. public Map<String, Double> getIndigoFares() This method will contain all the fare details between source and destination cities for Indigo. This method will be previously given in the template code.

Create a class AirIndia which implements AirFare with the following methods,

Method Name Description public Double showFare(String sourceCity, String destinationCity) This method will get the sourceCity and destinationCity as arguments and get the fare between the cities and return the Fare between two cities. public Map<String, Double> getAirIndiaFares() This method will contain all the fare details between source and destination cities for Air India. This method will be previously given in the template code.

Create a driver class Main to test the above classes.

Input Format: The first input is a string that corresponds to the source city. The second input is a String which corresponds to the destination city. The next input is an integer that corresponds to the airline type.

Output Format The output consists of the flight fare. Refer to sample output for formatting specifications.

Note: All text in bold corresponds to input and rest corresponds to output.

Sample Input and Output 1:

Enter the source city: LONDON Enter the destination city: NEWYORK Enter the flight 1.Air India 2.Indigo 2 The fare is 20125.0

Sample Input and Output 2:

Enter the source city: LONDON Enter the destination city: NEWYORK Enter the flight 1.Air India 2.Indigo 1 The fare is 21963.0

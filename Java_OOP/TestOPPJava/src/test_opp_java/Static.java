package test_opp_java;

public class Static {
  private int age;
  private String name;
  public  static int numberOfPeople = 0 ;
  //Constracter class
  public Static(String name , int age) {
	  this.name = name;
	  this.age = age ;
	  numberOfPeople++ ; 
  }
  
  public static int peopleCount() {
	  return numberOfPeople;
  }
  
  
}

package test_opp_java;

public class TestStatic {

	public static void main(String[] args) {
		
		Static person1 = new Static("Ali" , 20);		
		Static person2 = new Static("Ahmad" , 23);
		Static person3 = new Static("Omar" , 18);
		Static person4 = new Static("Omar" , 18);
		Static person5 = new Static("Omar" , 18);
		Static person6 = new Static("Omar" , 18);
		
		System.out.println(Static.numberOfPeople);
		
	}

}

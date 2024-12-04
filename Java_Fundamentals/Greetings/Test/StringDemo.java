public class StringDemo{
  public static void main(String[] args){
    // String ninja = "AXSOS Academy is great!";
    // int length = ninja.length();
    // System.out.println("length: " + length);
    String firstName ="My name is ";
    String lastName = "Ali Yahya ";
    String numPhone = " 098765543221";
    String fullName = firstName.concat(lastName.concat(numPhone));
    System.out.println("Full Name: " + fullName);
    String developer = String.format("Hi %s, you owe me $%.2f !", "Sara", 25.0);
    System.out.println(developer);
    int theNumber = fullName.indexOf("Yahya");
    int theAnotherNumber=firstName.indexOf("t");
    System.out.println("Index of Yahya: " + theNumber);
    System.out.println(theAnotherNumber);
    String sentence = "   spaces everywhere!   ";
    System.out.println(sentence);
    System.out.println(sentence.trim());
    String a = new String( "Academy" );
    System.out.println( a.equals("Academy") );
    // surprisingly this will print out `false`
  }


}

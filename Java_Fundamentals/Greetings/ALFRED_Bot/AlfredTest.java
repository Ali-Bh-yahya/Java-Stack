
public class AlfredTest {
    /*
    * This main method will always be the launch point for a Java application
    * For now, we are using the main to test all our 
    * AlfredQuotes methods.
    */
    public static void main(String[] args) {
        // Make an instance of AlfredQuotes to access all its methods.
        AlfredQuotes AlfredQuotes = new AlfredQuotes();
        
        // Make some test greetings, providing any necessary data
        String testGreeting = AlfredQuotes.basicGreeting();
        String testGuestGreeting = AlfredQuotes.guestGreeting("Ali");
        String testDateAnnouncement = AlfredQuotes.dateAnnouncement();
        
        String alexisTest = AlfredQuotes.respondBeforeAlexis("Alexis! Play some low-fi beats.");
        String alfredTest = AlfredQuotes.respondBeforeAlexis("I can't find my yo-yo. Maybe Alfred will know where it is.");
        String notRelevantTest = AlfredQuotes.respondBeforeAlexis("Maybe that's what Batman is about. Not winning. But failing..");
        
        // Print the greetings to test.
        System.out.println(testGreeting);
        
        // Uncomment these one at a time as you implement each method.
         System.out.println(testGuestGreeting);
         System.out.println(testDateAnnouncement);
         System.out.println(alexisTest);
         System.out.println(alfredTest);
         System.out.println(notRelevantTest);
    }
}
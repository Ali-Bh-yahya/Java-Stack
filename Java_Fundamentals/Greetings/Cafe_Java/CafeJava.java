public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        // double mochaPrice = 3.5;
        double cppuccionPrice=4.0;
        // double coffePrice=2.0;
        double lattePrice=4.5;
        // Customer name variables (add yours below)
        String customer1 = "Shatha";
        String customer2="Ahmad";
        String customer3="Sali";
        String customer4="adam";
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3=false;
        boolean isReadyOrder4=true;
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example: 
        if(isReadyOrder1) {
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Shatha"
        }
        else{
            System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Shatha"
        }
        // ** Your customer interaction print statements will go here ** //
        //Sali's order
        if (isReadyOrder3){
            System.out.println(customer3+" "+readyMessage);
        }
        else{
            System.out.println(customer3+" "+pendingMessage);
        }
        //Ahmad's order 
        if(isReadyOrder2){
            System.out.println(customer2+" "+readyMessage + " " + displayTotalMessage + " " + cppuccionPrice);
        }
        else{
            System.out.println(customer2+" "+pendingMessage);
        }
        //Adam's order 
        if(isReadyOrder4){
            System.out.println(customer4+" "+readyMessage+" "+ displayTotalMessage+" "+ lattePrice);
        }
        else{
            System.out.println(customer4+" "+pendingMessage);
        }
        
 }
}
public class ConditionalsAndOperators {
    public static void main(String[] args) {    
        // Predict the output and run the code to check your prediction
  
        int temperature = 89;
        boolean isCloudy = false;
  
        if(temperature < 40 && isCloudy){
          System.out.println("It might snow.");
        }else if(isCloudy){
          System.out.println("It might rain.");
        }else{
          System.out.println("We should have nice weather today.");
        }
        
    }
}
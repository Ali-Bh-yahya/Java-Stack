public class CafeUtill{
  public static getStreakGoal(int n){
    int sum = 0;
    for(int i=0 ; i<n ; i++){
      sum +=i;
    }
    // i can solve it in another way use this formula 
    // return (n*(n+1))/2; 
    return sum;
  }
}
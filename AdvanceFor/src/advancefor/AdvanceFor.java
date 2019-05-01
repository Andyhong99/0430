
package advancefor;


public class AdvanceFor {

   
    public static void main(String[] args) {
        int[] scores = {95, 71, 84, 93, 87};
        
        int sum=0;
        for(int score : scores){
        sum = sum + score;
        }
        System.out.println("Sum:" + sum);
        double avg = (double) sum / scores.length;
        System.out.println("Total average : " + avg);
    }
    
}

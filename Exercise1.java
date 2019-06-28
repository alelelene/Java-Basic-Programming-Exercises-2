
public class Exercise1{
    public static void main (String[] args) {
       int[] val = {0, 1, 2, 3};
       int sum = 0;
       
       for (int num : val){
           sum = sum + num;
       } 
       System.out.println("Sum of array elements is:"+sum);
    }
}
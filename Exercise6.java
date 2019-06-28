public class Exercise6
{
	public static void main(String[] args) {
	    int[] data = {3, 2, 5, 7, 9, 12, 97, 24, 54};
	    int even = 0;
	    int odd = 0;
	    int sum = 0;
	    
	    for(int i = 0; i < data.length; i++){
            
            if ( data[i] % 2 == 0){
                even = even + data[i];
            } else if (data[i] % 2 == 1){
                odd = odd + data[i];
            } 
            
            sum = sum + data[i];
            
        }
        System.out.println( "Sum of even: \n" + even);
        System.out.println( "Sum of odd: \n" + odd);
        System.out.println( "Sum of all elements: \n" + sum);
        
	    
	}
}
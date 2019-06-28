public class Exercise3
{
	public static void main(String[] args) {
	    int[] valA = {13, -22, 82, 17};
	    int[] valB = {-12, 24, -79, -13};
	    int[] sum = new int[valA.length];
	    
	    
	    for (int i = 0; i < valA.length; i++){
	        sum[i] = valA[i] + valB[i];
	    }
	    
	    System.out.println("sum: " + sum[0] + " " + sum[1] + " " 
	    + sum[2] + " " + sum[3] );
	}
}
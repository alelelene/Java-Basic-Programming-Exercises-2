import java.io.*;

public class Exercise7
{
	public static void main(String[] args) throws IOException{
		int[] data = {3, 1, 5, 7, 4, 12, -3, 8, -2};
	    int firstLargest = 0;
		int secondLargest = 0;
		
		for(int index = 0; index < data.length; index++){
		    if (firstLargest < data[index]){
		        secondLargest = firstLargest;
		        firstLargest = data[index];
		        
		    }else if(secondLargest < data[index]){
		        secondLargest = data[index];
		    }
		    
		}
		
		System.out.println("The largest number is: " + firstLargest);
		System.out.println("The second largest number is: " + secondLargest);
	}
}

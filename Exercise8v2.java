
import java.io.*;
public class Exercise8v2
{
	public static void main(String[] args)  throws IOException{
		int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
		int[] result = new int[data.length];
		
		for(int i = 0; i < data.length; i++){
		    result[i] = data[data.length - i - 1];
		    }
        
        System.out.println("Reverser version 2: ");
        for (int i = 0; i < data.length; i++){
            System.out.print(result[i] + " ");
         }
       
	}
}

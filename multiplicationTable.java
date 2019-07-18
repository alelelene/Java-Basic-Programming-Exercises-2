import java.io.*;
public class Main 
{
    public static void main(String[] args)  throws Exception
    {
        
    try{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.print("Enter number of rows: ");     
	int rows = Integer.parseInt(br.readline());
	
	System.out.print("Enter number of columns: ");
	int col = Integer.parseInt(br.readline());
	int n = 0;
	
	    for(int i=1; i <= col; i++)
	    {
	        n = i;
            for(int j=1; j <= rows; j++)
            {
            System.out.println(n+" * "+j+" = "+n*j);
            }
	    }
	    
    }catch(Exception e){
        System.out.print("Invalid input!");
    }
    }
}

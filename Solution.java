import java.util.*;
public class Hello {

    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] matrix = new int[n][n];
		
		//getting input from the user
		for(int i=0;i<n;i++)
		for(int j=0;j<n;j++)
		    matrix[i][j]=sc.nextInt();
		
		//start row from the max n
		for(int i=n-1;i>=0;i--)
		{
		    for(int j=0;j<n;j++)
		    {
		        System.out.print(matrix[i][j]+" ");
		    }
		    System.out.println();
		}

	}
}

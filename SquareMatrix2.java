package samples;

import java.util.Scanner;

public class SquareMatrix2 {
public static void main(String args[]) {
	int n,temp;
	
	String rc;
	Scanner sc=new Scanner(System.in);
	n=Integer.parseInt(sc.nextLine());
	int a[][]=new int[n][n];
	for(int i=0;i<n;i++) {
		String valuesarr[]=sc.nextLine().split(",");
		for(int j=0;j<n;j++) {
			
			a[i][j]=Integer.parseInt(valuesarr[j]);
		}
	}
	rc=sc.next();
	switch(rc) {
	case "column":
		 for(int i = 0; i < n; i++)
         {
             temp = a[i][(n-2)];
             a[i][n-2] = a[i][(n-n)];
             a[i][n-n] = a[i][n-1];
             a[i][n-1]=temp;
         }
		
		for(int i=0;i<n;i++) {
			String comma="";
			for(int j=0;j<n;j++) {
				
				System.out.print(comma+a[i][j]);
				comma=",";
			}
			System.out.println("");
		}
		break;
	case "row":
		
		for(int i = 0; i < n; i++)
        {
            temp = a[(n-2)][i];
            a[n-2][i] = a[n-n][i];
            a[n-n][i]=a[n-1][i];
            a[n-1][i] = temp;
        }
		 
		 for(int i=0;i<n;i++) {
			 String comma="";
				for(int j=0;j<n;j++) {
					
					System.out.print(comma+a[i][j]);
				comma=",";
				}
				System.out.println("");
			}
		 break;
	}
	
	
	
	sc.close();
}
}

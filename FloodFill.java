

import java.util.*;
import java.lang.*;
import java.io.*;

class FloodFill {
    public static void Niqqa(int [][]arr,int x,int y,int k,int g,int s,int d)
    {
        if(x<0 ||x>=s ||y<0||y>=d)
            return;
            
        if(arr[x][y]!=g)
            return;
        
        arr[x][y]=k;
        Niqqa(arr,x-1,y,k,g,s,d);
        Niqqa(arr,x+1,y,k,g,s,d);
        Niqqa(arr,x,y-1,k,g,s,d);
        Niqqa(arr,x,y+1,k,g,s,d);
        
        
    }
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T>0)
		{
		    int  s=sc.nextInt();
		    int d=sc.nextInt();
		   int [][] arr=new int[s][d];
		    for(int i=0;i<s;i++)
		    {
		        for(int j=0;j<d;j++)
		        {
		            int n=sc.nextInt();
		            //System.out.println(n);
		            arr[i][j]=n;
		        }
		    }
		    int x=sc.nextInt();
		    int y=sc.nextInt();
		    int k=sc.nextInt();
		    int g=arr[x][y];
		    Niqqa(arr,x,y,k,g,s,d);
		    
		    for(int i=0;i<s;i++)
		    {
		     for(int j=0;j<d;j++)
		     {
		         System.out.print(arr[i][j]+" ");
		     }
		    }
		    
		    System.out.println();
		    T--;
		}
	}
}

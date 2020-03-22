

import java.util.*;
import java.lang.*;
import java.io.*;

class countone {
    static int count,R,C;
    public static boolean isSafe(int r, int c ,boolean[][] visited,int [][]arr)
    {
        
        return ((r>=0)&&(r<R)&&(c>=0)&&(c<C)&&(arr[r][c]==1)&&(!visited[r][c]));
        
        
        
    }
    public static void DFS(int x,int y, int [][]arr,boolean[][]visited)
    {
        int[] rowNbr = {-1, -1, -1, 0, 0, 1, 1, 1}; 
        int[] colNbr = {-1, 0, 1, -1, 1, -1, 0, 1}; 
        visited[x][y]=true;
        
        for(int k=0;k<8;k++)
        {
            if(isSafe(x+rowNbr[k],y+colNbr[k],visited,arr))
                
            {
                count++;
                DFS(x+rowNbr[k],y+colNbr[k],arr,visited);
            }
        }
        
        
        
    }
    public static int Maxreg(int [][]arr)
    {
        boolean [][]visited=new boolean[R][C];
        int result=0;
        for(int i=0;i<R;i++)
        {
            for(int j=0;j<C;j++)
            {
                if(arr[i][j]==1 && !visited[i][j])
                {
                    count=1;
                    DFS(i,j,arr,visited);
                    
                    result=Math.max(result,count);
                }
            }
        }
        return result;
        
        
        
    }
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T>0)
		{
		    int m=sc.nextInt();
		    int n=sc.nextInt();
		    R=m;
		    C=n;
		    int [][]arr=new int[m][n];
		    for(int i=0;i<m;i++)
		    {
		        for(int j=0;j<n;j++)
		        {
		            int a=sc.nextInt();
		            arr[i][j]=a;
		        }
		    }
		    
		    int res=Maxreg(arr);
		    System.out.println(res);
		    
		    
		    
		    T--;
		}
	}
}

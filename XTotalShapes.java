

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    static int R,C;
    public static boolean isSafe(int x,int y,char[][]arr,boolean[][] visited)
    {
        return((x>=0)&&(x<R)&&(y>=0)&&(y<C)&&(arr[x][y]=='X')&&(!visited[x][y]));
        
    }
    public static void DFS(int x, int y,char[][]arr,boolean[][]visited)
    {
        visited[x][y]=true;
        int[]row={-1,1,0,0};
        int [] col={0,0,-1,1};
        
        for(int k=0;k<4;k++)
        {
            if(isSafe(x+row[k],y+col[k],arr,visited))
            {
                DFS(x+row[k],y+col[k],arr,visited);
            }
        }

        
    }
    public static int Maxre(char[][]arr)
    {
        
        boolean[][] visited =new boolean[R][C];
        int count=0;
        for(int i=0;i<R;i++)
        {
            for(int j=0;j<C;j++)
            {
                if(arr[i][j]=='X' &&!visited[i][j])
                {
                    //count++;
                    DFS(i,j,arr,visited);
                    count++;
                }
                
            }
        }
        return count;
        
        
    }
	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T>0)
		{
		    int m=sc.nextInt();
		    int n=sc.nextInt();
		    R=m;
		    C=n;
		    
		    char[][] ch=new char[m][n];
		    for(int i=0;i<m;i++)
		    {
		        String s=sc.next();
		        for(int j=0;j<n;j++)
		        {
		            //System.out.print(s.charAt(j)+" ");
		            ch[i][j]=s.charAt(j);
		        }
		    }
		    int res=Maxre(ch);
		    System.out.println(res);
		    
		    
		    
		    T--;
		}
	}
}

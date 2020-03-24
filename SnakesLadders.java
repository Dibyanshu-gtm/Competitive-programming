/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class SnakesLadders{
    static public int result=30,count=0;
    static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;
        
        FastReader()
        {
            br=new BufferedReader(new InputStreamReader(System.in));
        }
        String next()
        {
            while(st==null||!st.hasMoreElements())
            {
                try
                {
                    st=new StringTokenizer(br.readLine());
                }
                catch(IOException e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt()
        {
            return Integer.parseInt(next());
        }
    }
    static class qentry
    {
        int v;
        int dest;
    }
    static int BFSex(int arr[],int n)
    {
        int []visited=new int [n+1];
        Queue<qentry>q=new LinkedList<>();
        qentry qe=new qentry();
        qe.v=1;
        qe.dest=0;
        
        q.add(qe);
        while(!q.isEmpty())
        {
            qe=q.remove();
            int v=qe.v;
            
            if(v==n)
                 break;
            for(int j=v+1;j<=v+6 &&j<=n;++j)
            {
                if(visited[j]==0)
                {
                    qentry a=new qentry();
                    a.dest=(qe.dest+1);
                    visited[j]=1;
                    
                    if(arr[j]!=-1)
                    {
                        a.v=arr[j];
                    }
                    else
                        a.v=j;
                    q.add(a);
                }
            }
        }
        return qe.dest;
        
    }
    
	public static void main (String[] args) {
		FastReader sc=new FastReader();
		int T=sc.nextInt();
		while(T>0)
		{
		    int n=sc.nextInt();
		   int []arr=new int[31];
		   for(int i=0;i<=30;i++)
		   {
		       arr[i]=-1;
		   }
		    for(int i=0;i<n;i++)
		    {
		        int s=sc.nextInt();
		        int d=sc.nextInt();
		        arr[s]=d;
		    }
		    int res=BFSex(arr,30);
		    System.out.println(res);
		    T--;
		}
	}
}

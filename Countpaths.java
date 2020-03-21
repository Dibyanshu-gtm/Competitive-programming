/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    static int t=0;
    static void DFS(int a,LinkedList<Integer>adj[],int b,boolean visited[])
    {
        
        int count=0;
        DFSUtil(a,adj,b,visited,count);
        //System.out.println("Hello"+count);
        
        
    }
    static void DFSUtil(int a,LinkedList<Integer>adj[],int b,boolean visited[],int count)
    {
        visited[a]=true;
        //System.out.println("reaching"+a);
        if(a==b)
        {
            //System.out.print("Yes");
            //count++;
            t++;
        }
        //System.out.println(count);
        Iterator<Integer>it=adj[a].listIterator();
        while(it.hasNext())
        {
            int n=it.next();
            if(!visited[n])
            {
                DFSUtil(n,adj,b,visited,count);
            }
        }
        visited[a]=false;
        
        
        
    }
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T>0)
		{
		    
		    int V=sc.nextInt();
		    int E=sc.nextInt();
		    boolean visited[]=new boolean[V];
		    LinkedList<Integer>adj[]=new LinkedList[V];
		    for(int i=0;i<V;i++)
		    {
		        adj[i]=new LinkedList();
		    }
		    for(int i=0;i<E;i++)
		    {
		        int s=sc.nextInt();
		        int d=sc.nextInt();
		        adj[s].add(d);
		    }
		    int a=sc.nextInt();
		    int b=sc.nextInt();
		    DFS(a,adj,b,visited);
		    System.out.println(t);
		    t=0;
		    
		    
		    T--;
		}
	}
}

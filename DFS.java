import java.util.*;

public class Main {
    
    
    
    int V;
    LinkedList<Integer>adj[];
    
    Main(int v)
    {
        V=v;
        adj=new LinkedList[v];
        for(int i=0;i<v;i++)
        {
            adj[i]=new LinkedList();
        }
    }
    
    
    void addEdge(int v,int w)
    {
        adj[v].add(w);
    }
    
    void BFS(int s)
    {
        
        boolean visited[]=new boolean[V];
        LinkedList<Integer>q=new LinkedList<Integer>();
        q.add(s);
        visited[s]=true;
        while(q.size()!=0)
        {
            s=q.poll();
            System.out.print(s+" ");
            
            Iterator<Integer>it=adj[s].listIterator();
            while(it.hasNext())
            {
                int n=it.next();
                if(!visited[n])
                {
                    visited[n]=true;
                    q.add(n);
                }
            }
            
            
        }
    }
    void DFSUtil(int v,boolean visited[])
    {
        
        visited[v]=true;
        System.out.print(v+" ");
        Iterator<Integer> its=adj[v].listIterator();
        while(its.hasNext())
        {
           int n=its.next();
           if(!visited[n])
           {
               DFSUtil(n,visited);
           }
        }
        
        
    }
    void DFS(int s)
    {
        
        boolean visited[]=new boolean [V];
        DFSUtil(s,visited);
        
        
        
        
        
        
    }
    public static void main(String[] args) throws Exception {
        // Your code here!
        Main g=new Main(4);
        g.addEdge(0, 1); 
        g.addEdge(0, 2); 
        g.addEdge(1, 2); 
        g.addEdge(2, 0); 
        g.addEdge(2, 3); 
        g.addEdge(3, 3); 
        
        
        g.BFS(2);
        
        System.out.println("XXXXXXXX");
        g.DFS(2);
    }
}

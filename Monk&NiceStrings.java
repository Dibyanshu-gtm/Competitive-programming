
import java.util.*;


class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
        String[] arr=new String[n];
       
        for(int i=0;i<n;i++)
        {
           arr[i]=sc.next();
            
        }
        int j,c;
        for(int i=0;i<n;i++)
        {
            j=i;
            c=0;
            while(j>=0)
            {
                if(arr[i].compareTo(arr[j])>0)
                {
                    c++;
                }
                j--;
            }
            System.out.println(c);
        }
        
       
    }
}

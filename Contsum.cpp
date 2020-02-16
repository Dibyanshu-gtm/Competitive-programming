#include <iostream>
using namespace std;

int main() {
	int t;
	cin>>t;
	while(t--)
	{
	    int n;
	    cin>>n;
	    int i=1;
	    int sum=0;
	    int c=0;
	    int last=1;
	    while(i<n)
	    {
	        if(sum<n)
	        {
	           //cout<<sum<<"+"<<i<<" ";
	            sum=sum+i;
	             //cout<<sum<<" "<<endl;
	             i++;
	        }
	        else if(sum==n)
	        {
	            c++;
	            //cout<<sum<<"-last"<<i<<" ";
	            sum=sum-last;
	            last++;
	            //cout<<sum<<" "<<endl;
	        }
	        else
	        {
	            //cout<<sum<<"-last"<<i<<" ";
	            sum=sum-last;
	            //cout<<sum<<" "<<endl;
	            last++;
	            
	        }
	        
	        
	    }
	    cout<<c<<endl;
	}
	return 0;
}

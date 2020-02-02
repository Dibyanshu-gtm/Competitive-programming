#include <iostream>
using namespace std;

int main() {
	int t;
	cin>>t;
	while(t--)
	{
	    int a;
	    cin>>a;
	    int num=a;
	    string s;
	    while(num>0)
	    {
	        num--;
	        s=(char)(num%26+'A')+s;
	        num=num/26;
	    }
	    cout<<s<<endl;
	    
	}
	return 0;
}

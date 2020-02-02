#include <iostream>
#include<bits/stdc++.h>
using namespace std;

int main() {
	int t;
	cin>>t;
	while(t--)
	{
	    string a;
	    cin>>a;
	    long d=0;
	    int g=0;
	    for(int i=a.length()-1;i>=0;i--)
	    {
	        int t=(a[i]-'A')+1;
	        //cout<<t;
	        d=d+(pow(26,g)*t);
	        
	        g++;
	    }
	    cout<<d<<endl;
	}
	return 0;
}

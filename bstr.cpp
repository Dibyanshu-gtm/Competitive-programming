//Program to get the No of subtrings that start with 1 and end with 1

#include <iostream>
#include<bits/stdc++.h>
using namespace std;

int main() {
	int t;
	cin>>t;
	while(t--)
	{
	    int n;
	    cin>>n;
	    string s;
	    cin>>s;
	    int c=0;
	    for(int i=0;i<n;i++)
	    {
	        if(s[i]=='1')
	        {
	            for(int j=i+1;j<n;j++)
	            {
	                if(s[j]=='1')
	                {
	                    c++;
	                }
	            }
	        }
	    }
	    cout<<c<<endl;
	    
	}
	return 0;
}

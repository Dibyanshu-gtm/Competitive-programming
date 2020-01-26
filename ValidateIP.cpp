#include <iostream>
#include <bits/stdc++.h>
#include <string.h>
using namespace std;

int main() {
    int q;
    cin>>q;
    while(q--)
    {
    string t;
    cin>>t;
    vector <string>tokens;
    stringstream chec1(t);
    string i;
    while(getline(chec1,i,'.'))
    {
        tokens.push_back(i);
    }
    int flag=0;
    for(int i=0;i<tokens.size();i++)
    {
        int n=tokens[i].length();
        
        if(n<=3 && tokens[i][0]!='0' && tokens.size()==4)
        {
            flag=1;
        }
        else
        {
            flag=0;
            break;
        }
        
    }
    cout<<flag<<endl;
    }
	return 0;
}

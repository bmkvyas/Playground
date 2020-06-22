#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  int num;
  cin>>num;
  int a,b,i,c;
  a=6;
  if(num==1)
    cout<<a<<" ";
  else 
  {
    cout<<a<<" ";
    for(i=2;i<=num;i++)
    {
      b=5*(i-1);
      c=a+b;
      cout<<c<<" ";
      a=c;
    }
  }
}

      
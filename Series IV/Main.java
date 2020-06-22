#include<iostream>
using namespace std;
int main()
{
int num;
  cin>>num;
  int b;
  for(int i=1;i<=num;i++)
  {
    b=i*i;
    if(b%2==0)
      cout<<b-2<<" ";
    else
      cout<<b-1<<" ";
  }
}
     
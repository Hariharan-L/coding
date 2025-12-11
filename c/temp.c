#include <stdio.h>
#include <stdlib.h>
int main()
{
  int n;
  scanf("%d",&n);
  int a[n];
  int l=0,flag=1;
  while(l!=n){
    int k;
    scanf("%d",&k);
    for(int j=0;j<n;j++){
      if(a[j]==k){
        flag=0;
        break;
      }
    }
    if(flag!=0){
      a[l]=k;
      l++;
    }
    else{
      flag=1;
      continue;
    }
  }
  for(int i=0;i<n;i++){
    printf("%d ",a[i]);
  }

  return 0;
}

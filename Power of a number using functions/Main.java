#include<stdio.h>
int power_of_a_number(int b, int e);
int main(){
    int b, e;
    scanf("%d%d", &b, &e);
    printf("%d", power_of_a_number(b, e));
  	return 0;
}

int power_of_a_number(int b, int e)
{
    int p = 1;
    while(e >= 1)
    {
        p = p * b;
        e--;
    }
    return p;
}

  

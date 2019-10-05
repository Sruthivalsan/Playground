#include <stdio.h>
int gcd_of_2_numbers(int n1, int n2);
int main() 
{
	int b1, b2, b3;
	scanf("%d%d%d", &b1, &b2, &b3);
	int r = gcd_of_2_numbers(b1, b2);
	printf("%d", gcd_of_2_numbers(r, b3));
	return 0;
}
int gcd_of_2_numbers(int b1, int b2)
{
    int min = 0, gcd = 0;
    if(b1 < b2)
    {
        min = b1;
    }
    else
    {
        min = b2;
    }
    while(min > 1)
    {
        if((b1 % min == 0) && (b2 % min == 0))
        {
            gcd = min;
            break;
        }
    }
    return gcd;
}

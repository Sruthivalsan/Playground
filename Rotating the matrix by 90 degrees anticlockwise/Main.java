#include <stdio.h>
int main()
{

int r,c;
    scanf("%d %d", &r, &c);
    int mtx[r][c];
    for(int i = 0; i < r; i++)
    {
       for(int j = 0; j < c; j++)
       {
           scanf("%d", &mtx[i][j]);
       }
    }
    for(int i = r - 1; i >= 0; i--)
    {
        for(int j = 0; j <= c-1; j++)
        {
         	printf("%d ", mtx[j][i]);
        }
        printf("\n");
    }
}
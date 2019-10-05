#include<stdio.h>
int main()
{
        int n;
        scanf("%d",&n);
        int arr[10];
        for(int idx = 0; idx <= n - 1; idx++)
        {
            scanf("%d",&arr[idx]);
        }
        int k;
        scanf("%d",&k);
        
        selection_sort(n, arr);
        printf("%d",arr[n-k]);
    return 0;
}
     void selection_sort(int n, int arr[])
    {
        for(int strt = 0; strt <= n - 2; strt++)
        {
            int min = find_minimun(strt, arr, n-1);
            swap(strt, min, arr);
        }
    }
      void swap(int strt, int min, int arr[])
      {
         int temp = arr[strt];
         arr[strt] = arr[min];
         arr[min] = temp;
     }
     int find_minimun(int strt, int arr[], int end)
     {
         int min = 0;
         if(arr[strt] < arr[strt + 1])
         {
             min = strt;
         }
         else
         {
             min = strt + 1;
         }
         for(int i = strt + 2; i <= end; i++)
         {
             if(arr[min] > arr[i])
             {
                 min = i;
             }
         }
         return min;
     }

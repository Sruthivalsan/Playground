#include<stdio.h>

void largest_elem(int list[],int s);


int main() {
   int s,list[10],i;
   
   scanf("%d",&s);

   for( i = 0; i < s ; i++)
   {
       scanf("%d",&list[i]);
   }
  
   largest_elem(list,s);
  
   return 0;  
}

 void largest_elem(int list[],int s)
 {
     int i, batch1_sum = 0, batch2_sum = 0;
     
     for( i = 0; i < s/2 ; i++)
     { 
       batch1_sum = batch1_sum + list[i];
      
     }  
    
     for( i = s/2; i < s ; i++)
     { 
       batch2_sum = batch2_sum + list[i];
      
     }  
     
     if(batch1_sum == batch2_sum)
     {
         printf("Perfect Batch" );
   
     }
     else
     {
         printf("Not a Perfect Batch");
     }
 }
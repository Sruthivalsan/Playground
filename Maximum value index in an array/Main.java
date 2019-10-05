#include<stdio.h>

void largest_elem_index(int l[],int s);


int main() {
   int s,l[10],i;
   scanf("%d",&s);
   for( i = 0; i < s ; i++)
   {
       scanf("%d",&l[i]);
   }
  
   largest_elem_index(l,s);
  
   return 0;  
}

 void largest_elem_index(int l[],int s)
 {
     int i,large ,max_idx;
     large = l[0];
     max_idx = 0 ;
     for( i = 1; i < s ; i++)
   { 
       if(large < l [i])
       {
           max_idx = i;
           
       }
      
   }  
   printf("%d",max_idx);
 }
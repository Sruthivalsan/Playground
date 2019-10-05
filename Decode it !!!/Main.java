#include<stdio.h>
int main()
{
    char strg[100], c;
    int i, key;
  
    scanf("%[^\n]s",strg);
    scanf("%d",&key);			
    key=key%26;
   
    for(i = 0; strg[i] != '\0';i++)		
    {
        c = strg[i];
       
        if(c >= 'a' && c <= 'z')			
        {
            c = c - key;
            if(c < 'a')
            {
                c = c + 'z' - 'a' + 1;
            }
            
            strg[i] = c;
        }
       
        else if(c >= 'A' && c <= 'Z')		
        {
            c = c - key;
            
            if(c < 'A')
            {
                c = c + 'Z' - 'A' + 1;
            }
            strg[i] = c;
        }
    }

    printf("%s", strg);					
    
    return 0;

}
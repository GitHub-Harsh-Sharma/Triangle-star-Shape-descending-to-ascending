import java.io.*;
class Star6
{
 public static void main(String[] args)
  {
    int i,k,s,a=5,b=0;
    for(i=1; i<=3;i++)
    {
        for(s=1;s<=b;s++)
        {
            System.out.print(" ");
        }
     
        for(k=1;k<=a;k++)
        {
            System.out.print("*");
        }
       
        System.out.println("");
        a=a-2;
        b++;
    }    
    }
}
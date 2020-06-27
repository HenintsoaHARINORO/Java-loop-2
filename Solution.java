import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        
        
        for(int i=0;i<t;i++){
            int  a = in.nextInt();
            int  b = in.nextInt();
            int  n = in.nextInt();
            int s= 0;
        for(int j= 0,k=0;j<n && k<=n-1;j++,k++)
        {   
            
            s= (int)Math.pow(2,k)*b + s;
            System.out.print(a+s+" ");
            
        }
        System.out.printf("\n");
        }
       
        
     in.close();    
    }
   
     
}


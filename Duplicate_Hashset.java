import java.util.*;
 
public class Duplicate_Hashset
{
    public static void main(String[] args) 
    {   Scanner sc =new Scanner(System.in);
    int flag=0;
        int n= sc.nextInt();
         int a[]=new int[n];
         for(int i=0;i<n;i++)
         {
             a[i]=sc.nextInt();
         }
        sc.close();
        Set<Integer> hash = new HashSet<Integer>();
        for(int i=0;i<n;i++) 
        {
           if(hash.add(a[i]) == false) 
            {
                System.out.println("duplicate:"+a[i]+" is found at "+ i+" position.");
                flag=1;
            }
            
        }
        if(flag!=1)
            {
             System.out.println("duplicate not found");
            }
    }
}

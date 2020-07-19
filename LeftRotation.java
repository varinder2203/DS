import java.util.*;

public class LeftRotation {

    public static void main(String[] args) 
    {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int k=sc.nextInt();
       int a[]=new int[k];
       int p[]=new int[n-k];
       for(int i=0;i<k;i++)
       {
           a[i]=sc.nextInt();
       }   
    for(int j=0;j<n-k;j++)
    {
        p[j]=sc.nextInt();
    }
    sc.close();
    for(int i=0;i<p.length;i++)
    {
    System.out.print(p[i]+" ");
    }
    for(int y=0;y<a.length;y++)
    {
        System.out.print(a[y]+" ");
    }
    }
}

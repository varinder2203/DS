import java.util.*;

class ll_insert_at_end
{
    class Node
    {
    int data;
    Node next;
    Node(int d)
    {
        data =d;
        next=null;
    }
    }
    public Node head =null;
   public void insert(int d)
   {
      Node ele =new Node(d);
      if(head==null)
      {
      head =ele;
      }
      else{
          Node last =head;
          while(last.next!=null)
          {
              last=last.next;
          }
          last.next=ele;
      }

   }
   public void disp()
   {
      Node curr =head;
      if(curr==null)
      {
          System.out.print("empty");
      }
      else{System.out.println("elements are:");
          while(curr !=null)
          {
              System.out.print(curr.data+ " ");
              curr=curr.next;
          }
      }
   }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ll_insert_at_end in =new ll_insert_at_end();
        for(int i=0;i<n;i++)
        {
          int ele=sc.nextInt();
          in.insert(ele);
        }
        sc.close();
        in.disp();
    }
}
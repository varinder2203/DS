import java.util.*;
class QueueBasic
{
  int SIZE=10;
  int front=-1;
  int rear=-1;
  int array[]=new int[SIZE];

  void insert(int item)
  {
      System.out.println("Front = "+front+ ", Rear = "+rear);
    if (rear == SIZE) 
      return;
    if(front == -1 && rear == -1){
      front++;
      rear++;
    }
    else
      rear++;
    array[rear] = item;
    System.out.println(item+"is added to queue");
  }

  int delete()
  {
      System.out.println("Front = "+front+ ", Rear = "+rear);
   if (front > rear)
    {
      System.out.println("Queue is Empty.");
      return -1;
    }
    int item = array[front];
    front++;
    System.out.println(item+" is removed from queue.");
    return item;
  }

  public static void main(String args[])
  {
    QueueBasic ob1=new QueueBasic();
    Scanner num=new Scanner(System.in);
    System.out.println("Enter 4 digits");
    for(int i=0;i<4;i++)
    {
        int x=num.nextInt();
 //   System.out.println("Front = "+front+ ", Rear = "+rear);
    ob1.insert(x);
    }

    for(int i=0;i<4;i++)
    {
    ob1.delete();
    }
  }
}

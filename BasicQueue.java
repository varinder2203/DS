import java.util.*;
class BasicQueue
{
  int SIZE=10;
  int front=-1;
  int rear=-1;
  int array[]=new int[SIZE];

  void insert(int item)
  {
      System.out.println("Front = "+front+ ", Rear = "+rear);
    if ((front == 0 && rear == SIZE-1) || (rear == (front-1)%(SIZE-1))) { 
      System.out.println("Queue is FULL.");
      return;
    }
    if(front == -1)	
    front = rear = 0;
  else if (rear == SIZE-1 && front != 0)
    rear = 0;
  else
    rear++;

    array[rear] = item;
    System.out.println(item+" enqueued to queue.");
  }

  int delete()
  {
      System.out.println("Front = "+front+ ", Rear = "+rear);
    if (front == -1)
    {
      System.out.println("Queue is Empty.");
      return -1;
    }
    int item = array[front];
    if (front == rear)
      front = rear = -1;
    else if (front == SIZE-1)
      front = 0;
    else
      front++;
    System.out.println(item+" dequeued from queue.");
    return item;
  }

  public static void main(String args[])
  {
    BasicQueue ob1=new BasicQueue();
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

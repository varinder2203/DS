import java.util.Arrays;
import java.util.List;
class TwoInOne {
    int arr[];
    int size;
    int top1,top2;
    TwoInOne(int n){
        size = n;
        top1 = -1;
        top2 = size;
        arr = new int[size];
    }
    	void push1(int key)
	{
		if (top1 + 1 == top2)
		{
			System.out.println("Stack Overflow");
			System.exit(-1);
		}

		top1++;
		arr[top1] = key;
        System.out.println("Element pushed at "+ top1+" is "+a[top1] );
	}
    void push2(int key)
	{
		if (top1 + 1 == top2)
		{
			System.out.println("Stack Overflow");
			System.exit(-1);
		}

		top2--;
		arr[top2] = key;
        System.out.println("Element pushed at "+ top2+" is "+a[top2] );
	}
   	int pop1()
	{
		if (top1 < 0)
		{
			System.out.println("Stack UnderFlow");
			System.exit(-1);
		}
		
		int top = arr[top1];
		top1--;
		return top;
	}
    	int pop2()
	{
		if (top2 >= size)
		{
			System.out.println("Stack UnderFlow");
			System.exit(-1);
		}

		int top = arr[top2];
		top2++;
		return top;
	}
public static void main(String args[]){
        TwoInOne stack = new TwoInOne(6);
        stack.push1(10);
        stack.push1(21);
        stack.push1(35);
        stack.push2(46);
        stack.push2(53);
        stack.push2(63);
        System.out.println("Popping element from the first stack : " + stack.pop1());
        System.out.println("Popping element from the Second stack : " + stack.pop2());
    }
}

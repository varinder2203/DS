import java.util.Arrays;
import java.util.List;
class SimpleStack {
    int arr[];
    int size;
    int top;
    SimpleStack(int n){
        size = n;
        top = -1;
        
        arr = new int[size];
    }
    	void push(int key)
	{
		if (top + 1 == size)
		{
			System.out.println("Stack Overflow");
			System.exit(-1);
		}

		top++;
		arr[top] = key;
        System.out.println("Element pushed at "+ top+" is "+arr[top] );
	}
   	int pop()
	{
		if (top < 0)
		{
			System.out.println("Stack UnderFlow");
			System.exit(-1);
		}
		
		int temp = arr[top];
		top--;
		return temp;
	}
    public static void main(String args[]){
        SimpleStack stack = new SimpleStack(6);
        stack.push(10);
        stack.push(21);
        stack.push(35);
        stack.push(46);
        stack.push(53);
        stack.push(63);
        System.out.println("Popping element from the stack : " + stack.pop());
        System.out.println("Popping element from the stack : " + stack.pop());
    }
}

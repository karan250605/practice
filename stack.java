import java.util.Scanner;
public class stack
{
    private int maxsize,top;
    private int[] st;
    public stack(int size)
    {
        maxsize=size;
        st=new int[maxsize];
        top=-1;
    }
    boolean isempty()
    {
        return top==-1;
    }
    boolean isfull()
    {
        return top==maxsize-1;
    }
    public void push(int element)
    {
        if (isfull())
            System.out.println("overflow");
        else
            st[++top]=element;
    }
    public int pop()
    {
        if(isempty())
        {
            System.out.println("underflow");
            return -1;
        }
        return(st[top-1]);
    }
    public void printstack()
    {
        System.out.println("stack element: ");
        for (int i=top;i>=0;i--)
            System.out.println(st[i]);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the stack size");
        int size=sc.nextInt();
        stack obj=new stack(size);
        while(true)
        {
            System.out.println("\n stack\n****\n1. push\n2. pop\n3. display\n4. exit\n enter your choice");
            int ch = sc.nextInt();
            switch(ch)
            {
                case 1:
                    System.out.println("enter the element");
                    int n=sc.nextInt();
                    obj.push(n);
                    break;
                case 2:
                    System.out.println("popped element is" + obj.pop());
                    break;
                case 3:
                    obj.printstack();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("wrong option");
            }
        }
    }
}
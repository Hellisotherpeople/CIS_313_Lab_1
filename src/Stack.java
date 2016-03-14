

public class Stack
{
    Node top; // top of the stack 

    public Stack()
    {
        top = null;
    }

    public boolean isEmpty()
    {
        return top == null;
    }

    public void push(Node n)
    {

        n.next = top;
        top = n;
    }

    public Node pop()
    { // returns the value that was popped off  
        if (isEmpty())
        {
            System.out.println("The stack is empty, nothing was popped!!!");
        }
        Node oldtop = top;
        top = top.next;
        return oldtop;
    }

}

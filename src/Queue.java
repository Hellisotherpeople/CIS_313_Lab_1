
public class Queue
{
    Node front, back;

    public Queue()
    {
        front = back = null;
    }

    public boolean isEmpty()
    {
        return front == null && back == null;
    }

    public void enqueue(Node n)
    {
        if (isEmpty())
        {
            front = n;
        } else
        {
            back.next = n;
        }
        back = n;

    }

    public Node dequeue()
    {//returns the value that was removed 
        if (isEmpty())
        {
            System.out.println("The Queue is Empty, cannot Dequeue!");
        }
        Node oldfront = front;
        if (front == back)
        {
            back = null;
        }
        front = front.next;
        return oldfront;

    }

}

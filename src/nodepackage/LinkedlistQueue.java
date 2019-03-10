package nodepackage;

public class LinkedlistQueue {

  Node front;
  Node rear;

  public LinkedlistQueue()
  {
      front = null;
      rear = null;
  }


  // insert rear
  public void enqueue(int val)
  {
    Node n = new Node();
    n.setData(val);
    if(front == null && rear == null)
    {
      front =rear = n;
      return;
    }
    rear.setNext(n);
    rear = n;

  }
  // delete front
  public void dequeue()
  {
    if (front == null)
    {
        return;

    }
    else
    {
      front = front.getNext();
    }
  }

  public void display()
  {
    Node temp;
    temp = front;
    while(temp != null)
    {
      System.out.println(temp.getData());
      temp = temp.getNext();
    }
  }

public static void main(String args[])
{
    LinkedlistQueue obj = new LinkedlistQueue();
    obj.enqueue(12);
    obj.enqueue(13);
    obj.enqueue(14);
    obj.dequeue();
    obj.dequeue();
    obj.display();
}
}


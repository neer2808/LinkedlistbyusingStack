package nodepackage;

public class Linkedlistwithstack {
  private Node top;

  public void push(int data)
  {
  Node n = new Node();
  n.setData(data);

  }

  // Method to check link list is empty or not
public boolean isEmpty()
{
  return top== null;
}

// define method display

  public void display()
  {
    Node temp;
    temp = top;
    while(temp != null)
    {
      System.out.println(temp.getData());
      temp = temp.getNext();

    }
  }


  public void pop()
  {


  }
}

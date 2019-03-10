package nodepackage;

// implementation of linked list by using stack




public class Linkedlistwithstack {
  private Node top;

  public void push(int data)
  {
  Node n = new Node();
  n.setData(data);
  if(isEmpty())
  {
    top = n;
    return;

  }
   else {
    n.setNext(top);
    top = n;
  }
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

// method to perform delete operation

  public int pop(){
    int result;
      if(isEmpty())
      {
        System.out.println("Linked list is empty");
        return 0;
      }
      else
      {
        result= top.getData();
        top = top.getNext();
        return result;
      }

  }

  public static void main(String[] args) {
    Linkedlistwithstack obj = new Linkedlistwithstack();
    obj.push(12);
    obj.push(13);
    System.out.println(obj.pop());
    System.out.println(obj.pop());

    // obj.display();

  }


}

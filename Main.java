public class Main {
  // first node  
  private Node root;  
    void Tree() {  
    root = null;  
  }  
  // class representing tree nodes  
  static class Node  
  {  
    String value;  
    Node left;  
    Node right;  
    Node(String value)  
    {  
      this.value = value;  
      left = null;  
      right = null;          
    }  
    public void displayData()  
    {  
      System.out.print(value + " ");  
    }  
  }  
      
  public Main.Node insert(String i)  
  {  
    return root = insert( i);  
  }  
//to insert on the left
public void insertL(Node node, String value){ 
    if (node.left != null)   
    {  
        insertL(node.left, value);  
    } else   
    {  
        node.left = new Node(value);  
    }  
}   
//to insert on the right
public void insertR(Node node, String value){ 
if (node.right != null)   
{  
    insertL(node.right, value);  
} else   
{  
    node.right = new Node(value);  
}  
  }
  public static void main(String[] args)   
  {  
    Tree tredle = new Tree();
    tredle.insert("Is your animal a mammal?");



  }
}

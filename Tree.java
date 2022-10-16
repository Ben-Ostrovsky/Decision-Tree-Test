public class Tree {
    public static class Node{    
        String data;    
        Node left;    
        Node right;    
        public Node(String data){    
            this.data = data;    
            this.left = null;    
            this.right = null;    
            }    
        }  
    //represent the origin of decision tree 
    public Node root;    
    public Tree(){    
        root = null;      
    }
}

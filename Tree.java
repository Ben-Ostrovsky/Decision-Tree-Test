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
     //factorial() will calculate the factorial of given number    
     public int factorial(int num) {    
        int fact = 1;    
        if(num == 0)    
            return 1;    
        else {    
            while(num > 1) {    
                fact = fact * num;    
                num--;    
            }    
            return fact;    
        }    
    }
    public void insert(String string) {
    }    
}


package algo;


public class Search {
    
public static void main(String[] args){
        try{
            Node tree = sample_tree();
             Bfs.traversal(tree);
              //Dfs.traversal(tree);
            
        }catch(Exception e){
        }
    }
    
    private static Node sample_tree(){
        Node root = new Node("A", 
                new Node("B",
                        new Node("C"), new Node("D")),
                new Node("E",
                        new Node("F"), new Node("G",
                                    new Node("H"), null)));
                                    
         
       return root;                             
    }
}   


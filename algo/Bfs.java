
package algo;

import java.util.LinkedList;
import java.util.Queue;


public class Bfs {
    
static void traversal(Node node){
        Queue<Node> q = new LinkedList<>();
        
        q.add(node);
        
        while (!q.isEmpty()) {            
            node = q.remove();
            System.out.println(node.data+"");
            
            if (node.left != null) {
                q.add(node.left);
            }
            
            if (node.right != null){
                q.add(node.right);
            }
        }
    }
}


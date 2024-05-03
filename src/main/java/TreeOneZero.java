import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by kristofer on 7/13/20.
 */
public class TreeOneZero {
    Node root;

    private Node addRecursive(Node current, Integer value){
        return null;
    }

    public void add(Integer value){}

    private TreeOneZero createBinaryTree() {
        TreeOneZero bt = new TreeOneZero();

        bt.add(new Integer(6));
        bt.add(new Integer(4));
        bt.add(new Integer(8));
        bt.add(new Integer(3));
        bt.add(new Integer(5));
        bt.add(new Integer(7));
        bt.add(new Integer(9));

        return bt;
    }

    private boolean containsNodeRecursive(Node current, Integer value){
        return true;
    }

    private Node deleteRecursive(Node current, Integer value){
        return null;
    }

    private int findSmallestValue(Node n){
        return 0;
    }

    public void delete(Integer value){

    }

    public void traverseInOrder(Node node){

    }

    public void traversePreOrder(Node node){

    }

    public void traversePostOrder(Node node){

    }

    public void traverseLevelOrder() {
        if (root == null) {
            return;
        }

        Queue<Node> nodes = new LinkedList<>();
        nodes.add(root);

        while (!nodes.isEmpty()) {

            Node node = nodes.remove();

            System.out.print(" " + node.value);

            if (node.left != null) {
                nodes.add(node.left);
            }

            if (node.right != null) {
                nodes.add(node.right);
            }
        }
    }
}

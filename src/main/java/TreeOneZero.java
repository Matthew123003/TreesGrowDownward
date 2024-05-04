import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by kristofer on 7/13/20.
 */
public class TreeOneZero {
    Node root;

    private Node addRecursive(Node current, Integer value){
        if(current == null){
            return new Node(value);
        }
        if(value < current.value){
            current.left = addRecursive(current.left, value);
        }else if(value > current.value){
            current.right = addRecursive(current.right, value);
        }
        return current;
    }

    public void add(Integer value){
        addRecursive(this.root, value);
    }

    public TreeOneZero createBinaryTree() {
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
        if(current == null){
            return false;
        }
        if(current.value == value){
            return true;
        }
        if(current.value > value){
            return containsNodeRecursive(current.left, value);
        }else{
            return containsNodeRecursive(current.right, value);
        }
    }

    public boolean containsNode(Integer value){
        return containsNodeRecursive(root, value);
    }

    private Node deleteRecursive(Node current, Integer value){
        if(current == null){
            return null;
        }
        if(value == current.value) {
            if (current.right == null) {
                return current.left;
            }
            if (current.left == null) {
                return current.right;
            }
        }
        current.value = findSmallestValue(current.right);
        current.right = deleteRecursive(current.right, current.value);
        if (value < current.value) {
        current.left = deleteRecursive(current.left, value);
        } else {
        current.right = deleteRecursive(current.right, value);
        }
        return current;

    }

    public void delete(Integer value){
        root = deleteRecursive(root, value);
    }

    private int findSmallestValue(Node n){
        return n.left == null ? n.value : findSmallestValue(n.left);
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

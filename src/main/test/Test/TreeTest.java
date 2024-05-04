package Test;

import Tree.TreeOneZero;
import org.junit.Assert;
import org.junit.Test;

import static Tree.TreeOneZero.createBinaryTree;

public class TreeTest {

    @Test
    public void givenABinaryTree_WhenAddingElements_ThenTreeContainsThoseElements() {
        TreeOneZero bt = createBinaryTree();

        Assert.assertTrue(bt.containsNode(6));
        Assert.assertTrue(bt.containsNode(4));

        Assert.assertFalse(bt.containsNode(1));
    }

    @Test
    public void givenABinaryTree_WhenDeletingElements_ThenTreeDoesNotContainThoseElements() {
        TreeOneZero bt = createBinaryTree();

        Assert.assertTrue(bt.containsNode(9));
        bt.delete(9);
        Assert.assertFalse(bt.containsNode(9));
    }
}

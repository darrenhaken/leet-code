package binarytree;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinDepthTest {

    @Test
    public void itShouldFindTheMinDepth() {
        TreeNode node = new TreeNode(1);

        node.left = new TreeNode(5);
        node.right = new TreeNode(2);

        MinDepth minDepth = new MinDepth();

        minDepth.minDepth(node);
    }

    @Test
    public void itShouldReturnZeroWhenRootIsNull() {
        MinDepth minDepth = new MinDepth();
        int depth = minDepth.minDepth(null);

        assertEquals(0, depth);
    }
}

package algorithms.trees;

public class TreeNode {
    int val;
    TreeNode left, right;

    public TreeNode(int val) {
        this.val = val;
    }

    TreeNode treeNode = new TreeNode(5);





    private void findDept (TreeNode treeNode) {
        int count = 0;
        while (treeNode.left != null){
            count++;
            System.out.println(count);
        }
    }
}


class NodeOne extends TreeNode{

    public NodeOne(int val) {
        super(val);
    }
}

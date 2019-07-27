package algorithms.trees;

public class BinaryTreeMain {
    public static void main(String[] args) {
        int[] array = {1, -2, 3, 40, 5, 63, 7};
        Node root = arrayToTree(array, 0, array.length-1);

    }

    private static Node arrayToTree(int[] array, int start, int end) {

        if (end < start) return null;

        int middle = (start + end) / 2;
        Node currentNode = new Node(array[middle]);
        currentNode.left = arrayToTree(array, start, middle-1);
        currentNode.right = arrayToTree(array,  middle+1, end);


        return currentNode;
    }

    private static void printDfs(Node root) {
        if (root == null) return;
        System.out.println(root.val);
        printDfs(root.left);
        printDfs(root.right);
    }
}

class Node {
    int val;
    Node left, right;

    public Node(int val) {
        this.val = val;
    }
}

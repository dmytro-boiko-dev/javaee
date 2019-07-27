//package algorithms.trees;
//
//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.List;
//
//public class TreeMain {
//    public static void main(String[] args) {
//
//        Node root = new Node(1, null);
//        root.children = new ArrayList<>();
//
//        Node nodeOne = new Node(2, null);
//        root.children.add(nodeOne);
//        nodeOne.children.add(new Node(3,null));
//        nodeOne.children.add(new Node(4,null));
//        nodeOne.children.add(new Node(5,null));
//
//
//        Node nodeTwo = new Node(-2, null);
//        root.children.add(nodeTwo);
//        nodeTwo.children.add(new Node(-3, null));
//        nodeTwo.children.add(new Node(-4, null));
//        nodeTwo.children.add(new Node(-5, null));
//
//        printBFS(root);
//
//    }
//
//    public static void printBFS(Node root) {
//
//        LinkedList<Node> queue = new LinkedList<>();
//        queue.addLast(root);
//
//        while (queue.size() > 0){
//            Node current = queue.poll();
//            if (current.children != null)
//            queue.addAll(current.children);
//
//
//            System.out.println(current.val);
//        }
//
//
//
//    }
//
//
//    // рекурсивный DFS
//    private static void printDFS(Node root){
//        if (root == null){ return;}
//
//        System.out.println(root.val);
//        if (root.children != null){
//            for (Node node : root.children) {
//                printDFS(node);
//            }
//        }
//
//    }
//}
//
//class Node {
//    int val;
//    List<Node> children;
//
//    public Node(int val, List<Node> children) {
//        this.val = val;
//        this.children = children;
//    }
//}

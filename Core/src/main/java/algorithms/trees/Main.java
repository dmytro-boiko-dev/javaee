package algorithms.trees;

public class Main {
    public static void main(String[] args) {
        BinaryHeap bh = new BinaryHeap();
        System.out.println("head " + bh.peakHead());
        bh.add(18);
        System.out.println("head " + bh.peakHead());
        bh.add(25);
        System.out.println("head " + bh.peakHead());
        bh.add(25);
        System.out.println("head " + bh.peakHead());

        bh.print();
    }
}

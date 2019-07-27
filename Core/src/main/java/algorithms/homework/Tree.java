package algorithms.homework;

public class Tree<T> {

    private Tree val;
    private Tree left;
    private Tree right;
    private Tree parent;

    public Tree(Tree val, Tree left, Tree right, Tree parent) {
        this.val = val;
        this.left = left;
        this.right = right;
        this.parent = parent;
    }

    private void add(T val){
        if (this.val == null){
            this.val = (Tree) val;
        }
//        else if (this.val > val) {
//
//        }
    }
}

package jun02;

public class BinaryTreeTraversal {
    static class Node {
        int key;
        Node left, right;

        public Node(int item) {
            key = item;
            left = right = null;
        }
    }

    private Node root;

    public BinaryTreeTraversal() {
        root = null;
    }

    // Postorder Traversal (Left, Right, Root)
    public void printPostorder(Node node) {
        if (node == null) return;
        printPostorder(node.left);
        printPostorder(node.right);
        System.out.print(node.key + " ");
    }

    // Inorder Traversal (Left, Root, Right)
    public void printInorder(Node node) {
        if (node == null) return;
        printInorder(node.left);
        System.out.print(node.key + " ");
        printInorder(node.right);
    }

    // Preorder Traversal (Root, Left, Right)
    public void printPreorder(Node node) {
        if (node == null) return;
        System.out.print(node.key + " ");
        printPreorder(node.left);
        printPreorder(node.right);
    }

    // Wrappers over recursive functions
    public void printPostorder() { printPostorder(root); }
    public void printInorder() { printInorder(root); }
    public void printPreorder() { printPreorder(root); }

    public static void main(String[] args) {
        BinaryTreeTraversal tree = new BinaryTreeTraversal();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Preorder traversal of binary tree is: ");
        tree.printPreorder();
        System.out.println();

        System.out.println("Inorder traversal of binary tree is: ");
        tree.printInorder();
        System.out.println();

        System.out.println("Postorder traversal of binary tree is: ");
        tree.printPostorder();
        System.out.println();
    }
}

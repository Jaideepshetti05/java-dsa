package jun02;

public class BST {
    static class Node {
        int key;
        Node left, right;

        public Node(int item) {
            key = item;
            left = right = null;
        }
    }

    private Node root;

    public BST() {
        root = null;
    }

    // Insert a key into the BST
    public void insert(int key) {
        root = insertRec(root, key);
    }

    private Node insertRec(Node root, int key) {
        // If the tree is empty, return a new node
        if (root == null) {
            root = new Node(key);
            return root;
        }

        // Otherwise, recur down the tree
        if (key < root.key) {
            root.left = insertRec(root.left, key);
        } else if (key > root.key) {
            root.right = insertRec(root.right, key);
        }

        // Return the (unchanged) node pointer
        return root;
    }

    // Search a key in the BST
    public boolean search(int key) {
        return searchRec(root, key);
    }

    private boolean searchRec(Node root, int key) {
        // Base Cases: root is null or key is present at root
        if (root == null) return false;
        if (root.key == key) return true;

        // Key is smaller than root's key
        if (root.key > key) {
            return searchRec(root.left, key);
        }

        // Key is greater than root's key
        return searchRec(root.right, key);
    }

    // Inorder traversal of BST (produces sorted order)
    public void inorder() {
        inorderRec(root);
        System.out.println();
    }

    private void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.key + " ");
            inorderRec(root.right);
        }
    }

    public static void main(String[] args) {
        BST tree = new BST();

        System.out.println("Inserting keys: 50, 30, 20, 40, 70, 60, 80");
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        System.out.print("Inorder traversal of the BST: ");
        tree.inorder();

        int searchKey = 60;
        System.out.println("Searching for key " + searchKey + ": " + (tree.search(searchKey) ? "Found" : "Not Found"));

        searchKey = 99;
        System.out.println("Searching for key " + searchKey + ": " + (tree.search(searchKey) ? "Found" : "Not Found"));
    }
}

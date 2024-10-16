package bth7;

public class BinaryTree {
    Node root;

    public BinaryTree(){
        root = null;
    }

    public void insert(int value){
        root = insertNode(root, value);
    }

    private Node insertNode(Node root, int value){
        if (root == null){
            root = new Node(value);
            return root;
        }
        if (root.value<value){
            root.right=insertNode(root.right,value);
        }
        if (root.value>value){
            root.left=insertNode(root.left,value);
        }
        return root;
    };

    public void traversal(String search){
        traversalTree(root, search);
    }

    public void traversalTree(Node node, String search){
        if (node == null) {
            return;
        }

        if (search.equals("preorder")){
            System.out.println(node.value + " ");
            traversalTree(node.left,"preorder");
            traversalTree(node.right,"preorder");

        }

        if (search.equals("inorder")){
            traversalTree(node.left,"inorder");
            System.out.println(node.value + " ");
            traversalTree(node.right,"inorder");

        }

        if (search.equals("postorder")){
            traversalTree(node.left,"postorder");
            traversalTree(node.right,"postorder");
            System.out.println(node.value + " ");
        }
    }
}

/**
 *
 */
package trees;

/**
 * @author KumarAn5
 *
 */
public class BinarySearchTree
{
    class Node
    {
        int data;

        Node left, right;

        public Node(int data)
        {
            this.data = data;
            this.left = this.right = null;
        }
    }

    public static void main(String[] args)
    {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        tree.printTree();
    }

    Node root;

    BinarySearchTree()
    {
        this.root = null;
    }

    void insert(int data)
    {
        this.root = this.insertInTree(this.root, data);
    }

    Node insertInTree(Node root, int data)
    {
        if (root == null)
        {
            root = new Node(data);
            return root;
        }

        if (data < root.data)
        {
            root.left = this.insertInTree(root.left, data);
        }
        else if (data > root.data)
        {
            root.right = this.insertInTree(root.right, data);
        }
        return root;
    }

    void printInorder(Node root2)
    {
        if (root2 != null)
        {

            this.printInorder(root2.left);
            System.out.println(root2.data);
            this.printInorder(root2.right);
        }
    }

    private void printTree()
    {
        this.printInorder(this.root);
    }

}

/**
 *
 */
package trees;

/**
 * @author anish kumar
 *
 */
public class BinaryTreeHeight
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
        BinaryTreeHeight tree = new BinaryTreeHeight();
        tree.insert(20);
        tree.insert(10);
        tree.insert(30);
        tree.insert(50);
        tree.insert(90);
        tree.insert(70);

        System.out.println(tree.findHeight());
    }

    Node root;

    public BinaryTreeHeight()
    {
        this.root = null;
    }

    public int calHeight(Node root)
    {
        if (root == null)
        {
            return 0;
        }
        return 1 + (Math.max(this.calHeight(root.left), this.calHeight(root.right)));
    }

    /**
     * @return
     */
    private int findHeight()
    {
        // TODO Auto-generated method stub
        return this.calHeight(this.root);
    }

    public void insert(int data)
    {
        this.root = this.insertNode(this.root, data);
    }

    private Node insertNode(Node root, int data)
    {
        if (root == null)
        {
            root = new Node(data);
            return root;
        }

        if (root.data > data)
        {
            root.left = this.insertNode(root.left, data);
        }
        else if (root.data < data)
        {
            root.right = this.insertNode(root.right, data);
        }

        return root;
    }

}

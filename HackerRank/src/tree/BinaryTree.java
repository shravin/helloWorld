package tree;

public class BinaryTree {

	public static void main(String[] args) 
	{
		Node tree = new Node(0);
		tree.setLeft(new Node(1, null, null));
		tree.setRight(new Node(2, null, null));
		traverse(tree);
	}

	private static void traverse(Node node) 
	{
		if (node.getLeft() != null)
		{
			traverse(node.getLeft());
		}
		
		if (node.getRight() != null)
		{
			traverse(node.getRight());
			
		}
		System.out.println(node.getValue());
		return;
	}

}

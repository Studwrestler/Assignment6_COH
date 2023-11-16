/**
 * This is the Depth First Search class that will traverse a tree in a preorder manner
 * @author Chase
 *
 */
public class DepthFirstSearch {
	private int nodeCount;// used to count the nodes
	private int treeHeight;// used to store the height of the tree
	/**
	 * constructor that tells you how to run a Depth First Search
	 */

	public DepthFirstSearch() {
		System.out.println("Call DFS with root node to do a Depth First Search.");
	}//end constructor

	/**
	 * Method to perform depth-first search (preorder traversal). Traverses the tree
	 * and prints the node values in the traversal order. Also calculates the number
	 * of nodes traversed and the height of the tree.
	 *
	 * @param node The root node of the tree to be traversed.
	 */
	public void DFS(Node node) {
		if (node == null) {
			System.out.println("Tree is empty.");
			return;
		}

		nodeCount = 0; // Reset node count before traversal
		treeHeight = calculateHeight(node);
		System.out.print("Depth First Search (Preorder): ");
		traversePreorder(node);
		System.out.println("\nNumber of nodes traversed: " + nodeCount);
		System.out.println("Height of the tree: " + treeHeight);
	}//end DFS

	/**
	 * Helper method for depth-first search (preorder traversal). Recursively
	 * traverses the tree in a preorder manner.
	 *
	 * @param node The current node in the traversal.
	 */
	private void traversePreorder(Node node) {
		if (node != null) {
			nodeCount++;
			System.out.print(node.getData() + " "); // Output node value during traversal

			traversePreorder(node.getlChild());
			traversePreorder(node.getrChild());
		}
	}// end traversePreorder

	/**
	 * Method to calculate the height of the tree.
	 *
	 * @param node The current node in the calculation.
	 * @return The height of the tree rooted at the given node.
	 */
	private int calculateHeight(Node node) {
		if (node == null) {
			return 0;
		} else {
			int leftHeight = calculateHeight(node.getlChild());
			int rightHeight = calculateHeight(node.getrChild());

			return 1 + Math.max(leftHeight, rightHeight);
		}
	}//end calculateHeight
}//end class

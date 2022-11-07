package question2.Services;

import question2.Model.Node;

public class BST {
	public Node insert(Node root, int key) {
		Node newnode = new Node(key);
		Node x = root;
		Node current_parent = null;
		while (x != null) {
			current_parent = x;
			if (key < x.key)
				x = x.left;
			else if (key > x.key)
				x = x.right;
			else {
				System.out.println("Value already exists in the BST");
				return null;
			}
		}
		// If the root is null, the tree is empty.
		if (current_parent == null)
			current_parent = newnode;
		// assign new node node to the left child
		else if (key < current_parent.key)
			current_parent.left = newnode;
		// assign the new node to the right child
		else
			current_parent.right = newnode;
		// return pointer to new node
		return current_parent;
	}
	
}


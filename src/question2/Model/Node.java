package question2.Model;
public class Node {
	public int key;
	public Node left;
	public Node right;
	
	public Node(int val){
		this.key=val;
	}
	Node(int val, Node left, Node right){
		this.key=val;
		this.left=left;
		this.right=right;
	}
}

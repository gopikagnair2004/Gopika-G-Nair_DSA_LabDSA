package question2.Services;

import java.util.Stack;

import question2.Model.Node;

public class BSTIterator {
    private Stack<Node> stack = new Stack<Node>();
    boolean reverse = true; 
    
    public BSTIterator(Node root, boolean isReverse) {
        reverse = isReverse; 
        pushAll(root);
    }

    public boolean hasNext() {
        return !stack.isEmpty();
    }

    public int next() {
        Node tmpNode = stack.pop();
        // return smallest element in inorder traversal
        if(reverse == false) {
        	pushAll(tmpNode.right);
        }
        //return largest element in inorder traversal
        else{
        	pushAll(tmpNode.left); 
        }
        return tmpNode.key;
    }
    
    private void pushAll(Node node) {
        while(node != null) {
             stack.push(node);
             if(reverse == true) {
                 node = node.right; 
             } else {
                 node = node.left; 
             }
        }
    }
}
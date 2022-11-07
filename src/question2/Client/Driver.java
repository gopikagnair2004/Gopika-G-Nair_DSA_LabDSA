package question2.Client;

import java.util.InputMismatchException;

import question2.Model.Node;
import question2.Services.*;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int value;
		Node root = null;
		Node currentNode = null;
		try {
		System.out.println("Enter no of values in BST");
		int noOfValues = sc.nextInt();
		BST tree = new BST();
		for (int i = 0; i < noOfValues; i++) {
			System.out.println("Enter the value to inser at "+(i+1)+"th position");
			 value = sc.nextInt();
			 if(root == null)
				 root = tree.insert(root, value);
			 else {
				 currentNode = tree.insert(root, value);
				 if(currentNode == null)
				 {
					 break;
				 }
						 
			 }
			
		}
		if(noOfValues >=1 && currentNode != null) {
			System.out.println("Enter the sum to be checked in Binary search Tree");
			int sum = sc.nextInt();
			findThePair(root, sum);
		}
		else if(noOfValues<=0){
			System.out.println("Binary Search Tree is Empty");
		}
		sc.close();
		}
		catch(InputMismatchException e) {
			System.out.println("Invalid Input entered.");
		}
		
		

	}
	
	public static void findThePair(Node root, int k) {
		boolean found = false;
        if(root == null) {
        	System.out.println("BST is Empty");
        }
        //Two iterators that have ascending & descending inorder traversals
        BSTIterator l = new BSTIterator(root, false); 
        BSTIterator r = new BSTIterator(root, true); 
        
        int val1 = l.next(); //smallest element in BST
        int val2 = r.next();  //largest element in BST
        while(val1<val2) {
            if(val1 + val2 == k) {
            	found = true;
            	System.out.println("Pair for sum = " +k+ " : ("+val1+","+val2+")");
            	break;
            }
            else if(val1+val2 < k) 
            	val1 = l.next(); 
            else 
            	val2 = r.next(); 
        }
        
        if(!found)
        	System.out.println("Nodes are not found in BST for given sum = "+k);
        
        	
        
    }
}

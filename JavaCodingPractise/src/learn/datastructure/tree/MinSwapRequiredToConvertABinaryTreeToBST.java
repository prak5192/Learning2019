package learn.datastructure.tree;

import learn.datastructure.array.MinimumSwapRequiredToSortAArray;

/*
 * https://www.geeksforgeeks.org/minimum-swap-required-convert-binary-tree-binary-search-tree/
 * 
 * The idea is to use the fact that inorder traversal of Binary Search Tree is in increasing order of their value.
 * So, find the inorder traversal of the Binary Tree and store it in the array and try to sort the array. 
 * The minimum number of swap required to get the array sorted will be the answer. 
 * Time Complexity: O(n log n).
 */
public class MinSwapRequiredToConvertABinaryTreeToBST {
	
	static int [] unsortedArray = new int[7];
	int  count = 0;
	
	
	 public void inorderRec(Node root) 
	 { 
	    if (root != null) 
	    { 
	        inorderRec(root.left); 
	        //System.out.print(root.key + " ");
	        unsortedArray[count++] = root.key;
	        inorderRec(root.right); 
	    } 
	 }
	
	public int minSwap(){
		 MinimumSwapRequiredToSortAArray obj1 = new MinimumSwapRequiredToSortAArray();
 	     return obj1.minSwaps(this.unsortedArray, this.unsortedArray.length);
	}
	
	
	public static void main(String args[]) 
	{ 
		Node root = new Node(5); 
	    root.left = new Node(9); 
	    root.right = new Node(3); 
	    root.left.left = new Node(6); 
	    root.right.right = new Node(4); 
	    root.left.left.left = new Node(8); 
	    root.left.left.right = new Node(19);
	    
	    MinSwapRequiredToConvertABinaryTreeToBST obj = new MinSwapRequiredToConvertABinaryTreeToBST();
	    obj.inorderRec(root);
	    
	    System.out.println("Minimum Swap required: " + obj.minSwap());
	} 

}

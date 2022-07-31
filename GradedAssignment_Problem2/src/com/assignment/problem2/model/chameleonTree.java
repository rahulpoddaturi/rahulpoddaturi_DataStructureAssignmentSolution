package com.assignment.problem2.model;


public class chameleonTree {
	public static class Node
	{
		int data;
		public Node left;
		public Node right;
		public Node(int data)
		{
			this.data = data;
			left = null;
			right = null;
		}
	}
	public Node m_root;
	public chameleonTree()
	{
		m_root = null;
	}
	Node prevNode = null;
	Node headNode = null;
	public Node GetHeadNode()
	{
		return headNode;
	}
	public void convertTree(Node root)
	{
		if (root == null)
			return;
		convertTree(root.left);
		Node tempRight  = root.right;
		if (headNode == null)
	    {
	        headNode = root;
	        root.left = null;
	        prevNode = root;
	    }
	    else
	    {
	        prevNode.right = root;
	        root.left = null;
	        prevNode = root;
	    }  
	 	convertTree(tempRight);
		
	}
	public void traverseRightSkewed(Node root)
	{
	    if (root == null)
	        return;
	         
	    System.out.print( root.data +  " ");
	    traverseRightSkewed(root.right);
	}
	 
}

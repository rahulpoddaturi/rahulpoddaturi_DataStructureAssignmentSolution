package com.assignment.problem2.driver;

import com.assignment.problem2.model.chameleonTree;
import com.assignment.problem2.model.chameleonTree.Node;

public class TreeTransformerDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		chameleonTree tree = new chameleonTree();
		tree.m_root = new Node(50);
		tree.m_root.left = new Node(30);
		tree.m_root.right = new Node(60);
		tree.m_root.left.left = new Node(10);
		tree.m_root.right.left= new Node(55);
		
		tree.convertTree(tree.m_root);
		tree.traverseRightSkewed(tree.GetHeadNode());

	}

}

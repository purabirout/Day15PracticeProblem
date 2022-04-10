package com.bridgelabz.BinaryTree;

public class BinaryNode<K extends Comparable<K>> {
		K key;
		BinaryNode<K> right;
		BinaryNode<K> left;
		
		public BinaryNode(K key) {
			this.right = null;
			this.key = key;
			this.left = null;
		}
		
	}


package com.cg.datastructure;

import org.junit.Assert;
import org.junit.Test;

public class LinkedListTest {

	//UC2
	 @Test
		public void addedToLinkedList() {
			Node<Integer> firstNode = new Node<>(1);
			Node<Integer> secondNode = new Node<>(2);
			Node<Integer> thirdNode = new Node<>(3);
			LinkedList<Integer> linkedList = new LinkedList<>();
			linkedList.add(firstNode);
			linkedList.add(secondNode);
			linkedList.add(thirdNode);
			boolean result = linkedList.head.equals(thirdNode) && linkedList.head.getNext().equals(secondNode)
					&& linkedList.tail.equals(firstNode);
			Assert.assertTrue(result);
	}
	 
	 //UC3
	 @Test
	 	public void given3NumbersWhenAddedToLinkedListShouldBeAddedToLast() {
	 		Node<Integer> firstNode = new Node<>(70);
	 		Node<Integer> secondNode = new Node<>(30);
	 		Node<Integer> thirdNode = new Node<>(56);
	 		LinkedList<Integer> linkedList = new LinkedList<>();
	 		linkedList.append(firstNode);
	 		linkedList.append(secondNode);
	 		linkedList.append(thirdNode);
	 		boolean result = linkedList.head.equals(firstNode);
	 		Assert.assertTrue(result);
	 	}
	 
	 
	
	
}

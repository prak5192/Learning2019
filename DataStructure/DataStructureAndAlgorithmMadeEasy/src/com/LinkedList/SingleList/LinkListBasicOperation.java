package com.LinkedList.SingleList;

public class LinkListBasicOperation {
	
	/*
	 * Find the length of the Linked list.
	 */
	public int listLength(ListNode headNode)
	{
		int length = 0;
		ListNode currentNode = headNode;
		if(currentNode == null)
		{
			return 0;
		}
		while(currentNode != null)
		{
			length++;
			currentNode = currentNode.getNext();
		}
		return length;
	}
	
	/*
	 * Singly Linked List insertion
	 * 1. Inserting at the beginning
	 * 2. Inserting at the end
	 * 3. Inserting in the middle of the list.
	 */
	
	public ListNode insertAtBegin(ListNode headNode, ListNode nodeToInsert)
	{
		nodeToInsert.setNext(headNode);
		return nodeToInsert;
		
	}
	
	public ListNode insertAtEnd(ListNode headNode, ListNode nodeToInsert)
	{
		ListNode currentNode = headNode;
		if(headNode == null)
		{
			nodeToInsert.setNext(null);
			return nodeToInsert;
		}
		while(currentNode.getNext() != null)
		{
			currentNode = currentNode.getNext();
		}
		currentNode.setNext(nodeToInsert);
		nodeToInsert.setNext(null);
		return headNode;
	}
	
	public ListNode insertAtPosition(ListNode headNode, ListNode nodeToInsert, int position)
	{
		ListNode currentNode = headNode;
		if(headNode == null)
		{
			nodeToInsert.setNext(null);
			return nodeToInsert;
		}
		while(currentNode.getNext() != null && position != 0)
		{
			currentNode = currentNode.getNext();
			position--;
		}
		ListNode tempNode = currentNode.getNext();
		currentNode.setNext(nodeToInsert);
		nodeToInsert.setNext(tempNode);
		return headNode;
	}
	
	/*
	 * Delete the node
	 * 1. Delete from the beginning
	 * 2. Delete from the end
	 * 3. Delete from the specified position.
	 */
	
	public ListNode deleteFromBegin(ListNode headNode)
	{
		if(headNode == null)
		{
			return null;
		}
		ListNode currentNode = headNode;
		currentNode = headNode.getNext();
		return currentNode;
	}
	
	public ListNode deleteFromEnd(ListNode headNode)
	{
		ListNode current = headNode;
		ListNode prev = null;
		if (headNode == null)
		{
			return null;
		}
		if(headNode.getNext() == null)
		{
			return null;
		}
		while(current.getNext() != null)
		{
			prev = current;
			current = current.getNext();
		}
	
		if(prev != null)
		{
			prev.setNext(null);
		}
		return headNode;
	}
	
	/*
	 * Remove the node from a given position
	 * 1. If position is less than 0, return headNode.
	 * 2. If position is == 0, delete the begininng node.
	 * 3. if position is >= length of linked list -1, delete the last node. 
	 */
	
	public ListNode deleteAtPosition(ListNode headNode, int position)
	{
		if(headNode == null)
		{
			return null;
		}
		
		if(position < 0)
		{
			return headNode;
		}else if(position == 0)
		{
			return deleteFromBegin(headNode);
		}else {
			int length = listLength(headNode);
			if(position >= length - 1)
			{
				return deleteFromEnd(headNode);
			}else
			{
				ListNode current = headNode;
				ListNode prev=current;
				current = current.getNext()
				
				while(current != null)
				{
					prev = current;
					current = current.getNext();
					position = position - 1;
					if(position == 0)
					{
						break;
					}
				}
				if(position == 0)
				{
					prev.setNext(current.getNext());
				}
				return headNode;
			}
		}
		
		
	}
	
}

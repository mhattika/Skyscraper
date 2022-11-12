package com.gl.skyscraper;

import java.util.Scanner;

public class SingleLinkedList {

	private Node start;

	public SingleLinkedList() {
		start = null;
	}

	public void insertNodeInOrder(int data) {
		Node temp = new Node(data);
		// list is empty or node to be inserted at before first node
		if (start == null || data < start.info) {
			temp.link = start;
			start = temp;
			return;
		}
		/*Node p = start;
		while (p.link != null && p.link.info <= data) {
			p = p.link;
		}
		temp.link = p.link;
		p.link = temp;*/
	}

	public void createList() {
		int i, n, data;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of nodes");
		n = sc.nextInt();
		if (n == 0)
			return;
		else {
			System.out.println("Enter the data to be inserted");
			data = sc.nextInt();
			insertNodeInOrder(data);
		}
	}

	public void displayList() {
		Node p;
		if (start == null) {
			System.out.println("List is empty");
			return;
		}
		System.out.println("List is:");
		p = start;
		while (p != null) {
			System.out.print(p.info + "->");
			p = p.link;
		}
		System.out.println();
	}

}

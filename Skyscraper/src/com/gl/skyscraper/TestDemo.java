package com.gl.skyscraper;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Stack;
import java.util.TreeSet;

public class TestDemo {

	public static void main(String[] args) {
		SkyScrapper ss = new SkyScrapper();
		// ss.getData();
		TreeSet<Integer> ts = new TreeSet<>(new NumberComparator());
		Stack<Integer> stack = new Stack<>();
		PriorityQueue<Integer> queue = new PriorityQueue<>();
		SingleLinkedList sll = new SingleLinkedList();
		
		Scanner in = new Scanner(System.in);
		int N, size;

		System.out.println("enter the total no of floors in the building");
		N = in.nextInt();
		ArrayList<Integer> array = new ArrayList<Integer>(N);
		for (int i = 1; i <= N; i++) {
			System.out.println("enter the floor size given on day :" + i);
			size = in.nextInt();
			array.add(size);
			ts.add(size);
			stack.push(size);
			queue.add(size);
		}

		System.out.println("\n\nThe order of construction is as follows ");

		for (int j = 1; j <= N; j++) {
			System.out.println("Day: " + j);
			
			System.out.println(ts.pollFirst());
			
			}

			
		}

	}


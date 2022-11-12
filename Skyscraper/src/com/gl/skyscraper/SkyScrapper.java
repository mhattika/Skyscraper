package com.gl.skyscraper;

import java.util.Scanner;
import java.util.TreeSet;

public class SkyScrapper {

	void getData() {

		TreeSet<Integer> ts = new TreeSet<>(new NumberComparator());
		Scanner in = new Scanner(System.in);
		int N, size;
		System.out.println("enter the total no of floors in the building");
		N = in.nextInt();
		for (int i = 1; i <= N; i++) {
			System.out.println("enter the floor size given on day :" + i);
			size = in.nextInt();
			ts.add(size);
		}

		System.out.println(ts);
	}
}

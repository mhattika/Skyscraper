package com.gl.skyscraper;

import java.util.Scanner;

public class SHAilender {

	public static void main(String[] args) {
		int count =1;
		  Scanner sc = new Scanner(System.in);
	      System.out.println("Enter number of Floors");
	      int n = sc.nextInt();
	      int arr[] = new int[n];//to store different size of floors
	      for(int k =0 ;k<n;k++){
	          System.out.println("Enter floor size of "+count+" day");
	         int sizeofFloor = sc.nextInt();
	         count++;
	         if(sizeofFloor<=n && sizeofFloor!=0)
	        	 arr[k]= sizeofFloor;
	         else if(sizeofFloor==0) {
	        	 k--;
	        	 continue;
	         }
	         else {
	        	 k--;
	        	 System.out.println("invalid size entry");
	         }
	      }
	      for(int i =0;i<n;i++){
	          for(int j=i+1;j<n;j++){
	              if(arr[i]<arr[j]){
	                  int temp = arr[i];
	                  arr[i] = arr[j];
	                  arr[j] = temp;
	              }
	          }
	         
	      }
	      for(int a : arr)
	          System.out.print(a);
	      
	  }

	}



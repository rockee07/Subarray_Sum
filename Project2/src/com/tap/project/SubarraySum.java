package com.tap.project;
import java.util.Scanner;

public class SubarraySum {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
		}
		int res=scan.nextInt();
		subarraySum(arr,res);
	}
	
	public static void subarraySum(int[] arr,int res) {
		for(int k=1;k<=arr.length;k++) {
			for(int i=0;i<=arr.length-k;i++) {
				int sum=0;
				for(int j=i;j<i+k;j++) {
					sum=sum+arr[j];
				}
				if(sum==res) {
					for(int j=i;j<i+k;j++) {
						System.out.print(arr[j]+" ");
					}
					System.out.println();
				}
			}
		}
	}
}

package com.sri.patterns;

public class PattenMFull {
	public static void main(String[] args){
			try {
				int n= 5;
				for(int i=0; i<n; i++){
					for(int j=0; j<n; j++){
						if(j==0 || j == n || i==j)
							System.out.print("*");
						else
							System.out.print(" ");
					}
					for(int k=n-1; k>0; k--){
						if(k==1 || i == k-1)
							System.out.print("*");
						else
							System.out.print(" ");
					}
					System.out.println("\n");

				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
}

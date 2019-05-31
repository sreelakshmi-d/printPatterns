package com.sri.patterns;

public class PatternM {

	public static void main(String[] args){
			try {
				int n = 5; // can give any number
				for(int i=0; i<n; i++){
					for(int j=0; j<n; j++){
						if(j==0 || j == n-1)
							System.out.print("*");
						else if(i<=n/2 && (i==j || i==n-j-1)){
							System.out.print("*");
						}else
							System.out.print(" ");
					}
					System.out.println("\n");
				}
			}catch(Exception e){
				e.printStackTrace();
			}
	}
}

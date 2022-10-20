package ineuron;

public class PatternProgramming {
	public static void main(String[] args) {
		int n=15;
		System.out.println("");
		//Code For printing INEURON
		for(int i=0;i<n;i++) {
			//For printing I
			for(int j=0;j<n;j++) {
				if(i==0 || i==n-1 || j==(n-1)/2) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			
			//For printing N
			for(int j=0;j<n;j++) {
				if(j==0 || j==(n-1) || (i==j)) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			
			//For printing E
			for(int j=0;j<n;j++) {
				if(i==0 || j==0 || i==n-1 || i==(n-1)/2) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			
			//For printing U
			for(int j=0;j<n;j++) {
				if(((j==0 || j==n-1) && i<n-1) || (i==n-1 && (j>0 && j<n-1))) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			
			//For printing R
			for(int j=0;j<n;j++) {
				if(j==0 || (i==0 && j<n-1) || (j==n-1 && i<(n-1)/2 && i>0) || (i==(n-1)/2 && j<n-1) || 
						(i==j && i>(n-1)/2 && j>(n-1)/2)) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			
			//For printing O
			for(int j=0;j<n;j++) {
				if((j==0 && i>0 && i<n-1) || (i>0 && i<n-1 && j==(n-1)) || ((i==0 || i==n-1) && (j>0 && j<n-1))) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			
			//For printing N
			for(int j=0;j<n;j++) {
				if(j==0 || j==(n-1) || (i==j)) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			
			System.out.println("");
		}
		
		//Q2 - printing matrix
		n=4;
		System.out.println("");
		System.out.println("");

		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(i);
			}
			System.out.println("");
		}
		
		System.out.println("");
		System.out.println("");
		
		//Q3 solution
		n=20;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(
					i==0 ||
					(i+j <= (n-1)/2 ) ||
					(j-i >=(n-1)/2) ||
					(j==0 || j==n-1 || i==n-1) 
					) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		//Q4 Solution
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(
					(i-j >= (n-1)/2)||
					(j+i >=n-1 +(n-1)/2)
					) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		//Q5 Solution
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(
					i==0 || i==n-1 || j==0 ||
					i-j>=(n-1)/2 ||
					i+j <= (n-1)/2
						) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}


	}
}

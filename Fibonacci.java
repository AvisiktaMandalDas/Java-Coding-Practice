import java.util.*;
public class Solution {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		long n=sc.nextInt();
		if(n==1||n==2){
			System.out.println("1");
		}
		  else {
			long first=1;
			long second=1;
			long fib=0;
		  for(int i=3; i<=n; i++){
			fib=first+second;
			first=second;
			second=fib;
		}
		  System.out.println(fib);

		}

		
	}
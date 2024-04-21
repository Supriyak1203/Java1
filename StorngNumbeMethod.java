import java.util.Scanner;
class StorngNumbeMethod {
	public static void strong(int num) {
		int n=num;
		int sum=0;
		while(num>0) {
			int r=num%10;
			int fact=1;
			for(int i=1;i<=r;i++) {
				fact=fact*i;
			}
			sum=sum+fact;
			num=num/10;
		}	
		if(sum==n) {
			System.out.println(n+  "Its Storng Number");
		}
		else {
			System.out.println(n+   "Not Storng Number");
		}
	}
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Entre the Number:");
		int num=sc.nextInt();
		strong(num);
	}
}


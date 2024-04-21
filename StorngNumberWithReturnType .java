import java.util.Scanner;
class StorngNumberWithReturnType {
	public static String strong(int num) {
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
			return(num+ "Storng Number");
		}
		else {
			return("Not Storng Number");
		}
	}
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Entre the Number:");
		int num=sc.nextInt();
		strong(num);
}

		

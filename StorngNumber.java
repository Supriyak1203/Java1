class StorngNumber {
	public static void main(String[]args) {
		int num=145;
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
			System.out.println("Storng Number");
		}
		else {
			System.out.println("Not Storng Number");
		}
	}
}

		
				
import java.util.Scanner;
class Calculator {
	public static void add(int a,int b) {
		System.out.println(a+b);
	}
		public static void sub(int a,int b) {
		System.out.println(a-b);
	}
	public static void multiply(int a,int b) {
		System.out.println(a*b);
	}
	public static void div(int a,int b) {
		System.out.println(a/b);
	}
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		 	int a=sc.nextInt();
			int b=sc.nextInt();
			System.out.println("Entre the operator(+,-,*,/):");
			char operator=sc.next().charAt(0); 
	
		switch(operator) {
		case '+':
		add(a,b);
		break;
		case '-':
		sub(a,b);
		break;
		case '*':
		multiply(a,b);
		break;
		case '/':
		div(a,b);
		break;
		}
	}
}

	
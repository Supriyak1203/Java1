import java.util.Scanner;
class Currency {
	public static void india(double rupees) {
		double dollar = rupees / 74.5;
		System.out.println(+rupees);
	}
		public static void america(double rupees) {
		double dollar = rupees / 1.1;
		System.out.println(+dollar);
	}
	public static void france(double rupees) {
		double euro=86.2;
		double dollar = rupees / 86.2;
		System.out.println(+euro);
	}
	public static void germany(double rupees) {
		double euro=86.2;
		double dollar = rupees / 86.2;
		System.out.println(+euro);
	}
	public static void china(double rupees) {
		double yuan=10.8;
		double dollar = rupees / 10.8;
		System.out.println(+yuan);
	}
	
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
			System.out.println("entre the rupees");
		 	double rupees=sc.nextDouble();
			System.out.println("Entre the country");
			char country =sc.next().charAt(0); 
	
		switch(country) {
		case 'i':
		india(rupees);
		break;
		case 'a':
		america(rupees);
		break;
		case 'f':
		france(rupees);
		break;
		case 'g':
		germany(rupees);
		break;
		case 'c':
		china(rupees);
		break;

		
		}
	}
}

	
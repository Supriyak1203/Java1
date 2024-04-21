import java.util.Scanner;
class GeometricArea {
	public static void circle(double r) {
		System.out.println("Area of circle:"+3.14*r*r);
	}
	public static void triangle(double b,double h) {
		System.out.println("Area of triangle:"+1/2*b*h);
	}
	public static void rectangle(double b,double h) {
		System.out.println("Area of rectangle:"+b*h);
	}
	public static void square(double b) {
		System.out.println("Area of square:"+b*b);
	}
	public static void sphere(double r) {
		System.out.println("Area of sphere:"+4*3.14*r*r);
	}
	public static void cylinder(double r,double h) {
		System.out.println("Area of cylinder:"+2*3.14*r*h);
	}
	public static void hemisphere(double r) {
		System.out.println("Area of hemisphere:"+2*3.14*r*r);
	}
	public static void cone(double r,double h) {
		System.out.println("Area of cone:"+3.14*r*h);
	}
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Entre the radius:");
		double r=sc.nextDouble();
		System.out.println("Entre the base:");
		double b=sc.nextDouble();
		System.out.println("Entre the height:");
		double h=sc.nextDouble();
		System.out.println("Choose the shape:");
        	System.out.println("1. Circle\n2. Triangle\n3. Rectangle\n4. Square\n5. Sphere\n6. Cylinder\n7. Hemisphere\n8. Cone");
        	int shape = sc.nextInt();		
		switch(shape){
		case 1:
		circle(r);
		break;
		case 2:
		triangle(b,h);
		break;
		case 3:
		rectangle(b,h);
		break;
		case 4:
		square(b);
		break;
		case 5:
		cylinder(r,h);
		break;	
		case 6:
		sphere(r);
		break;
		case 7:
		hemisphere(r);
		break;
		case 8:
		cone(r,h);
		break;
		}
	}
}

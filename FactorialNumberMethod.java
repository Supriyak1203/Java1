import java.util.Scanner;
class FactorialNumberMethod {
public static void factorial(int a) {

int fact=1;
while(a>0){
fact=fact*a;
a--;
}
System.out.println(fact);
}
public static void main(String[]args) { 
Scanner sc=new Scanner(System.in);
System.out.println("Entre the Number:");
int a=sc.nextInt();
factorial(a);
}
}
import java.util.Scanner;
class FactorialNumberWithReturnType {
public static String factorial(int a) {

int fact=1;
while(a>0){
fact=fact*a;
a--;
}
return(a);
}
public static void main(String[]args) { 
Scanner sc=new Scanner(System.in);
System.out.println("Entre the Number:");
int a=sc.nextInt();
System.out.printlnfactorial(a);
}
}
/* output-
compile time-success
run time-
Entre the Number:
5
120
*/
import java.util.Scanner;
class PerfectNumberMethod{
public static void perfect(int a) {
int product=0;
for(int i=2;i<=a/2;i++){
if(a%i==0) {
product=product+i;
}
}
if(product==a){
System.out.println("Perfect Number");
}
else{
System.out.println("Not perfect Number");
}
}
public static void main(String[]args) { 
Scanner sc=new Scanner(System.in);
System.out.println("Entre the Number:");
int a=sc.nextInt();
perfect(a);
}
}
/* output-
compile time-success
run time-
Entre the Number:
5
Not perfect Number
*/
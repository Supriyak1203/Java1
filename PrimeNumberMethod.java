import java.util.Scanner;
class PrimeNumberMethod {
public static void prime(int a) {
int c=0;
if(a==2){
System.out.println(a+ "Prime Number");
}
else{
for(int i=2;i<a;i++){
if(a%i==0) {
c++;
}
}
}
if(c==0) {
System.out.println("Prime Number");
}
else{
System.out.println("Not Prime Number");
}
}
public static void main(String[]args) { 
Scanner sc=new Scanner(System.in);
System.out.println("Entre the Number:");
int a=sc.nextInt();
prime(a);
}
}
/* output-
compile time-success
run time-
Entre the Number:
13
Prime Number
*/
import java.util.Scanner;
class PrimeNumberWithReturnType {
public static String prime(int a) {
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
return(a+ "Prime Number");
}
else{
return(a+ "Not Prime Number");
}
}
public static void main(String[]args) { 
Scanner sc=new Scanner(System.in);
System.out.println("Entre the Number:");
int a=sc.nextInt();
System.out.println(prime(a));
}
}
/* output-
compile time-success
run time-
Entre the Number:
13
13 Prime Number
*/
import java.util.Scanner;
class PerfectNumberWithReturnType {
public static String perfect(int a) {
int product=0;
for(int i=1;i<=a/2;i++){
if(a%i==0) {
product=product+i;
}
}
if(product==a){
return("Perfect Number");
}
else{
return("Not perfect Number");
}
}
public static void main(String[]args) { 
Scanner sc=new Scanner(System.in);
System.out.println("Entre the Number:");
int a=sc.nextInt();
System.out.println(perfect(a));
}
}
/* output-
compile time-success
run time-
Entre the Number:
5
Not perfect Number
*/
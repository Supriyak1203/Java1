class FactorialNumber
{
public static void main(String[] args)
{
int start=2;
while(start <=9)
{
int num=start;

int fact=1;
while(num>0)
{
fact=fact*num;
num--;
}
System.out.println("Factorial Number"  +start+  "is =" +fact);
start++;
}
}
}
/*
 * Output
 * Compile time-Success
 * Run time-
 * actorial Number2is =2
Factorial Number3is =6
Factorial Number4is =24
Factorial Number5is =120
Factorial Number6is =720
Factorial Number7is =5040
Factorial Number8is =40320
Factorial Number9is =362880
 * 
 */
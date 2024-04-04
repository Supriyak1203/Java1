class AutomorphicNumber
{
public static void main(String[]args)
{
int num=5;
int squ=num*num;
int num1=num;
int c=0;
while(num>0)
{
int r=num%10;
c++;
num=num/10;
}
int div=1;
int lastdigit=0;
while(c>0)
{
div=div*10;

 lastdigit=squ%div;
c--;
}
if(lastdigit==num1)
{
System.out.println("Automorphic Number");
}
else{
System.out.println("Not Automorphic Number");
}
}
}
/* Output:-
compile time-success
runtime-success
Automorphic Number
*/


class CountOfEvenOrOddnumber
{
public static void main(String[]args)
{
int a=120303;
int even=0;
int odd=0;
do
{
int b=a%10;
if(b%2==0)
{
even++;
}
else{
odd++;
}
a=a/10;
}while(a>0);
System.out.println("even number:"+even);
System.out.println("odd number:"+odd);
}
}
/*
Output
Compile time-success
Run time-
even number:3
odd number:3
*/
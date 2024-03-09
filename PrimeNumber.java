class PrimeNumber
{
public static void main(String []args)
{
int a=13;
int b=2;
int c=0;
while(b<0)
{
if(a%b==0)
{
c++;
}
b++;
}
if(c==0)
{
System.out.println("is a prime number");
}
}

}
/*
output-
  Compile time-Success
  Run time -is a prime number
  */

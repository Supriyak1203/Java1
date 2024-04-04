class BinaryNumber
{
public static void main(String[]args)
{
int a=45;
int binary=0;
int n=1;
while(a>0)
{
int r=a%2;
binary=binary+(r*n);
n=n*10;
a=a/2;
}
System.out.println(binary);
}
}

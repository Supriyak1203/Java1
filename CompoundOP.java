class CompoundOP
{
public static void main(String [] args)
{
int a=150;
float a1=60.0f;
//a=a*a1
//System.out.println(a);//compile time error
a *= a1;
System.out.println(a);
}
}
//output
compile time-success
runtime-9000
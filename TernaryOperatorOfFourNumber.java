class TernaryOperatorOfFourNumber
{
public static void main(String []args)
{
int a=20;
int b=40;
int c=60;
int d=80;
//check which condition is true
int s=(a>b)?((a>c)?((a>d)?a:d):((c>d)?(c):(d))):((b>c)?((b>d)?b:d):((c>d)?c:d));
System.out.println("Greatest Number is:"+s);
}
}

//output
compile time-success
runtime-Greatest Number is:80




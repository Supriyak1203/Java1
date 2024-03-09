class BuzzAlphabhet
{
public static void main(String [] args)
{
int a=65;
while(a<=90)
{
char b=(char)a;
if(b%7==0 ||b%10==7)
{
System.out.println(b);

}
a++;
}
}
}
/*
 * Output
 * Compile time-Success
 * Run time-
C
F
M
T
W
 * 
 */
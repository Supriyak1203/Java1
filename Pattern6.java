class Pattern6
{
public static void main(String[]args)
{

for(int i=1;i<=6;i++)
{
for(int j=1;j<=6;j++)
{
if(j==(6-i+1) || j==1 || j==6 ||i==1 || i==6 || i==j)
{
System.out.print("*");
}
else
{
System.out.print(" ");
}

}
System.out.println();

}
}
}
/*output-
compile time-success
Run time-success
******
**  **
* ** *
* ** *
**  **
******
*/
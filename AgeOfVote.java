
class AgeOfVote
{
public static void main(String[]args)
{
int age1=54;
int age2=11;
int age3=18;
int age4=12;
int age5=22;
boolean result=age1>18;
System.out.println("eligible age1 to vote:"+(age1>18));
System.out.println("eligible age2 to vote:"+(age2>18));
System.out.println("eligible age3 to vote:"+(age3>18));
System.out.println("eligible age4 to vote:"+(age4>18));
System.out.println("eligible age5 to vote:"+(age5>18));
}
}
//output
compile time-success
runtime-eligible age1 to vote:true
eligible age2 to vote:false
eligible age3 to vote:false
eligible age4 to vote:false
eligible age5 to vote:true
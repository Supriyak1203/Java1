class PrintEvenNumber
{
public static void main(String[] args)
{
int i=0;
int j=0;
while(true)
{
if(j%2==0)
{
i++;
System.out.println(j);
}
j++;

if(i==10)
{
break;
}
}
}
}

/*
 * Output
 * Compile time-Success
 * Run time-0
2
4
6
8
10
12
14
16
18
 */
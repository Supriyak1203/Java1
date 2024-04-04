class SunnyNumber
{
public static void main(String[] args)
{
int num=15;
int r=0;
for(int i=0;i<=num;i++)
{
    r=i*i;
    int p=r-1;
    if(p==num)
    {
        System.out.println("Sunny Number");
        break;
    }
    if(i==num)
    {
        System.out.println("Not Sunny Number");
    }
}

}
}
/*
 * Output-
 * compile time-success
 * runtime-success
 * Sunny Number

 */

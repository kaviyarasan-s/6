import java.util.*;
class leapyear
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int yr=sc.nextInt();
        if(yr%2==0)
        {
            System.out.print("Leap year");
        }
        else
        {
            System.out.print("Not Leap year");
        }
    }
}

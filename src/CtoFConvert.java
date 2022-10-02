import java.util.Scanner;
class Main
{
    public static void main(String[] args)
    {
        float C,F;

        Scanner scan=new Scanner(System.in);
        System.out.println("enter C temperature here :");
        C=scan.nextInt();

        if(C==0)
        {
            System.out.println("you are in freezing point");
        }
        else if(C==100)
        {
            System.out.println("you are in boiling point");
        }

        else
        {
            F= C * 9/5 + 32;

            System.out.println("temperature in F here: "+F);
        }
    }
}
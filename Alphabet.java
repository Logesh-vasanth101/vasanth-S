import java.util.Scanner;

class JavaProgram
{
    public static void main(String args[])
    {
        char ch;
        Scanner scan = new Scanner(System.in);
        ch = scan.next().charAt(0);
		
        if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
        {
            System.out.print(  "Alphabet");
        }
        else
        {
            System.out.print(  "   not  ");
        }
    }
}

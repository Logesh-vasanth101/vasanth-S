import java.util.Scanner;
 class JavaExample
{
   public static void main(String[ ] arg)
   {
	boolean isVowel=false;
	Scanner s=new Scanner(System.in);
	char ch=s.next().charAt(0); 
	switch(ch)
	{
	   case 'a' :
	   case 'e' :
           case 'i' :
	   case 'o' :
	   case 'u' :
	   case 'A' :
	   case 'E' :
	   case 'I' :
	   case 'O' :
	   case 'U' : isVowel = true;
	}
	if(isVowel == true) {
	   System.out.println("Vowel");
	}
	else {
	   if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
		System.out.println("Consonant");
	   else
		System.out.println("Invalid");		
        }
   }
}

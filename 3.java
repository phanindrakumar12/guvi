import java.util.Scanner;

    class Postive_Negative 

    {

        public static void main(String[] args) 

        {

            char ch;

            Scanner scan = new Scanner(System.in);

            System.out.print("Enter the charecter you want to check:");

           ch = scan.next().charAt(0);

            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')

            {

                System.out.println("The given char "+ch+" is vowel");

            }

            else 

            {

                System.out.println("The given char "+ch+" is consonant");

            }

        }

    }
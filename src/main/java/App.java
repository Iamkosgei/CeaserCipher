import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" What do you want to do?\n 1. Encode \n 2. Decode  \n 3. Quit");
        int choice = scanner.nextInt();

       if(choice == 1)
       {
           System.out.println("Enter a text");
           String inputText = scanner.nextLine().toUpperCase();
           System.out.println("Enter the key");
           int key = scanner.nextInt();

           Encoding encoding = new Encoding(inputText,key);

           if (encoding.isValidInputText() && encoding.isValidKey())
           {

           }
           else
           {
               System.out.println("Please make sure that your inputs are valid");
           }
       }
       else if(choice == 2)
       {
           System.out.println("encode");
       }
       else if(choice == 3)
       {
           System.out.println(" quit");
       }
       else
       {
           System.out.println("Input not known");
       }
    }
}

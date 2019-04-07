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

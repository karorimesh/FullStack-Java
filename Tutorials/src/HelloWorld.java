import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Enter a sentence: ");
        Scanner hello = new Scanner(System.in);
        String Hello =hello.nextLine();
        System.out.println("You typed =>"+Hello);
    }
}

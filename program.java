import java.util.Scanner;
public class program {
    public static void main(String[] args) {
    Scanner iScanner= new Scanner(System.in); 
    System.out.println("What is you name");
    String name = iScanner.nextLine();
    System.out.printf("Hi, %s!", name);
    iScanner.close();
    }
}

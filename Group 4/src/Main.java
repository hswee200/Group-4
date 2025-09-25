import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String letter;
        System.out.print("Enter a letter: ");
        letter = input.nextLine();
        switch (letter){
            case "a", "b", "c" -> System.out.println(2);
            case "d", "e", "f" -> System.out.println(3);
            case "g", "h", "i" -> System.out.println(4);
            case "j", "k", "l" -> System.out.println(5);
            case"m","n","o" -> System.out.println(6);
            case "p", "q", "r","s"-> System.out.println(7);
            case "t", "u", "v"-> System.out.println(8);
            case "w", "x", "y","z"-> System.out.println(9);
            default -> System.out.println("Invalid character");
        }


    }
}
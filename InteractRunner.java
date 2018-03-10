import java.util.Scanner;

public class InteractRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            Calculator cl = new Calculator();
            String exit = "no";
            while (!exit.equals("yes")) {
                System.out.println("Enter first number: ");
                String first = scanner.next();
                System.out.println("Enter second number: ");
                String second = scanner.next();
                cl.add(Integer.valueOf(first),Integer.valueOf(second));
                System.out.println("Result: " +cl.getResult());
                cl.cleanResult();
                System.out.println("Exit yes/no ");
                exit = scanner.next();
            }
        }finally {
            scanner.close();
        }
    }
}
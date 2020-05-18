
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {
        String pizza = "Pizza 75.00 2\n";
        String kebab = "Kebab 45.00 1\n";
        String cola = "Cola 9.50 3";
        double totalPrice = 75.00+45.00+9.50;

        FileWriter fw = new FileWriter("orders.txt");
        fw.write(pizza + kebab + cola);
        fw.close();

        File file = new File("orders.txt");

        if (file.exists()) {

            for (int i = 0; i < file.length(); i++) {
                Scanner scanner = new Scanner(file);
                pizza = scanner.nextLine();
                kebab = scanner.nextLine();
                cola = scanner.nextLine();
            }
            System.out.println(pizza + "\n" + kebab + "\n" + cola);
            System.out.print("The total price will be >>>>> " + totalPrice);
        }


    }
}

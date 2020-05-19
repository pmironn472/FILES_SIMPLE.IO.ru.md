
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {
        String pizza = "Pizza 75.00 2\n";
        String kebab = "Kebab 45.00 1\n";
        String cola = "Cola 9.50 3";
        String totalprice= "The total price will be >>>>>> ";
        double totalPrice = 75.00+45.00+9.50;

        FileWriter fw = new FileWriter("orders.txt");
        fw.write(pizza + kebab + cola + "\n"+totalprice+ totalPrice);
        fw.close();



        File file = new File("orders.txt");


        if (file.exists())
            System.out.println("File Found");
        else System.err.println("File Not Found");


        System.out.println();

        Scanner in = new Scanner(file);
            for(int i = 0; i < 4;i++){
                String data = in.nextLine();
                System.out.println(data);
        }


    }
}

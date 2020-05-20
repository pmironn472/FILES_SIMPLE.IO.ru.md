
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) throws IOException {

        writeText();

        readText();





    }

    public static void writeText()  {

        BufferedReader  in = new BufferedReader(new InputStreamReader(System.in));
        Stream<String> stream = in.lines().limit(4);
        try (PrintWriter pw = new PrintWriter("Orders.txt", StandardCharsets.UTF_8)){
            stream.map(s -> s).forEachOrdered(pw::println);

        }catch (IOException e){
            System.out.println("Error");
        }

    }

    public static void readText() {
        try {
            File file = new File("Orders.txt");
                Scanner in = new Scanner(file);
                for (int i = 0; i < 4; i++) {
                    String data = in.nextLine();
                    System.out.println(data);
                }
        }catch (FileNotFoundException e){
            System.out.println("Error, file not found");
        }catch (NoSuchElementException e){
            System.out.println("No data");
        }finally {
            System.out.println();
            System.out.println("Thanks , for using our app");
        }


    }
}

import java.io.*;

public class Filehandling {
    public static void main(String[] args) throws IOException {

        // File creating
        File file = new File("Anas.txt");
        if (file.createNewFile()) {
            System.out.println(file.getName() + " is created...");
        } else {
            System.out.println("Failed to create " + file.getName());
        }

        // Write operation
        FileWriter fw = new FileWriter(file);
        fw.write("Welcome to Tata Strive");
        System.out.println("File write operation...");

       //Read Operation in the file
        FileReader fr = new FileReader(file);
        int data = fr.read();
        while (data != -1) {
            System.out.print((char) data);
            data = fr.read();
        }
        // Deleting the created file
        System.out.println("\nDelete operation..");
        if (file.exists()) {
            file.delete();
            System.out.println(file.getName() + " File Deleted Successfully..");
        } else {
            System.out.println("File not exist..!!");
        }
    }
}
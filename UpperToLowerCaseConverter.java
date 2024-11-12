import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class UpperToLowerCaseConverter {
    public static void main(String[] args) {
        String inputFilePath = "C:\\Users\\Pranav Thombre\\OneDrive\\Desktop\\PRANAV MSC CS MATERIAL\\MSC 2ND YEAR\\PRACTICAL\\SOFTWARE ARCHITECTURE AND IOTinput.txt";  // Input file path
        String outputFilePath = "output.txt"; // Output file path

        try (FileReader reader = new FileReader(inputFilePath);
             FileWriter writer = new FileWriter(outputFilePath)) {

            int character;
            while ((character = reader.read()) != -1) {
                // Convert character to lowercase and write to output file
                writer.write(Character.toLowerCase((char) character));
            }
            System.out.println("Conversion complete. Check the output file: " + outputFilePath);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
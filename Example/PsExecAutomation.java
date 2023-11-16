package Example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PsExecAutomation {
    public static void main(String[] args) {
        // Replace 'notepadPath' with the path to your notepad file.
        String notepadPath = "C:\\path\\to\\your\\notepad.txt";

        try {
            // Create a batch script.
            StringBuilder batchScript = new StringBuilder();

            BufferedReader reader = new BufferedReader(new FileReader(notepadPath));
            String line;
            while ((line = reader.readLine()) != null) {
                line = line.trim();
                if (!line.isEmpty()) {
                    String command = "psexec \\\\" + line + " cmd.exe /c sod.vbs";
                    batchScript.append(command).append("\n");
                }
            }
            reader.close();

            // Write the batch script to a temporary file.
            String batchScriptPath = "C:\\path\\to\\batchScript.bat"; // Replace with your desired path.
            Util.writeToFile(batchScriptPath, batchScript.toString());

            // Execute the batch script.
            ProcessBuilder processBuilder = new ProcessBuilder("cmd.exe", "/c", batchScriptPath);
            processBuilder.redirectErrorStream(true);
            Process process = processBuilder.start();

            // Read and print the output of the batch script execution.
            BufferedReader scriptOutputReader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String scriptOutput;
            while ((scriptOutput = scriptOutputReader.readLine()) != null) {
                System.out.println(scriptOutput);
            }

            // Wait for the process to complete.
            int exitCode = process.waitFor();
            System.out.println("Batch script execution completed with exit code: " + exitCode);

            // Clean up the temporary batch script file.
            Util.deleteFile(batchScriptPath);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Util {
    static void writeToFile(String filePath, String content) throws IOException {
        java.io.FileWriter writer = new java.io.FileWriter(filePath);
        writer.write(content);
        writer.close();
    }

    static void deleteFile(String filePath) {
        java.io.File file = new java.io.File(filePath);
        if (file.exists()) {
            file.delete();
        }
    }
}

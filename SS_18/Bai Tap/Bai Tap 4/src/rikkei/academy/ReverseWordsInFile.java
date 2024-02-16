package rikkei.academy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWordsInFile {

    public static void main(String[] args) {
        // Bước 1: Tạo file gốc và nhập văn bản
        String originalFilePath = "original.txt";
        createAndWriteOriginalFile(originalFilePath);

        // Bước 2: Đọc văn bản từ file gốc
        String fileContent = readFileToString(originalFilePath);

        // Bước 3: Chuyển string thành mảng string với mỗi từ là một phần tử
        String[] wordsArray = fileContent.split("\\s+");

        // Bước 4: Đảo ngược mảng string và đổi lại thành một string
        List<String> reversedWordsList = Arrays.asList(wordsArray);
        Collections.reverse(reversedWordsList);
        StringBuilder reversedContent = new StringBuilder();
        for (String word : reversedWordsList) {
            reversedContent.append(word).append(" ");
        }

        // Bước 5: Ghi ra file mới
        String newFilePath = "reversed.txt";
        writeStringToFile(newFilePath, reversedContent.toString());

        // In nội dung file mới đã tạo
        System.out.println(readFileToString(newFilePath));
    }

    private static void createAndWriteOriginalFile(String filePath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write("This is a sample text file for testing.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String readFileToString(String filePath) {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content.toString();
    }

    private static void writeStringToFile(String filePath, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


package rikkei.academy;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class Main {
    private static void copyFileUsingJava7Files(File source, File dest) throws IOException {
        Files.copy(source.toPath(), dest.toPath(),
                StandardCopyOption.REPLACE_EXISTING);
    }

    private static void copyFileUsingStream(File source, File dest) throws IOException {
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        } finally {
            is.close();
            os.close();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập file nguồn:");
        String sourcePath = scanner.nextLine();
        System.out.println("Nhập file đích:");
        String destPath = scanner.nextLine();

        File sourceFile = new File(sourcePath);
        File destFile = new File(destPath);

        try {
            copyFileUsingStream(sourceFile, destFile);
            System.out.println("Copy đã hoàn thành");
        } catch (IOException ioe) {
            System.out.println("Không thể copy tệp này!");
            System.out.println(ioe.getMessage());
        }
    }
}
// /Users/tranvanduc/Documents/Tài liệu - MacBook Pro của Trần/Module 2/SS_18/Bai Tap/Bai Tap 2/src/rikkei/academy/source.txt
// /Users/tranvanduc/Documents/Tài liệu - MacBook Pro của Trần/Module 2/SS_18/Bai Tap/Bai Tap 2/src/rikkei/academy/dest






















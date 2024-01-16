package baitap15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NewsScraper {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://vnexpress.net/");

            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
            StringBuilder content = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                content.append(line);
            }

            // Đóng reader
            reader.close();

            // Loại bỏ tất cả các dòng mới
            String sanitizedContent = content.toString().replaceAll("\\n+", "");

            // Regex
            Pattern pattern = Pattern.compile("<h3 class=\"title-news\"><a href=\"(.*?)\".*?>(.*?)</a>");
            Matcher matcher = pattern.matcher(sanitizedContent);

            // Hiển thị danh sách các bản tin
            System.out.println("Danh sách bản tin:");
            while (matcher.find()) {
                System.out.println(matcher.group(2) + " - Link: " + matcher.group(1));
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


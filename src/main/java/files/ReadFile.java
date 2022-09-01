package files;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.HashMap;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        File file = new File("Sherlock.txt");
        String readFromFile = FileUtils.readFileToString(file, "UTF-8");

        String[] words = readFromFile.split(" ");
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (String word : words) {
            if (map.containsKey(word)) {
                int count = map.get(word);
                map.put(word, count + 1);
            } else map.put(word, 1);
        }
        FileUtils.writeLines(new File("NumberOfUniqueWords.txt"), StandardCharsets.UTF_8.name(), Collections.singleton(map));
    }
}

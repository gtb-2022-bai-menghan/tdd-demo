package com.tw.cn.cap.gtb.todo.util;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.*;

public class FileUtils {
    static final String path = System.getProperty("user.home") + File.separator + ".todo" + File.separator + "tasks";
    static final File file = new File(path);

    public static List<String> readFile() {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            Scanner scanner = new Scanner(fileInputStream);
            List<String> result = new ArrayList<>();
            while (scanner.hasNext()) {
                result.add(scanner.nextLine());
            }
            return result;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void writeFile(List<String> args) {
        try (FileOutputStream fileOutputStream = new FileOutputStream(file);) {
            List<String> fileContentPrev = new ArrayList<>(readFile());
            StringBuilder fileContentNow = new StringBuilder();
            for (String s : fileContentPrev) {
                fileContentNow.append(s).append("\n");
            }
            for (String arg : args) {
                fileContentNow.append(arg).append("\n");
            }
            fileOutputStream.write(fileContentNow.toString().getBytes(StandardCharsets.UTF_8));
            fileOutputStream.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

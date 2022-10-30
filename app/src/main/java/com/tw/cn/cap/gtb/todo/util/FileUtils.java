package com.tw.cn.cap.gtb.todo.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileUtils {
    public static List<String> readFile() {
        String path = System.getProperty("user.home") + File.separator + ".todo" + File.separator + "tasks";
        File file = new File(path);
        try {
            Scanner scanner = new Scanner(new FileInputStream(file));
            List<String> result = new ArrayList<>();
            while (scanner.hasNext()) {
                result.add(scanner.nextLine());
            }
            return result;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

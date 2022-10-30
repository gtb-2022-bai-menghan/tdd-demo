package com.tw.cn.cap.gtb.todo.command;

import com.tw.cn.cap.gtb.todo.util.FileUtils;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.List;

public class CommandUtilTest {
    static List<String> saveFileContent = new ArrayList<>();

    @BeforeAll
    static void beforeAll() {
        saveFileContent = FileUtils.readFile();
    }

    @AfterAll
    static void afterAll() {
        FileUtils.writeFile(saveFileContent);
    }
}

package com.tw.cn.cap.gtb.todo.command;

import com.tw.cn.cap.gtb.todo.util.FileUtils;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;
import java.util.List;

public class CommandUtilTest {
    static List<String> saveFileContent = new ArrayList<>();

    @BeforeEach
    void setUp() {
        saveFileContent = FileUtils.readFile();
    }

    @AfterEach
    void tearDown() {
        FileUtils.writeFile(saveFileContent);
    }
}

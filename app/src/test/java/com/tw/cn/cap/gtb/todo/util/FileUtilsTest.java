package com.tw.cn.cap.gtb.todo.util;

import com.tw.cn.cap.gtb.todo.command.CommandUtilTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FileUtilsTest extends CommandUtilTest {
    @Test
    void readFile() {
        List<String> fileContent = FileUtils.readFile();
        Assertions.assertEquals(List.of("foo", "bar"), fileContent);
    }

    @Test
    void writeFile() {
        List<String> fileContentPrev = FileUtils.readFile();
        List<String> addFileContent = new ArrayList<>(fileContentPrev);
        addFileContent.add("Task 00");
        FileUtils.writeFile(addFileContent);
        List<String> fileContentNow = FileUtils.readFile();
        Assertions.assertEquals(addFileContent, fileContentNow);
    }
}
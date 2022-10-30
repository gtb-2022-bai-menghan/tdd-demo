package com.tw.cn.cap.gtb.todo.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FileUtilsTest {
    @Test
    void readFile() {
        List<String> fileContent = FileUtils.readFile();
        Assertions.assertEquals(List.of("foo", "bar"), fileContent);
    }
}
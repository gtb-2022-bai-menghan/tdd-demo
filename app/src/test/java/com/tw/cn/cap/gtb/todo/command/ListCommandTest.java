package com.tw.cn.cap.gtb.todo.command;

import com.tw.cn.cap.gtb.todo.util.FileUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListCommandTest {
    @Test
    void listShower() {
        List<String> readFile = FileUtils.readFile();
        ListCommand listCommand = new ListCommand();
        Assertions.assertEquals(List.of("# To be done","1 foo", "2 bar", "3 Task 00"),
                listCommand.listShower(readFile));
    }
}
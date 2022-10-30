package com.tw.cn.cap.gtb.todo.command;

import com.tw.cn.cap.gtb.todo.util.FileUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class ListCommandTest {
    ListCommand listCommand = new ListCommand();
    @Test
    void listSort() {
        List<String> readFile = FileUtils.readFile();
        List<String> listSort = listCommand.listSortAndShow(readFile);
        Assertions.assertEquals(List.of("# To be done","1 foo", "2 bar", "3 Task 00", "# completed","1 foo bar"), listSort);
    }

    @Test
    void listShower() {
        Assertions.assertEquals(List.of("# To be done","1 foo", "2 bar", "3 Task 00"),
                listCommand.listShower(List.of("foo", "bar", "Task 00"), "# To be done"));

        Assertions.assertEquals(List.of("# completed","1 foo", "2 bar", "3 Task 00"),
                listCommand.listShower(List.of("foo", "bar", "Task 00"), "# completed"));
    }
}
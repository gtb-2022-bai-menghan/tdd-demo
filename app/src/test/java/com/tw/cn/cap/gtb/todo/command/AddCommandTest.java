package com.tw.cn.cap.gtb.todo.command;

import com.tw.cn.cap.gtb.todo.util.FileUtils;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AddCommandTest extends CommandUtilTest{
    @Test
    void listAdd() {
        AddCommand addCommand = new AddCommand();
        addCommand.listAdd("add", "f o o", "b a r");
        List<String> readFile = FileUtils.readFile();
        Assertions.assertEquals(List.of("# To be done","1 foo", "2 bar", "3 f o o", "4 b a r", "# completed","1 foo bar"), new ListCommand().listSortAndShow(readFile));
    }
}
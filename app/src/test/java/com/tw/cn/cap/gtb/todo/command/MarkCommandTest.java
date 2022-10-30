package com.tw.cn.cap.gtb.todo.command;

import com.tw.cn.cap.gtb.todo.util.FileUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MarkCommandTest extends CommandUtilTest {
    @Test
    void listMark() {
        MarkCommand markCommand = new MarkCommand();
        markCommand.listMark("mark", "1", "3");
        List<String> readFile = FileUtils.readFile();
        Assertions.assertEquals(List.of("# To be done", "1 bar", "# completed", "1 foo", "2 foo bar"), new ListCommand().listSortAndShow(readFile));
    }
}
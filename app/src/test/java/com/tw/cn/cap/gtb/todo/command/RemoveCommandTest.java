package com.tw.cn.cap.gtb.todo.command;

import com.tw.cn.cap.gtb.todo.util.FileUtils;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RemoveCommandTest {
    @Test
    void listRemove() {
        RemoveCommand removeCommand = new RemoveCommand();
        removeCommand.listRemove("remove", "1", "4");
        List<String> readFile = FileUtils.readFile();
        Assertions.assertEquals(List.of("# To be done", "1 bar", "2 Task 00", "# completed","Empty"), new ListCommand().listSortAndShow(readFile));
    }
}
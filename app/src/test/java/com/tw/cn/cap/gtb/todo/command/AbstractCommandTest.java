package com.tw.cn.cap.gtb.todo.command;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AbstractCommandTest {
    AbstractCommand abstractCommand = new AbstractCommand();

    @Test
    void getCommand() {
        String command = abstractCommand.getCommand("add", "foobar", "foo   bar");
        Assertions.assertEquals("add", command);
    }

    @Test
    void getArgs() {
        List<String> args = abstractCommand.getArgs("add", "foobar", "foo   bar");
        Assertions.assertEquals(List.of("foobar", "foo   bar"), args);
        args = abstractCommand.getArgs("list");
        Assertions.assertEquals(0, args.size());
    }

    @Test
    void execute() {
    }
}
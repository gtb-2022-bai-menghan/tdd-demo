package com.tw.cn.cap.gtb.todo.util;

import com.tw.cn.cap.gtb.todo.command.*;

public class CommonUtils {
    static public Command getCommand(String... args) {
        String command = args[0];
        return switch (command) {
            case "add" -> new AddCommand();
            case "list" -> new ListCommand();
            case "mark" -> new MarkCommand();
            case "remove" -> new RemoveCommand();
            default -> null;
        };
    }
}

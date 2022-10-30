package com.tw.cn.cap.gtb.todo.command;

import java.util.List;

public interface Command{
    String getCommand(String[] args);

    List<String> getArgs(String[] args);

    void execute(String... args);
}

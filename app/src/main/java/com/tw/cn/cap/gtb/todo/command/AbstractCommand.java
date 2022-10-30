package com.tw.cn.cap.gtb.todo.command;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class AbstractCommand implements Command{

    @Override
    public String getCommand(String[] args) {
        return args[0];
    }

    @Override
    public List<String> getArgs(String[] args) {
        return new ArrayList<>(Arrays.asList(args).subList(1, args.length));
    }

    @Override
    public void execute() {

    }
}

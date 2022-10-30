package com.tw.cn.cap.gtb.todo.command;

import com.tw.cn.cap.gtb.todo.util.UpdateListFlag;

import java.util.List;

public class AddCommand extends AbstractCommand {
    @Override
    public void doExecute(String... args) {
        listAdd(args);
    }

    public void listAdd(String... args) {
        List<String> listArg = getArgs(args);
        UpdateListFlag.updateAddListFlag(listArg);
    }
}

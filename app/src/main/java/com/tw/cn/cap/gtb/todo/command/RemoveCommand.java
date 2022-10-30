package com.tw.cn.cap.gtb.todo.command;

import com.tw.cn.cap.gtb.todo.util.UpdateListFlag;

import java.util.List;

public class RemoveCommand extends AbstractCommand {

    @Override
    public void doExecute(String... args) {
        listRemove(args);
    }

    public void listRemove(String... args) {
        List<String> listArg = getArgs(args);
        UpdateListFlag.updateRemoveAndMarkListFlag(listArg, "-");
    }
}

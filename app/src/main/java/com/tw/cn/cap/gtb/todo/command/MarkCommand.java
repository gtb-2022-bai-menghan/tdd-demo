package com.tw.cn.cap.gtb.todo.command;

import com.tw.cn.cap.gtb.todo.util.UpdateListFlag;

import java.util.List;

public class MarkCommand extends AbstractCommand{
    @Override
    public void doExecute(String... args) {
        listMark(args);
    }

    public void listMark(String... args) {
        List<String> listArg = getArgs(args);
        UpdateListFlag.updateRemoveAndMarkListFlag(listArg, "√");
    }
}

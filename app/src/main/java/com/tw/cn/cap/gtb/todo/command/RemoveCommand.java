package com.tw.cn.cap.gtb.todo.command;

import com.tw.cn.cap.gtb.todo.util.FileUtils;
import com.tw.cn.cap.gtb.todo.util.UpdateListFlag;

import java.util.ArrayList;
import java.util.List;

public class RemoveCommand extends AbstractCommand {

    @Override
    public List<String> doExecute(String... args) {
        listRemove(args);
        return null;
    }

    public void listRemove(String... args) {
        List<String> listArg = getArgs(args);
        UpdateListFlag.updateRemoveAndMarkListFlag(listArg, "-");
    }
}

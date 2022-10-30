package com.tw.cn.cap.gtb.todo.command;

import com.tw.cn.cap.gtb.todo.util.FileUtils;
import com.tw.cn.cap.gtb.todo.util.UpdateListFlag;

import java.util.ArrayList;
import java.util.List;

public class AddCommand extends AbstractCommand {
    @Override
    public List<String> doExecute(String... args) {
        listAdd(args);
        return null;
    }

    public void listAdd(String... args) {
        List<String> listArg = getArgs(args);
        UpdateListFlag.updateAddListFlag(listArg);
    }
}

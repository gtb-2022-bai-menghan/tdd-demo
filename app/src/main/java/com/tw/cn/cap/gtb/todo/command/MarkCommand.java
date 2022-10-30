package com.tw.cn.cap.gtb.todo.command;

import com.tw.cn.cap.gtb.todo.util.FileUtils;
import com.tw.cn.cap.gtb.todo.util.UpdateListFlag;

import java.util.List;

public class MarkCommand extends AbstractCommand{
    @Override
    public List<String> doExecute(String... args) {
        listMark();
        return null;
    }

    public void listMark(String... args) {
        List<String> listArg = getArgs(args);
        UpdateListFlag.updateRemoveAndMarkListFlag(listArg, "√");
    }
}

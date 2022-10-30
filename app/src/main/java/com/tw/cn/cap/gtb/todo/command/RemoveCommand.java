package com.tw.cn.cap.gtb.todo.command;

import com.tw.cn.cap.gtb.todo.util.FileUtils;

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
        List<String> readFile = FileUtils.readFile();
        for (String s : listArg) {
            int index = Integer.parseInt(s) - 1;
            readFile.set(index, "-" + " " + readFile.get(index));
        }
        FileUtils.writeFile(readFile);
    }
}

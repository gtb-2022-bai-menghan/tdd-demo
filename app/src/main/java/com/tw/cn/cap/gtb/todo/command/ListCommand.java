package com.tw.cn.cap.gtb.todo.command;

import com.tw.cn.cap.gtb.todo.util.FileUtils;

import java.util.ArrayList;
import java.util.List;

public class ListCommand extends AbstractCommand{
    @Override
    public List<String> execute() {
        super.execute();
        List<String> readFile = FileUtils.readFile();
        return listShower(readFile);
    }

    public List<String> listShower(List<String> lists) {
        ArrayList<String> listAfterFormat = new ArrayList<>();
        listAfterFormat.add("# To be done");
        for (int i = 0; i < lists.size(); i++) {
            listAfterFormat.add((i+1) + " " + lists.get(i));
        }
        return listAfterFormat;
    }
}

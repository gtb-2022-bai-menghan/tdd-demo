package com.tw.cn.cap.gtb.todo.command;

import com.tw.cn.cap.gtb.todo.util.FileUtils;

import java.util.ArrayList;
import java.util.List;

public class ListCommand extends AbstractCommand{
    @Override
    public List<String> doExecute(String... args) {
        List<String> readFile = FileUtils.readFile();
        return listSortAndShow(readFile);
    }

    public List<String> listSortAndShow(List<String> lists) {
        List<String> toBeDone = new ArrayList<>();
        List<String> completed = new ArrayList<>();
        for (String list : lists) {
            String flag = list.substring(0, 1);
            String content = list.substring(2);
            switch (flag) {
                case "+" -> toBeDone.add(content);
                case "√" -> completed.add(content);
            }
        }
        List<String> result = new ArrayList<>();
        result.addAll(listShower(toBeDone, "# To be done"));
        result.addAll(listShower(completed, "# completed"));
        return result;
    }

    public List<String> listShower(List<String> lists, String title) {
        ArrayList<String> listAfterFormat = new ArrayList<>();
        listAfterFormat.add(title);
        if (lists.isEmpty()) {
            listAfterFormat.add("Empty");
        } else {
            for (int i = 0; i < lists.size(); i++) {
                listAfterFormat.add((i+1) + " " + lists.get(i));
            }
        }
        return listAfterFormat;
    }
}

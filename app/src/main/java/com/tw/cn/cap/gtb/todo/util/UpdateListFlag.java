package com.tw.cn.cap.gtb.todo.util;

import java.util.ArrayList;
import java.util.List;

public class UpdateListFlag {
    static public void updateRemoveAndMarkListFlag(List<String> listArg, String flag) {
        List<String> readFile = FileUtils.readFile();
        for (String s : listArg) {
            int index = Integer.parseInt(s) - 1;
            String line = readFile.get(index);
            String oldFlag = line.substring(0, 1);
            readFile.set(index, line.replace(oldFlag, flag));
        }
        FileUtils.writeFile(readFile);
    }

    static public void updateAddListFlag(List<String> listArg) {
        List<String> listArgAfterAddFlag = new ArrayList<>();
        for (String s : listArg) {
            listArgAfterAddFlag.add("+" + " " + s);
        }
        List<String> readFile = FileUtils.readFile();
        readFile.addAll(listArgAfterAddFlag);
        FileUtils.writeFile(readFile);
    }
}

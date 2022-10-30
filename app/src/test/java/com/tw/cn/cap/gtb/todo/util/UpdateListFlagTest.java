package com.tw.cn.cap.gtb.todo.util;

import com.tw.cn.cap.gtb.todo.command.CommandUtilTest;
import com.tw.cn.cap.gtb.todo.command.ListCommand;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UpdateListFlagTest extends CommandUtilTest {

    @Test
    void updateRemoveAndMarkListFlag() {
        UpdateListFlag.updateRemoveAndMarkListFlag(List.of("1", "2"), "-");
        List<String> readFile = FileUtils.readFile();
        Assertions.assertEquals(List.of("# To be done", "Empty", "# completed","1 foo bar"), new ListCommand().listSortAndShow(readFile));
    }

    @Test
    void updateAddListFlag() {
        UpdateListFlag.updateAddListFlag(List.of("f o o", "b a r"));
        List<String> readFile = FileUtils.readFile();
        Assertions.assertEquals(List.of("# To be done","1 foo", "2 bar", "3 f o o", "4 b a r", "# completed","1 foo bar"), new ListCommand().listSortAndShow(readFile));
    }
}
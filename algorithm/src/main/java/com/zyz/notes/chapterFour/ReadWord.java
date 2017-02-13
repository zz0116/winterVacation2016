package com.zyz.notes.chapterFour;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by ZhangYuanzhuo on 2017/2/10.
 */
public class ReadWord {
    private List<String> list;

    public List<String> getList() {
        return list;
    }

    public ReadWord(String textPath) {
        File file = new File(textPath);
        BufferedReader reader;
        StringBuilder buffer = new StringBuilder();
        String line;
        try {
            reader = new BufferedReader(new FileReader(file));
            while ((line = reader.readLine())!=null) {
                buffer.append(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Pattern compile = Pattern.compile("[a-zA-Z]+");
        String lowerCase = buffer.toString().toLowerCase();
        Matcher matcher = compile.matcher(lowerCase);

        list = new ArrayList<>();
        while (matcher.find()) {
            list.add(matcher.group());
        }
    }
}

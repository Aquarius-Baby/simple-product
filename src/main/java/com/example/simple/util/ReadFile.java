package com.example.simple.util;

import java.io.*;
import java.util.TreeMap;

/**
 * 文件的读取与输出
 */
public class ReadFile {
    public static void main(String[] args) throws Exception {
        String fileName = "C:\\Users\\CMY\\Desktop\\input.txt";
        String newFileName = "C:\\Users\\CMY\\Desktop\\bbb.txt";
        read(fileName, newFileName);
    }

    private static void read(String name, String newFileName) throws Exception {
        File file = new File(name);
        if (file.exists()) {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

//            FileInputStream inputStream = new FileInputStream(file);
//            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
//            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            String line;
            TreeMap<String, Integer> wordsMap = new TreeMap<>();
            while ((line = bufferedReader.readLine()) != null) {
                String[] wordArray = line.split(" ");
                for (String word : wordArray) {
                    if (wordsMap.containsKey(word)) {
                        int count = wordsMap.get(word);
                        wordsMap.put(word, count + 1);
                    } else {
                        wordsMap.put(word, 1);
                    }
                }
            }
            bufferedReader.close();

            File newFile = new File(newFileName);
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(newFile));
            for (String word : wordsMap.keySet()) {
                String t = word + " " + wordsMap.get(word)+"\n";
                bufferedWriter.write(t);
            }
            bufferedWriter.close();
        }
    }
}

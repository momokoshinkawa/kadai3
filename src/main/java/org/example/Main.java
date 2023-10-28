package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> studentScores = new HashMap<>();

        studentScores.put("田中", 680);
        studentScores.put("鈴木", 870);
        studentScores.put("佐藤", 710);

        try {
            String name = "新川";
            int score = studentScores.get(name);
            System.out.println(name + "のTOEICスコア:" + score);
        } catch (Exception e) {
            System.out.println("Error！");
        }
    }
}



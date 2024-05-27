/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.sherlockandvalidstring;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Nhat Anh
 */
public class SherlockAndValidString {

    public static String isValid(String s) {
        HashMap<Character, Integer> mapCount = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (!mapCount.containsKey(c)) {
                mapCount.put(c, 1);
            } else {
                mapCount.replace(c, mapCount.getOrDefault(c, 0) + 1);
            }
        }
        HashMap<Integer, Integer> frequence = new HashMap<>();
        for (int value : mapCount.values()) {
            frequence.put(value, frequence.getOrDefault(value, 0) + 1);
        }
        if (frequence.size() == 1) {
            return "YES";
        } else if (frequence.size() == 2) {
            int fre1 = (int) frequence.keySet().toArray()[0];
            int count1 = frequence.get(fre1);
            int fre2 = (int) frequence.keySet().toArray()[1];
            int count2 = frequence.get(fre2);

            if (((fre1 - fre2 == 1) && count1 ==1) ||((fre2 - fre2 == 1) && count1 ==1)  ) {

            }
}
            return "NO";
        }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(isValid(s));
    }
}

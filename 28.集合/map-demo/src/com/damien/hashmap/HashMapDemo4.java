package com.damien.hashmap;

import java.util.HashMap;
import java.util.Set;

/**
 *  HashMap嵌套HashMap
 *
 *  呆萌钟IT教育
 *          Java
 *              学生A  20
 *              学生B  21
 *          Linux
 *              学生C  23
 *              学生D  24
 *          算法
 *              学生E  20
 */
public class HashMapDemo4 {
    public static void main(String[] args) {
        //创建学校集合
        HashMap<String, HashMap<String, Integer>> itHm = new HashMap<>();

        //创建课程集合对象
        HashMap<String, Integer> javaHm = new HashMap<>();
        javaHm.put("呆萌钟",23);
        javaHm.put("米豆",18);

        HashMap<String, Integer> linuxHm = new HashMap<>();
        linuxHm.put("老付",25);
        linuxHm.put("眨眼间",22);

        HashMap<String, Integer> sfHm = new HashMap<>();
        sfHm.put("ZJ",29);
        sfHm.put("努力",23);

        itHm.put("Java",javaHm);
        itHm.put("Linux",linuxHm);
        itHm.put("算法",sfHm);

        //遍历集合
        Set<String> kcSet = itHm.keySet();
        for (String kcKey:kcSet) {
            System.out.println(kcKey);
            HashMap<String, Integer> hm = itHm.get(kcKey);
            Set<String> xsSet = hm.keySet();
            for (String xsKey:xsSet) {
                Integer age = hm.get(xsKey);
                System.out.println("\t"+xsKey+"="+age);
            }
        }
    }
}

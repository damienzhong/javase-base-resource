package damien.array;

import java.util.Arrays;

/**
 *  问题：
 *      1、数组需要指定长度，如果需要存储的数据大于数组长度，需要重新创建，繁琐麻烦
 *      2、如果一个大数组，但是存储的内容不多的话，会造成空间浪费
 */
public class ArrayDemo {
    public static void main(String[] args) {
        Student[] students = new Student[5];

        String s = Arrays.toString(students);
        System.out.println(s);

        Student student1 = new Student("呆萌钟", 25);
        Student student2 = new Student("老付", 24);
        Student student3 = new Student("小锐", 22);
        Student student4 = new Student("眨眼睛", 22);
        Student student5 = new Student("Zj", 29);

        students[0] = student1;
        students[1] = student2;
        students[2] = student3;
        students[3] = student4;
        students[4] = student5;

        String s2 = Arrays.toString(students);
        System.out.println(s2);

        Student student6 = new Student("米豆", 15);
        //students[5] = student5;
        Student[] students2 = new Student[6];
        students2[0] = student1;
        students2[1] = student2;
        students2[2] = student3;
        students2[3] = student4;
        students2[4] = student5;
        students2[5] = student6;

        String s3 = Arrays.toString(students2);
        System.out.println(s2);
    }
}

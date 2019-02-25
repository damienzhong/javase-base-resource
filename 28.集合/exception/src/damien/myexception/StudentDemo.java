package damien.myexception;

import java.util.Scanner;

/**
 * 自定义异常测试类
 */
public class StudentDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入学生成绩：");
        int score = scanner.nextInt();

        Teacher teacher = new Teacher();
        try {
            teacher.check(score);
        }catch (MyException e){
            e.printStackTrace();
        }
    }
}

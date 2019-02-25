package damien.myexception;

/**
 * @author damienzhong
 */
public class Teacher {
    public void check(int score) throws MyException{
        if (score > 100 || score < 0) {
//            System.out.println("分数超出合理范围");
            throw new MyException("分数超出合理范围");
        }else {
            System.out.println("分数没有问题");
        }
    }
}

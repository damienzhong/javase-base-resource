package damien.generic;

/**
 * @author damienzhong
 */
public class ObjectToolDemo {
    public static void main(String[] args) {
//        ObjectTool objectTool = new ObjectTool();
//
//        objectTool.setObject(new Integer(25));
//        Integer i = (Integer)objectTool.getObject();
//        System.out.println("my age is " + i);
//
//        objectTool.setObject("呆萌钟");
//        String s = (String)objectTool.getObject();
//        System.out.println("my name is " + s);
//
//        System.out.println("--------------------------");
//        objectTool.setObject(new Integer(100));
//        //ClassCastException
//        String i2 = (String)objectTool.getObject();
//        System.out.println("my age is " + i2);

        ObjectTool<Integer> i = new ObjectTool<>();
//        i.setObject("sfd");//编译不通过
        i.setObject(20);
        Integer age = i.getObject();
        System.out.println("my age is " + age);

        ObjectTool<String> s = new ObjectTool<>();
        s.setObject("呆萌钟");
        String name = s.getObject();
        System.out.println("my age is " + name);
    }
}

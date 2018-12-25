package damien.generic;

/**
 * @author damienzhong
 */
public class ObjectToolDemo {
    public static void main(String[] args) {
        ObjectTool objectTool = new ObjectTool();

        objectTool.setObject(new Integer(25));
        Integer i = (Integer)objectTool.getObject();
        System.out.println("my age is " + i);

        objectTool.setObject("呆萌钟");
        String s = (String)objectTool.getObject();
        System.out.println("my name is " + s);

        System.out.println("--------------------------");
        objectTool.setObject(new Integer(100));
        //ClassCastException
        String i2 = (String)objectTool.getObject();
        System.out.println("my age is " + i2);
    }
}

package damien.list.arraylist;

import java.util.Enumeration;
import java.util.Vector;

/**
 *
 *  Vector:
 *      public void addElement(E obj)
 *      public E elementAt(int index)
 *      public Enumeration elements()
 *
 *     升级原因：
 *      A：安全
 *      B: 效率
 *      C：简化书写
 */
public class VectorDemo {
    public static void main(String[] args) {
        Vector vector = new Vector();
        
        vector.addElement("呆萌钟");
        vector.addElement("米豆");
        vector.addElement("贪狼");

        for (int i = 0;i<vector.size();i++){
            String s = (String)vector.elementAt(i);
            System.out.print(s);
        }

        System.out.print("----------------------");

        Enumeration elements = vector.elements();
        while (elements.hasMoreElements()){
            String s = (String)elements.nextElement();
            System.out.print(s);
        }
    }
}

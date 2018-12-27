package damien.generic0;

/**
 * 1、指定实现类的类型
 */
//public class ObjectToolDemo<String> implements ObjectInter<String>{
//
//    @Override
//    public void show(String string) {
//
//    }
//}

/**
 * 2、未知类型
 */
public class ObjectToolDemo<T> implements ObjectInter<T>{

    @Override
    public void show(T t) {

    }
}

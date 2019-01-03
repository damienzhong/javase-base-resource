package damien.generic04;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 泛型：通配符
 *  ?:任意类型，如果没用明确，那么就是Object以及任意的Java类
 *  ? extends E:向下限定，E以及其子类
 *  ? super E:向上限定，E及其父类
 */
public class GenericDemo {
    public static void main(String[] args) {
        //泛型如果明确的时候，前后必须一致
        Collection<Object> objects = new ArrayList<Object>();
//        Collection<Object> objects1 = new ArrayList<Animal>();
//        Collection<Object> objects2 = new ArrayList<Dog>();
//        Collection<Object> objects3 = new ArrayList<Cat>();

        //?表示任意的类型都可以
        Collection<?> c = new ArrayList<Object>();
        Collection<?> c2 = new ArrayList<Animal>();
        Collection<?> c3 = new ArrayList<Dog>();
        Collection<?> c4 = new ArrayList<Cat>();

        //? extends E:向下限定，E以及其子类
        //Collection<? extends Animal> c5 = new ArrayList<Object>();
        Collection<? extends Animal> c6 = new ArrayList<Animal>();
        Collection<? extends Animal> c7 = new ArrayList<Dog>();
        Collection<? extends Animal> c8 = new ArrayList<Cat>();

        //? super E:向上限定，E及其父类
        Collection<? super Animal> c9 = new ArrayList<Object>();
        Collection<? super Animal> c10 = new ArrayList<Animal>();
//        Collection<? super Animal> c11 = new ArrayList<Dog>();
//        Collection<? super Animal> c12 = new ArrayList<Cat>();
    }
}

class Animal{

}

class Dog extends Animal{

}

class Cat extends Animal{

}

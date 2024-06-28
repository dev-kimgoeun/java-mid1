package lang.clazz;

import java.lang.reflect.InvocationTargetException;

import static java.lang.Class.forName;

public class ClassCreateMain {

    public static void main(String[] args) throws Exception {
       Class helloclass = Hello.class;
      Class helloclass1 =  Class.forName("lang.clazz.Hello");
      
     Hello hello = (Hello) helloclass.getDeclaredConstructor().newInstance();
     String result  = hello.hello();
        System.out.println("result = " + result);
    }
}

package nested.test;

public class OuterClass3 {

    public void myMethod(){
        class LocalCalss{
            public void hello(){
                System.out.println("LocalClass.hello");
            }
        }

        LocalCalss local = new LocalCalss();
        local.hello();
    }
}

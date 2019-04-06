package abouStatic;

/**
 * @ClassName 关于static关键字的理解
 * @Description TODO
 * @Author Mr.Su
 * @Date 2019/4/6 16:45
 * @Version 1.0
 **/
public class StaticDemo {
    public static String name;
    public String password;
    /*
    * @Descript 在静态方法中不能访问类的非静态成员变量和非静态成员方法，
    *           因为非静态成员方法/变量都是必须依赖具体的对象才能够被调用。
    *           而静态方法或者静态变量是跟对象无关的，他们只和类有关。
    * @Date 16:54 2019/4/6
    * @Param
    * @Return
    **/
    public static void printName(){
        System.out.println(name);
        //System.out.println(password);  //在静态方法无法调用非静态成员变量
        staticusethis();
        //staticnotusethis(); // 在静态方法中无法调用非静态方法
    }

    public void staticnotusethis(){
        return;
    }

    public static void staticusethis(){
        return;
    }
}

package refect;

/**
 * @ClassName
 * @Description 用反射方式创建对象
 * @Author Mr.Su
 * @Date 2019/4/10 20:51
 * @Version 1.0
 **/
public class Origin {
    public void getObject() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Apple apple = (Apple) Class.forName("refect.Apple").newInstance();
        // 通过forName()方法获取Apple的Class对象
        apple.say();

        Apple redApple = Apple.class.newInstance();
        // 通过字面量获取Apple的Class对象
        redApple.say();
    }
}

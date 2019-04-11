package serialization;

import java.io.*;

/**
 * @ClassName 序列化和反序列化的测试类
 * @Description TODO
 * @Author Mr.Su
 * @Date 2019/4/11 16:42
 * @Version 1.0
 **/
public class PersonTest {

    public static void main(String[] args){

        try {
            SerializePerson();
            DeserializePerson();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }

    /**
    * @Descript 序列化person对象
    * @Date 16:59 2019/4/11
    * @Param
    * @Return
    **/
    private static void SerializePerson() throws ClassNotFoundException,
        // 不要在逗号前换行，不要在括号前换行
            IllegalAccessException,
            InstantiationException, IOException {
        // 此处直接用new关键字调用构造方法创建对象即可，这么写是回顾反射的知识点
        Person person = (Person) Class.forName("serialization.Person").newInstance();
        person.setName("苏文进");
        person.setAge("19");
        person.setSex("男");
        person.setAddress("长江边上");
        // ObjectOutputStream是对象输出流，FileOutputStream是文件输出流，将person对象存储到本地
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(
                new FileOutputStream(new File("E:/person.txt")));
        // 将person对象写入,这个过程中，person的类型从对象变成了字节序列
        objectOutputStream.writeObject(person);
        System.out.println("序列化person对象成功...");
        // 关闭输入流
        objectOutputStream.close();
    }

    /**
    * @Descript 反序列化person对象
    * @Date 17:14 2019/4/11
    * @Param []
    * @Return void
    **/
    private static void DeserializePerson() throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(
                new FileInputStream("E:/person.txt"));
        // 从输入流中读取person对象的字节序列并转换为Person对象类型
        Person person = (Person) objectInputStream.readObject();
        System.out.println(person.toString());
        System.out.println("反序列化成功....");
    }

}

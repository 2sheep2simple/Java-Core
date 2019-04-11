package serialization;

import java.io.Serializable;

/**
 * @ClassName 人
 * @Description 用于测试序列化和反序列化的实体类
 * @Author Mr.Su
 * @Date 2019/4/11 16:35
 * @Version 1.0
 **/
public class Person implements Serializable {

    /**
     * 序列化版本ID，默认值为1L
     * 被final修饰的static是可以被序列化的。
     */
    private static final Long serialVersionUID = 1L;
    /**
     * transient关键字的作用是控制变量的序列化，该变量被反序列化后的值是初始值，
     * 被transient修饰的变量被称为瞬间变量
     * transient关键字只能修饰变量，不能修饰类和方法
     * person对象的字节序列文件在被反序列化后，经过类型转换得到的person对象的name的值是null.
    */
    transient private String name;
    /**
     * 序列化是针对对象来说的，而静态变量是属于类的，不能通过对象来访问，因此静态资源不会被序列化.
     * 在默认情况下，使用objectOutputStream.defaultWriteObject()序列化；，静态资源不会被序列化。
     * 但如果使用objectOutputStream.WriteObject(person)；序列化，静态资源还是会被序列化
     */
    static private String age;
    private String sex;
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

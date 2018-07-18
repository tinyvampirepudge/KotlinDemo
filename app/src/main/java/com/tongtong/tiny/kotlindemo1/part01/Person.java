package com.tongtong.tiny.kotlindemo1.part01;

/**
 * Java代码里面的bean
 * (功能详细描述)$detail$
 * (修改者，修改日期，修改内容)$modify$
 *
 * @author wangjianzhou@qding.me
 * @version APP版本号（以修改为准）$version$
 * @date 2018/7/18 15:03
 */
public class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}

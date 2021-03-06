package com.study.www.domain;

import org.hibernate.dialect.MySQL5InnoDBDialect;

import javax.persistence.*;

/**
 * 描述: 用户对象
 *
 * @outhor Administrator
 * @create 2017-11-14 05:43
 */
@Entity
public class User {
    @Id
    //主键策略默认是AUTO
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String account;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private int sex;

    public User() {
    }

    public User(String account, String name, int sex) {
        this.account = account;
        this.name = name;
        this.sex = sex;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", account='" + account + '\'' +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                '}';
    }
}

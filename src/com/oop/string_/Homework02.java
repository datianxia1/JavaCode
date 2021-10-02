package com.oop.string_;

public class Homework02 {
    public static void main(String[] args) {
        AA aa = new AA();
        try {
            aa.setName("Ja");
            aa.setEmile("123.@qq");
            aa.setPwd("123456");
            System.out.println("success");
        } catch (Exception e) {
            System.out.println(e.getMessage());;
        }
    }
}

class AA {
    private String name;
    private String pwd;
    private String emile;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!(name.length()>= 2 && name.length() <= 3)){
            throw new RuntimeException("名字长度不合规");
        }
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        if (pwd.length() != 6){
            throw new RuntimeException("密码位数非六位");
        }
        int num = Integer.parseInt(pwd);

        this.pwd = pwd;
    }

    public String getEmile() {
        return emile;
    }

    public void setEmile(String emile) {
        int i1 = emile.indexOf("@");
        int i2 = emile.indexOf(".");
        if (!(i1 >= 0 && i1 < i2)){
            throw new RuntimeException("邮箱格式有误");
        }

        this.emile = emile;
    }
}

package com.dongho98.spring01;

public class Cat implements Animal {
    private String name;
    private int age;

    Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override // 이제부터 오버라이딩할거야
    public void cry() {
        // Todo Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'cry");
        System.out.println(this.age + " 살" + this.name + "이(가) 웁니다 야옹!");
    }

    @Override
    public void introduce() {
        System.out.println("저는 고양이에요.");
    }
}

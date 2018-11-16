package ru.zhugin.se;

public class Employee {
    String fullName;
    String position;
    String email;
    Long phoneNumber;
    int wage;
    int age;
    public Employee(String _fullName, String _position, String _email, Long _phoneNumber, int _wage, int _age){
        fullName = _fullName;
        position = _position;
        email = _email;
        phoneNumber = _phoneNumber;
        wage = _wage;
        age = _age;
    }
    void getFullInfo() {
        System.out.println("ФИО: " + fullName + " Должность: " + position + " E-mail: " + email + " Зарплата: " + wage + " Возраст: " + age);
    }
    int getAge() {
        return age;
    }
}

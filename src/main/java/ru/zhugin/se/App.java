package ru.zhugin.se;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    Employee[] employeesArray = new Employee[5];
    employeesArray[0] = new Employee("Игнаткин Л.И.","Специалист 2-й категории","Ivanov@ya.ru",9001112213L, 15000,21);
    employeesArray[1] = new Employee("Пурганов И.П.","Специалист 3-й категории","Purganov@ya.ru",9001112232L, 13000,40);
    employeesArray[2] = new Employee("Стерков В.И.","Специалист 1-й категории","Sterkov@ya.ru",9001112223L, 18000,32);
    employeesArray[3] = new Employee("Курганова Л.М.","Ведущий Специалист","Sterkov@ya.ru",9001112223L, 20000,45);
    employeesArray[4] = new Employee("Деев Р.Л.","Главный Специалист","Deev@ya.ru",9001112222L, 25000,50);
    for (Employee e : employeesArray) if (e.getAge() > 40) e.getFullInfo();
    }
}

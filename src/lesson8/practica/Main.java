package lesson8.practica;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Student vasya = new Student("Иванов", "Вася", "Москва, Новая","89855677889"); // вызов конструктора


        Student petya = new Student();
        Otlichnik sveta = new Otlichnik();

        ArrayList<Student> students = new ArrayList<>();
        students.add(vasya);
        students.add(sveta);
        students.add(petya);

        // for each (когда нужно пройти по всем объектам внутри одного хранилища)

        for (Student st: students){
            st.Dodomashka(); // Полиморфизм - это свойтсво джавы работать с разными типами, но как с одним
        }
    }
}

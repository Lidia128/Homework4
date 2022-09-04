import org.w3c.dom.ls.LSOutput;

import javax.sound.midi.Soundbank;
import javax.xml.transform.Source;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        //Домашнее задание № 1
        System.out.println("Домашнее задание № 1");
        System.out.println();
        //Задача № 1
        System.out.println("Задача № 1");
        int age = 21;
        if (age >= 18) {
            System.out.println("Поздравляем Вас с совершеннолетием");
        }
        if (age < 18) {
            System.out.println("Возраст совершеннолетия ещё не наступил, и нужно немного подождать");
        }
        System.out.println();
        //Задча № 2;
        System.out.println("Задача № 2");

        if (age >= 7 && age < 18) {
            System.out.println("Ребёнок ходит в школу");
        }
        if (age >= 18 && age < 24) {
            System.out.println("Закончил школу и может идти в университет");
        }
        if (age >= 24) {
            System.out.println("Человек закончил университет и ему пора искать работу");
        }
        System.out.println();
        //Задача № 3;
        System.out.println("Задача №3");
        int all = 102;
        int sit = 60;
        int stand = all - sit;

        int sitUse = 53;
        int standUse = 39;

        if (sitUse < sit) {
            System.out.println("В вогоне есть" + (sit - sitUse) + " сидячих места");
        }
        if (standUse < stand) {
            System.out.println("В вогоне есть " + (stand - standUse) + " стоячих места");
        }
        if (sit == sitUse) {
            System.out.println("Сидячих мест нет");
        }
        if (stand == stand) {
            System.out.println("Стоячих мест нет");
        }

        System.out.println();

        //Домашнее задание № 2

        System.out.println("Домашнее задание № 2");
        System.out.println();
        //Задача № 1;
        System.out.println("Задача № 1");
        System.out.println();
        if (age >= 18) {
            System.out.println("Поздравляем Вас с совершеннолетием");
        } else {
            System.out.println("Возраст совершеннолетия ещё не наступил, и нужно немного подождать");
        }
        System.out.println();
        //Задача № 2
        System.out.println("Задача № 2");
        System.out.println();
        if (age >= 7 && age < 18) {
            System.out.println("Ребёнок ходит в школу");
        } else if (age >= 18 && age < 24) {
            System.out.println("Закончил школу и может идти в университет");
        } else if (age >= 24) {
            System.out.println("Человек закончил университет и ему пора искать работу");
        }
        System.out.println();
        //Задача № 3
        System.out.println("Задача № 3");
        System.out.println();
        if (sitUse < sit) {
            System.out.println("В вогоне есть сидячие места");
        } else {
            System.out.println("В вогоне есть стоячие места");
        }

        if (standUse < stand) {
            System.out.println("В вогоне есть сидячие места");
        } else {
            System.out.println("В вогоне есть стоячие места");
        }

        System.out.println();
        //Домашнее задание № 3
        System.out.println("Домашнее задание № 3");
        System.out.println();
        //Задача № 1
        System.out.println("Задача№ 1");
        System.out.println();
        if (age >= 2 && age >= 6) {
            System.out.println("Если возраст человека равен " + age + " , то ему нужно ходить в детский сад");
        } else if (age > 6 && age <= 18) {
            System.out.println("Если возраст человека равен " + age + " , то ему нужно ходить в школу");
        } else if (age >= 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + " , то ему нужно ходить в университет");
        } else if (age > 24) {
            System.out.println("Если возраст человека равен " + age + " , то ему пора ходить на работу");
        }
        System.out.println();

        //Задача № 2
        System.out.println("Задача № 2");
        System.out.println();
        if (age < 5) {
            System.out.println("Если ребенку " + age + "ребенок не может кататься на атракционе");
        } else if (age < 14) {
            System.out.println("Ребенок может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя");
        } else if (age > 14) {
            System.out.println("Ребенок может кататься без сопровождения взрослых");
        }
        System.out.println();
        //Задача № 3
        System.out.println("Задача № 3");
        System.out.println();
        int one = 8;
        int two = 2;
        int free = 15;
        if (one >= two){
            if (one > free) {
                System.out.println("Максимальное число " + one);
            } else {
                System.out.println("Максимальное число " + free);}

        } else if (two > one) {
            if (two >= free){
            System.out.println("Максимальное число "  + two);
        } else {
            System.out.println("Максимальное число " + free);}

        } else {
            if (one > free) {
                System.out.println("Максимальное число " + one);
            } else if (free > one) {
                System.out.println("Максимальное число " + free);
            } else {
                System.out.println("Все числа равны");}
            }
        }}


































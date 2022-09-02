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
        int age = 19;
        if (age >= 18) ;
        {
            System.out.println("Поздравляем Вас с совершеннолетием");
        }
        if (age < 18) ;
        {
            System.out.println("Возраст совершеннолетия ещё не наступил, и нужно немного подождать");
        }
        System.out.println();
        //Задча № 2;
        System.out.println("Задача № 2");
        int child = 7;
        int student = 18;
        int adult = 24;
        if (child >= 7 && child < 18) ;
        {
            System.out.println("Ребёнок ходит в школу");
        }
        if (student >= 18 && student < 24) ;
        {
            System.out.println("Закончил школу и может идти в университет");
        }
        if (adult >= 24) ;
        {
            System.out.println("Человек закончил университет и ему пора искать работу");
        }
        System.out.println();
        //Задача № 3;
        System.out.println("Задача №3");
        int all = 102;
        int sit = 60;
        if (sit <= 60) ;
        {
            System.out.println("В вогоне есть сидячие места");
        }
        if (sit > 60 && all < 102) ;
        {
            System.out.println("В вогоне есть стоячие места");
        }
        if (all >= 102) ;
        {
            System.out.println("Вогон полон");
            System.out.println();
        }
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
        if (child >= 7 && child < 18) {
            System.out.println("Ребёнок ходит в школу");
        } else {
            System.out.println("Закончил школу и может идти в университет");
        }
        if (student >= 18 && student < 24) {
            System.out.println("Закончил школу и может идти в университет");
        } else {
            System.out.println("Человек закончил университет и ему пора искать работу");
        }
        if (adult >= 24) ;
        System.out.println("Человек закончил университет и ему пора искать работу");
        System.out.println();
        //Задача № 3
        System.out.println("Задача № 3");
        System.out.println();
        if (sit <= 60) {
            System.out.println("В вогоне есть сидячие места");
        } else {
            System.out.println("В вогоне есть стоячие места");
        }

        if (sit > 60 && all < 102) {
            System.out.println("В вогоне есть сидячие места");
        } else {
            System.out.println("В вогоне есть стоячие места");
        }
        if (all >= 102) ;
        System.out.println("Вогон полон");
        System.out.println();
        //Домашнее задание № 3
        System.out.println("Домашнее задание № 3");
        System.out.println();
        //Задача № 1
        System.out.println("Задача№ 1");
        System.out.println();
        int age1 = 18;
        boolean canGoToKindergarten = age1 >= 2 && age1 <= 6;
        boolean canGoToShcool = age1 > 7 && age1 <= 18;
        boolean canGoToUniversity = age1 >= 18 && age1 <= 24;
        boolean canGoToWork = age1 > 24;
        if (canGoToKindergarten);{
        System.out.println("Если возраст человека равен " + canGoToKindergarten + " , то ему нужно ходить в детский сад");}
        if (canGoToShcool);{
        System.out.println("Если возраст человека равен " + canGoToShcool + " , то ему нужно ходить в школу");}
        if (canGoToUniversity);{
        System.out.println("Если возраст человека равен " + canGoToUniversity + " , то ему нужно ходить в университет");}
        if (canGoToWork);{
        System.out.println("Если возраст человека равен " + canGoToWork + " , то ему пора ходить на работу");}


        if (canGoToKindergarten) {
        System.out.println("Если возраст человека равен " + canGoToKindergarten + " , то ему нужно ходить в детский сад");
        } else {
        System.out.println("Если возраст человека равен " + canGoToShcool + " , то ему нужно ходить в школу");}
        if(canGoToShcool) {
        System.out.println("Если возраст человека равен " + canGoToShcool + " , то ему нужно ходить в школу");
        }else{
        System.out.println("Если возраст человека равен " + canGoToUniversity + " , то ему нужно ходить в университет");}
        if (canGoToUniversity) {
        System.out.println("Если возраст человека равен " + canGoToUniversity + " , то ему нужно ходить в университет");
        }else{
        System.out.println("Если возраст человека равен " + canGoToWork + " , то ему пора ходить на работу");
        System.out.println();
        //Задача № 2
        System.out.println("Задача № 2");
        System.out.println();
        int small=4;
        int midl=12;
        int older=15;
        boolean smallChild= small<5;
        boolean midlChild= midl > 5 && midl < 14;
        boolean teenager= older > 14;
        if (smallChild) {
        System.out.println("Если ребенку " +smallChild+ "ребенок не может кататься на атракционе");}
        if (midlChild) {
        System.out.println("Ребенок может кататься только в сопровождении взрослого. " +
                "Если взрослого нет, то кататься нельзя.");}
        if (teenager) {
        System.out.println("Ребенок может кататься без сопровождения взрослых");}
                    }
        System.out.println();
        //Задача № 3
        System.out.println("Задача № 3");
        System.out.println();
        int one=8;
        int two=2;
        int free=15;
        if(one>two){
        System.out.println(one>two);
        }else{
        System.out.println(two>free);}

        if(one>free){
        System.out.println(one > two);
        }else{
        System.out.println(one>free);}

        if (two>free){
        System.out.println(two>free);
        }else{
        System.out.println(free>one);}
        }

    }




























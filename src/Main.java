public class Main {
    public static void main(String[] args) {

        /*
                Задача 1. С помощью условного оператора напишите программу, которая выводит в консоль:
         сообщение о том, что человеку 18 или больше лет;
         сообщение, что возраст совершеннолетия еще не наступил, нужно немного подождать.
        При выполнении каждого условия программа должна выводить в консоль сообщение в формате:
        «Если возраст человека равен …, то (вывести в зависимости от результата) он совершеннолетний / он не достиг совершеннолетия,
        нужно немного подождать».
         */

        System.out.println("Task 1");

        int humanAge = 19;
        boolean hasHumanAllRights = (humanAge >= 18);
        var textBefore = "Если возраст человека равен " + humanAge;

        System.out.println(hasHumanAllRights ? textBefore + ", то он совершеннолетний" :
                textBefore + " то, он не достиг совершеннолетия, нужно немного подождать");

        /*
            Задача 2
            Человек одевается в зависимости от температуры воздуха. Напишите программу, которая выводит сообщение:
            «На улице холодно, нужно надеть шапку» — если температура ниже 5 градусов.
            «Сегодня тепло, можно идти без шапки» — если температура воздуха выше 5 градусов.
            При выполнении каждого условия выведите в консоль: «На улице … градусов, (вывести в зависимости от результата)
            нужно надеть шапку / ».
         */

        System.out.println("Task 2");

        float outsideTemp = -14.5F;
        boolean needHat = (outsideTemp < 5.0F);
        textBefore = "На улице " + outsideTemp + " градус(а,ов)";

        System.out.println(needHat ? textBefore + ". На улице холодно, нужно надеть шапку" :
                textBefore + "/ Сегодня тепло, можно идти без шапки");

        /*
        Задача 3
        За превышение скорости водителю могут выписать штраф. Напишите программу, которая сообщает водителю о том, что:
         скорость превышена, если она больше 60 км/ч;
         превышения скорости нет, если она меньше 60 км/ч.
        При выполнении каждого условия программа должна выводить такое сообщение: «Если скорость …, то (вывести в
        зависимости от результата) придется заплатить штраф / можно ездить спокойно».
         */

        System.out.println("Task 3");

        short speedLimit = 61;
        float currentSpeed = 60.0F;
        boolean isOverSpeed = (currentSpeed > speedLimit);
        if ((float) speedLimit == currentSpeed) {
            System.out.println("Внимательно! Ваша скорость " + currentSpeed + " Ещё немного тапки и, точно, будет штраф");
        } else {
            textBefore = "Ограничение скорости: " + speedLimit + ". Если скорость " + currentSpeed + " км/ч ";

            System.out.println(isOverSpeed ? textBefore + "то, придется заплатить штраф" :
                    textBefore + "то, можно ездить спокойно");
        }
        /*
        Задача 4
        Напишите программу, которая помогает определить, в какое учреждение нужно отправить человека в зависимости от его возраста:

         Если человеку от 2 до 6 лет, то ему нужно ходить в детский сад.
         Если человеку от 7 до 17 лет, то ему нужно ходить в школу.
         Если человеку больше или равно 18 лет, но меньше или равно 24, то его место в университете.
         А если человеку больше 24, то ему пора ходить на работу.
        При выполнении каждого условия программа должна выводить в консоль сообщение в формате: «Если возраст человека равен …,
        то ему нужно ходить … (в зависимости от возраста дописать нужное)».

         */

        System.out.println("Task 4");

        humanAge = 25;
        var textWhereHumanWillGo = "";
        textBefore = "Если возраст человека равен " + humanAge + ", то ему нужно ходить ";

        if (humanAge >= 2 && humanAge <= 6) {
            textWhereHumanWillGo = textBefore + "в детский сад";
        } else {
            if (humanAge >= 7 && humanAge <= 17) {
                textWhereHumanWillGo = textBefore + "в школу";
            } else {
                if (humanAge >= 18 && humanAge <= 24) {
                    textWhereHumanWillGo = textBefore + "в университет";
                } else {
                    if (humanAge > 24) {
                        textWhereHumanWillGo = textBefore + "на работу";
                    } else {
                        textWhereHumanWillGo = "Если возраст человека равен " + humanAge
                                + ", то направление не определено техническим заданием";
                    }
                }
            }
        }
        System.out.println(textWhereHumanWillGo);

        /*
        Задача 5
        Как правило, на аттракционах действуют ограничения для детей по возрасту:
         Если ребенку меньше 5 лет, то он не может кататься на аттракционе.
         Если ребенку больше 5, но меньше 14 лет, то он может кататься только в сопровождении взрослого. Если взрослого
         нет, то кататься нельзя.
         Если ребенок старше 14 лет, то он может кататься без сопровождения взрослого.
        Напишите программу, которая выводит в консоль сообщение в формате: «Если возраст ребенка равен …, то ему …
        (в зависимости от возраста дописать нужное: нельзя кататься на аттракционе, можно кататься на аттракционе в сопровождении
        / без сопровождения взрослого)».
         */

        System.out.println("Task5");
        humanAge = 5;
        textBefore = "Если возраст ребенка равен " + humanAge + ", то ему ";
        boolean isAdultPersonHere = false;
        hasHumanAllRights = false;
        isAdultPersonHere = (humanAge >= 5 && humanAge < 14 && isAdultPersonHere);
        hasHumanAllRights = (humanAge >= 14);

        //проба тернарным оператором
//        System.out.println(hasHumanAllRights ?
//                textBefore + "можно кататься без сопровождения взрослого":
//                (isAdultPersonHere?
//                        textBefore + "можно кататься только в сопровождении взрослого":
//                        textBefore + "нельзя кататься на этом аттракционе"));

// if-else
        if (hasHumanAllRights) {

            System.out.println(textBefore + "можно кататься без сопровождения взрослого");
        } else {
            if (isAdultPersonHere) {

                System.out.println(textBefore + "можно кататься только в сопровождении взрослого");
            } else {
                if (humanAge >= 5) {

                    System.out.println(textBefore + "нельзя кататься на этом аттракционе без взрослого");

                } else {

                    System.out.println(textBefore + "нельзя кататься на этом аттракционе");
                }
            }
        }
        /*
        Задача 6
        Вместимость одного вагона поезда — 102 человека. Вагон рассчитан на 60 сидячих мест, все остальные — стоячие.
        С помощью условного оператора и конструкции else напишите программу, которая выводит в консоль сообщение о том,
        есть ли место в вагоне, сидячее или стоячее, или вагон уже полностью забит.
         */

        System.out.println("Task6");
        int seatingsCount = 60;
        int standingsCount = 42;
        int wagonCapacity = seatingsCount + standingsCount;

        int countOfPassengers = 59; //исходим из того, что все ленивые и сначала занимают сидячие места

        boolean isBusFull = (countOfPassengers >= wagonCapacity);
        boolean isSeatingsFull = (countOfPassengers >= seatingsCount);

        if (isBusFull) {
            System.out.println("Вагон полностью занят");
        } else {
            if (isSeatingsFull) {
                System.out.println("Есть стоячие места");
            } else {
                System.out.println("Есть сидячие места");
            }
        }

        /*
        Даны три числа:
        int one;
        int two;
        int three;

        С помощью условного оператора и конструкции else напишите программу, которая вычисляет, какое из трех чисел
        бо́льшее, и выводит результат в консоль
         */

        System.out.println("Task7");

        int one = 10;
        int two = 200;
        int three = 3;

        if (one > two && one > three) {
            System.out.println(one);
        } else {
            if (two > three && two > one) {
                System.out.println(two);
            } else {
                if (three > one && three > two) {
                    System.out.println(three);
                }
            }
        }
    }
}

package by.homework.java.task2;

public class Main {
    public static void main(String[]args) {
        /* Задание 1.  Найти переменную f/6 + 25 = 98 */
           int f;
           f=(98-25)*6;
        System.out.println("Ответ задания №1:");
           System.out.println("f = " + f );

        /* Задание 2.Операции присваивания */
           int x = 8;
           int y = 9;
           int z = 12;
        x += 5;
        y *= 9;
        z -= 6;
        System.out.println("Ответ задания №2:");
        System.out.println("x = " + x );
        System.out.println("y = " + y );
        System.out.println("z = " + z );

        /* Задание 3. Тернарный оператор */
           int a = 35;
           int b = 65;
           int c;
           c = a > b ? 10 : 5;
               System.out.println("Ответ задания №3:");
               System.out.println("c = " + c);

        /* Задание 4.Операции инкремента декремент */
            int q = 5;
            int w = 2;
            int e = q*w;
            e = ++q * w--;
        System.out.println("Ответ задания №4*:");
        System.out.println("q = " + q);
        System.out.println("w = " + w);
        System.out.println("e = " + e);
      }
        }



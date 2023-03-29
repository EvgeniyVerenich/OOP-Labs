/*
Описать класс дробей – рациональных чисел, являющихся отношением двух целых чисел.
Предусмотреть методы сложения, вычитания, умножения и деления дробей
*/
package OOPLabs.lab1;

import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in);
        Fraction fraction = new Fraction(2,5);
        Fraction fraction1 = new Fraction(in.nextInt(), in.nextInt());
       /* while (fraction1.getDenominator() == 0){
            System.out.println("Попытка деления на ноль!!!\nВведите другое число!!!");
            fraction1.setDenominator(in.nextInt());
        }*/

        System.out.println(fraction.difference(Objects.requireNonNull(fraction1)));
        System.out.println(fraction.sum(fraction1));
        System.out.println(fraction.multiply(fraction1));
        System.out.println(fraction.division(fraction1));

    }
}

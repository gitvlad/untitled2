//Obliczanie wartosci bezwzglednej z liczby calkowitej
//www.algorytm.org

import java.util.Scanner;
public class Wartoscbez {

    /**
     * @param args
     */
    public static void main(String[] args) {

        int liczba;
        System.out.println("Podaj liczbę");
        Scanner odczyt = new Scanner(System.in);
        liczba = odczyt.nextInt();

        boolean condition = (liczba>0);
        if(condition)
        {
            System.out.println("Wartość bezwzgledna z liczby dodatniej " + liczba );

        }
        else
        {
            System.out.println("Wartość bezwzgledna z liczby ujemnej " + (-1)*liczba );
        }
    }

}
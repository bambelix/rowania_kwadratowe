import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Liczenie liczenie = new Liczenie();
        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj podcz¹tek dziedziny");
        liczenie.d1 = scan.nextDouble();
        System.out.println("Podaj koniec dziedziny");
        liczenie.d2 = scan.nextDouble();

        System.out.println("ax2 + bx + c = 0");

        System.out.println("Podaj wspó³czynnik a");
        liczenie.a = scan.nextDouble();
        System.out.println("Podaj wspó³czynnik b");
        liczenie.b = scan.nextDouble();
        System.out.println("Podaj wspó³czynnik c");
        liczenie.c = scan.nextDouble();

        liczenie.liczDelta();
        liczenie.liczPierwiastek();
        liczenie.liczX1();
        liczenie.liczX2();

        System.out.println("Delta = b*b - 4ac = " + liczenie.delta);
        System.out.println("D: {"+ liczenie.d1 +" ; "+ liczenie.d2+"}");

        if(liczenie.x1s()){

            System.out.println("x1 = -b + pierwiastek delty / 2a " + liczenie.x1);

        }else {
            System.out.println("x1 = -b + pierwiastek delty / 2a " + liczenie.x1 + "(sprzecznoœæ)");
        }

        if(liczenie.x2s()){
            System.out.println("x2 = -b - pierwiastek delty / 2a " + liczenie.x2);
        }else{
            System.out.println("x2 = -b - pierwiastek delty / 2a " + liczenie.x2 + "(sprzecznoœæ)");
        }

        if(liczenie.x1s() & liczenie.x2s()){
            System.out.println("xe {"+liczenie.x1+" ; "+liczenie.x2+"}");
        }
        else if(liczenie.x1s() & !liczenie.x2s()){
            System.out.println("xe {"+liczenie.x1+"}");
        }
        else if(!liczenie.x1s() & liczenie.x2s()){
            System.out.println("xe {"+liczenie.x2+"}");
        }
        else {
            System.out.println("x jest puste");
        }

    }

}

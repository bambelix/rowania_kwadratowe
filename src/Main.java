import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);
        System.out.println("Wybierz co chcesz policzy�:");
        System.out.println("1 - r�wnanie kwadratowe");
        System.out.println("2 - pot�gowanie");
        int pick = scan.nextInt();
        switch(pick){
            case 1:
                Delcia liczenieDelta = new Delcia();

                System.out.println("Podaj podcz�tek dziedziny");
                liczenieDelta.d1 = scan.nextDouble();
                System.out.println("Podaj koniec dziedziny");
                liczenieDelta.d2 = scan.nextDouble();

                System.out.println("ax2 + bx + c = 0");

                System.out.println("Podaj wsp�czynnik a");
                liczenieDelta.a = scan.nextDouble();
                System.out.println("Podaj wsp�czynnik b");
                liczenieDelta.b = scan.nextDouble();
                System.out.println("Podaj wsp�czynnik c");
                liczenieDelta.c = scan.nextDouble();

                liczenieDelta.liczDelta();
                liczenieDelta.liczPierwiastek();
                liczenieDelta.liczX1();
                liczenieDelta.liczX2();

                System.out.println("Delta = b*b - 4ac = " + liczenieDelta.delta);
                System.out.println("D: {" + liczenieDelta.d1 + " ; " + liczenieDelta.d2 + "}");

                if (liczenieDelta.x1s()) {

                    System.out.println("x1 = -b + pierwiastek delty / 2a " + liczenieDelta.x1);

                } else {
                    System.out.println("x1 = -b + pierwiastek delty / 2a " + liczenieDelta.x1 + "(sprzeczno��)");
                }

                if (liczenieDelta.x2s()) {
                    System.out.println("x2 = -b - pierwiastek delty / 2a " + liczenieDelta.x2);
                } else {
                    System.out.println("x2 = -b - pierwiastek delty / 2a " + liczenieDelta.x2 + "(sprzeczno��)");
                }

                if (liczenieDelta.x1s() & liczenieDelta.x2s()) {
                    System.out.println("xe {" + liczenieDelta.x1 + " ; " + liczenieDelta.x2 + "}");
                } else if (liczenieDelta.x1s() & !liczenieDelta.x2s()) {
                    System.out.println("xe {" + liczenieDelta.x1 + "}");
                } else if (!liczenieDelta.x1s() & liczenieDelta.x2s()) {
                    System.out.println("xe {" + liczenieDelta.x2 + "}");
                } else {
                    System.out.println("x jest puste");
                }break;

            case 2:
                Pot�gi potegi = new Pot�gi();


                System.out.println("Podaj postaw� pot�gi");
                potegi.a = scan.nextDouble();
                System.out.println("Podaj wyk�adnik pot�gi");
                potegi.b = scan.nextDouble();

                System.out.println(potegi.a + " do pot�gi "+ potegi.b +" = "+ potegi.Liczpotege());

                break;




            default:
                System.out.println("1 lub 2 debilu, a nie jakie� " + pick);

        }
    }
}


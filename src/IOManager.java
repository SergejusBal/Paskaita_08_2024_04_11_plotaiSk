import java.util.InputMismatchException;
import java.util.Scanner;

public class IOManager {
    private double kr1;
    private double kr2;
    private Figuros figuros;
    private Scanner scanner = new Scanner(System.in);

    public double getKr1() {
        return kr1;
    }

    public double getKr2() {
        return kr2;
    }

    public void suzinokFigura() {

        int x = 0;
        try {
            System.out.println("Kokios figūros plotą norės skaičiuoti: įvesti 1 kvadratui arba 2 trikampiu arba skrituliui 3");
            x = scanner.nextInt();
        } catch (InputMismatchException e) {
            scanner.nextLine();
            suzinokFigura();
        }
        switch (x) {
            case 1:
                figuros = Figuros.KVADRATAS;
                break;
            case 2:
                figuros = Figuros.TRIKAMPIS;
                break;
            case 3:
                figuros = Figuros.SKRITULYS;
            default:
                System.out.println("Tokios figūros ploto skaičiuoti nemoku");
        }

    }

    public void suzinokKrastines(){
        switch (figuros) {
            case Figuros.KVADRATAS, Figuros.SKRITULYS:
                kr1 = scanoti();
                break;
            case Figuros.TRIKAMPIS:
                kr1 = scanoti();
                kr2 = scanoti();
                break;
            default:
                System.out.println("Tokios figūros ploto skaičiuoti nemoku");

        }
    }


    private double scanoti(){
        double x = 0;
        try {
            System.out.println("Iveskite Krastines Ilgi");
            x = scanner.nextDouble();
        } catch (InputMismatchException e) {
            scanner.nextLine();
            return scanoti();
        }
        return x;
    }

    public void skaicioti(){
        Figura fig;
        switch (figuros){
            case Figuros.KVADRATAS:
                fig = new Kvadratas(kr1);
                fig.skaiciuokPlota();
                spausdinkPlota(fig.toString());
                break;
            case Figuros.TRIKAMPIS:
                fig = new Trikampis(kr1,kr2);
                fig.skaiciuokPlota();
                spausdinkPlota(fig.toString());
                break;
            case Figuros.SKRITULYS:
                fig = new Skritulys(kr1);
                fig.skaiciuokPlota();
                spausdinkPlota(fig.toString());
                break;
        }
    }


    public void spausdinkPlota(String s){
        System.out.println("*********************************");
        System.out.println(s);
        System.out.println("*********************************");
    }

    public boolean atsakymas() {
        while(true) {
            String scVerte = scanner.nextLine();
            if(scVerte.toUpperCase().equals("T")) return true;
            else if (scVerte.toUpperCase().equals("N")) return false;
        }
    }


}



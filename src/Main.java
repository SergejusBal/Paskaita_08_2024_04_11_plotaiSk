//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        /////////////////////////////////////////////////////////////////////
        ////////////// Plotu skaiciuokle

        System.out.println();
        System.out.println("Plotu skaiciuokle");
        System.out.println();

        IOManager manager = new IOManager();

        while(true) {
            manager.suzinokFigura();
            manager.suzinokKrastines();
            manager.skaicioti();
            System.out.println("Ar norite kartoti? (T/N)");
            if(!manager.atsakymas()) break;
        }
    }
}
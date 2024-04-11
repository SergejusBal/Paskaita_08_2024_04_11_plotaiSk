public class Trikampis extends Figura{

    Trikampis(double kr1, double kr2){
        super(kr1,kr2);
    }

    @Override
    public void skaiciuokPlota(){
        double plotas  = super.getKrastine1()*super.getKrastine2() / 2;
        super.setPlotas(plotas);
    }
}

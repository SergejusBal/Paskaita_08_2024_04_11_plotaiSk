import java.math.BigDecimal;
import java.math.RoundingMode;

public class Skritulys extends Figura {

    Skritulys(double kr){
        super(kr,kr);
    }
    @Override
    public void  skaiciuokPlota(){
        double plotas = Math.PI * Math.pow(super.getKrastine1(),2);
        BigDecimal sk = new BigDecimal(plotas);
        sk = sk.setScale(2, RoundingMode.UP);
        super.setPlotas(Double.valueOf(sk.toString()));
    }
}

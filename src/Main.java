import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        BigDecimal a = new BigDecimal("12345.12345467");
        BigDecimal b = new BigDecimal("12345.123446");
        BigDecimal c = a.add(b);
        System.out.println(c);
        System.out.println();
        MathContext mc = new MathContext(25);
        BigDecimal res = a.round(mc);
        System.out.println();
        System.out.println(res);
        res = a.setScale(5,RoundingMode.HALF_UP);
        BigDecimal res3 = b.setScale(5,RoundingMode.HALF_UP);
        System.out.println("res "+res);
        System.out.println("res2 "+ res3);

        System.out.println(new BigDecimal("1232215151515155151515515155554545545454545445454545.566557").setScale(5,RoundingMode.HALF_DOWN));

        System.out.println(new BigDecimal("12345.123452").setScale(5,RoundingMode.UP));

        BigDecimal bd1 =
                new BigDecimal("124567890.0987654321");
        BigDecimal bd2 =
                new BigDecimal("987654321.123456789");

        System.out.println(bd1.add(bd2));
        System.out.println(bd1.subtract(bd2).round(mc));
        System.out.println(bd1.multiply(bd2));
        //System.out.println(bd1.divide(bd2).round(mc));
        System.out.println(bd1.pow(2));
        System.out.println(bd1.negate());

        BigDecimal bd3 = new BigDecimal("0.3");
        System.out.println(bd3);

        BigDecimal bd4 = BigDecimal.valueOf(0.37664645353353553);
        System.out.println(bd4);

        System.out.println(BigDecimal.ONE);
        System.out.println(BigDecimal.ZERO);
        System.out.println(BigDecimal.TEN);


        BigDecimal bd5 = new BigDecimal("1.2");
        System.out.println(bd5);

        //BigDecimal
        bd5 = bd5.divide(bd4,2);
        System.out.println(bd5);

        bd5 = bd5.divide(bd4,5, RoundingMode.CEILING);
        System.out.println(bd5);

        if(a.compareTo(b)==0){
            System.out.println("equal");
        }
        else if(a.compareTo(b)==1){
            System.out.println("greater");
        }
        else{
            System.out.println("less");
        }
        System.out.println();



    }
}
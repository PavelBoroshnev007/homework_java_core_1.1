public class Main {
    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);// 3
        int b = calc.minus.apply(1,1);//0
        int c = calc.devide.apply(a, b);

        int d = calc.multiply.apply(a,b);
        int e = calc.pow.apply(a);
        int f = calc.abs.apply(b); 


        calc.println.accept(c);
        calc.println.accept(d);
        calc.println.accept(e);
        calc.println.accept(f);
    }
}

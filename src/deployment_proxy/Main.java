package deployment_proxy;

public class Main {
    public static void main(String[] args) {
        MathCalculatorProxy proxy = new MathCalculatorProxy();
        double result = proxy.add(1,2);
        System.out.println("1+2 = "+ result);
        try {
            result = proxy.add(2, Double.MAX_VALUE);
            System.out.println("2+Double.MAX_VALUE = " + result);
        } catch (RuntimeException e) {
            System.out.println("Lỗi rồi kìa");
        }

    }
}

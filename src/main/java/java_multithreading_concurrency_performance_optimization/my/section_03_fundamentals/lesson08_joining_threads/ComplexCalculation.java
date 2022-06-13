package java_multithreading_concurrency_performance_optimization.my.section_03_fundamentals.lesson08_joining_threads;

import java.math.BigInteger;

class Test {
    public static void main(String[] args) throws InterruptedException {

        ComplexCalculation complexCalculation = new ComplexCalculation();
        BigInteger bigInteger =
                complexCalculation.calculateResult(
                        new BigInteger("5"),
                        new BigInteger("1"),
                        new BigInteger("5"),
                        new BigInteger("1"));


        System.out.println(bigInteger);

    }
}

public class ComplexCalculation {


    public BigInteger calculateResult(BigInteger base1, BigInteger power1, BigInteger base2, BigInteger power2) {
        BigInteger result;

        PowerCalculatingThread thread1 = new PowerCalculatingThread(base1, power1);
        PowerCalculatingThread thread2 = new PowerCalculatingThread(base2, power2);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        result = thread1.getResult().add(thread2.getResult());

        return result;
    }

    private static class PowerCalculatingThread extends Thread {
        private BigInteger result = BigInteger.ONE;
        private BigInteger base;
        private BigInteger power;

        public PowerCalculatingThread(BigInteger base, BigInteger power) {
            this.base = base;
            this.power = power;
        }

        @Override
        public void run() {
            for (BigInteger i = BigInteger.ZERO; i.compareTo(power) != 0; i = i.add(BigInteger.ONE)) {
                result = result.multiply(base);
            }
        }

        public BigInteger getResult() {
            return result;
        }
    }

}

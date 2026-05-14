package task12;

public class Main {
    public static void main(String[] args) {
        // ===== Задача 1: Калькулятор =====
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        int c = calc.devide.apply(a, b);

        // Ошибка: при b = 0 падает ArithmeticException (деление на ноль).
        // Чтобы не крашить программу, добавил проверку в лямбду devide в классе Calculator.

        calc.println.accept(c);

        System.out.println("---");

        // ===== Задача 2: Работяга =====
        OnTaskDoneListener listener = System.out::println;
        Worker worker = new Worker(listener);
        worker.start();
    }
}
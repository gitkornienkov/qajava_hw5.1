package org.korndev;
import org.korndev.services.CalcService;

public class Main {
    public static void main(String[] args) {
        CalcService service = new CalcService();
        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;

        int monthCount = service.calculate(income, expenses, threshold);
        System.out.println("В этом году получится взять отпуск " + monthCount + " раз(а)");
    }
}
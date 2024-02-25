package HW7;

/*
Main - Точка входа в Калькулятор комплексных чисел;
CalculatorInput - запуск путем создания обьектов (отвечает за ввод данных в консоль),
CalculatorController - отвечает за логирование операций;
realizeCalculate() - запускает работу калькулятора;
 */
public class Main {
    public static void main(String[] args) {
        CalculatorInput calculatorInput = new CalculatorInput();
        CalculatorController calculatorController = new CalculatorController(calculatorInput);
        calculatorController.realizeCalculate();
    }
}

package HW7;

/*
CalculateInterface интерфейс для реализации методов;
 */
public interface CalculateInterface {
    Calculator additionNumbers(Calculator numberNew);

    Calculator subtractNumbers(Calculator numberNew);

    Calculator multiplyNumbers(Calculator numberNew);

    Calculator divideNumbers(Calculator numberNew);

    String toString();
}
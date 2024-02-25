package HW7;

public class Calculator {
    /**
    numberReal - вещественная часть;
    numberImaginaryPart - мнимая часть;
     */
    public double numberReal;
    public double numberImaginaryPart;

    public Calculator(double numberReal, double numberImaginaryPart) {
        this.numberReal = numberReal;
        this.numberImaginaryPart = numberImaginaryPart;
    }

    /*
    additionNumbers - метод сложения комплексных чисел;
     */
    public Calculator additionNumbers(Calculator numberNew) {
        return new Calculator(this.numberReal + numberNew.numberReal,
                this.numberImaginaryPart + numberNew.numberImaginaryPart);
    }

    /*
    subtractNumbers - метод вычитания комплексных чисел;
     */
    public Calculator subtractNumbers(Calculator numberNew) {
        return new Calculator(this.numberReal - numberNew.numberReal,
                this.numberImaginaryPart - numberNew.numberImaginaryPart);
    }

    /*
    multiplyNumbers - метод умножения комплексных чисел;
     */

    public Calculator multiplyNumbers(Calculator numberNew) {
        double realContainer = (this.numberReal * numberNew.numberReal) -
                (this.numberImaginaryPart * numberNew.numberImaginaryPart);
        double imaginaryContainer = (this.numberReal * numberNew.numberImaginaryPart) +
                (this.numberImaginaryPart * numberNew.numberReal);
        return new Calculator(realContainer, imaginaryContainer);
    }

    /*divideNumbers - метод деления комплексных чисел;
     */
    public Calculator divideNumbers(Calculator numberNew) {
        double realPart = ((this.numberReal * numberNew.numberReal) +
                (this.numberImaginaryPart * numberNew.numberImaginaryPart)) /
                ((numberNew.numberReal * numberNew.numberReal) +
                        (numberNew.numberImaginaryPart * numberNew.numberImaginaryPart));
        double imaginaryPart = ((this.numberImaginaryPart * numberNew.numberReal) -
                (this.numberReal * numberNew.numberImaginaryPart)) /
                ((numberNew.numberReal * numberNew.numberReal) +
                        (numberNew.numberImaginaryPart * numberNew.numberImaginaryPart));
        return new Calculator(realPart, imaginaryPart);
    }

    @Override
    public String toString() {
        if (numberImaginaryPart >= 0) {
            return numberReal + " + " + numberImaginaryPart + "i";
        } else {
            return numberReal + " - " + Math.abs(numberImaginaryPart) + "i";
        }
    }

}

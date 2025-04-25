
package Assignment_2;

public class Calc_Functions 
{
    private double number1, number2, answer;
    
    public Calc_Functions()
    {
        this.number1 = 0.0;
        this.number2 = 0.0;
        this.answer = 0.0;
    }
    
    public double Addition(double number1, double number2)
    {
        this.number1 = number1;
        this.number2 = number2;
        this.answer = this.number1 + this.number2;
        return this.answer;
    }
    
    public double Subtraction(double number1, double number2)
    {
        this.number1 = number1;
        this.number2 = number2;
        this.answer = this.number1 - this.number2;
        return this.answer;
    }
    
    public double Multiplication(double number1, double number2)
    {
        this.number1 = number1;
        this.number2 = number2;
        this.answer = this.number1 * this.number2;
        return this.answer;
    }
    
    public double Division(double number1, double number2)
    {
        this.number1 = number1;
        this.number2 = number2;
        this.answer = this.number1 / this.number2;
        return this.answer;
    }
    
    public double Modulus(double number1, double number2)
    {
        this.number1 = number1;
        this.number2 = number2;
        this.answer = this.number1 % this.number2;
        return this.answer;
    }
}

package hw_2_4_calculator;
@org.springframework.stereotype.Service
public class ServiceLogic implements Service{

    @Override
    public int summ(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int subtract(int num1, int num2) {
        return num1 - num2;
    }

    @Override
    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int devide(int num1, int num2) {
        return num1 / num2;
    }
}

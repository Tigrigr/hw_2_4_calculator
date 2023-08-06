package hw_2_4_calculator;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class Controller {

    private final ServiceLogic ServiceLogic;

    public Controller(hw_2_4_calculator.ServiceLogic serviceLogic) {
        ServiceLogic = serviceLogic;
    }


    @GetMapping
    public String wellcome() {
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping("/summ")
    public String sum(@RequestParam int num1, @RequestParam int num2) {
        int result = ServiceLogic.summ(num1, num2);
        return response(num1, num2, result, '+');
    }
    @GetMapping("/subtract")
    public String subtract(@RequestParam int num1, @RequestParam int num2) {
        int result = ServiceLogic.subtract(num1, num2);
        return response(num1, num2, result, '-');
    }
    @GetMapping("/multiply")
    public String multiply(@RequestParam int num1, @RequestParam int num2) {
        int result = ServiceLogic.multiply(num1, num2);
        return response(num1, num2, result, '*');
    }
    @GetMapping("/devide")
    public String devide(@RequestParam int num1, @RequestParam int num2) {
        if (num2 == 0) {
            return "На ноль делить нельзя!";
        }
        int result = ServiceLogic.devide(num1, num2);
        return response(num1, num2, result, '/');
    }

    private String response(int num1, int num2, int result, char act) {
        return String.format("%d %c %d = %d", num1, act, num2, result);
    }
}

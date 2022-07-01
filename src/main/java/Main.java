import ru.netology.javaqa.javaqamvn.services.SQRService;

public class Main {
    public static void main(String[] args) {

    SQRService service = new SQRService();
    System.out.println(service.calcSqr(1,1000000));
    }
}

import ru.netology.sqr.service.SQRService;

import java.sql.SQLOutput;

public class Main {

        public static void main(String[] args) {
            SQRService service = new SQRService();
            System.out.println(service.enumeration(200, 300));
        }
 }


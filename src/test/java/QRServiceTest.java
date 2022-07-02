import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.sqr.service.SQRService;

public class QRServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/range.csv")
    public void sortOut(int expected, int startRange, int endRange) {
        SQRService service = new SQRService();

        int actual = service.enumeration(startRange, endRange);

        Assertions.assertEquals(expected, actual);
    }

}


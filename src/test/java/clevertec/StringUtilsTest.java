package clevertec;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.clevertec.StringUtils;

class StringUtilsTest {

    @Test
    void testNumber(){
        Assertions.assertTrue(StringUtils.isPositiveNumber("5.6"));
    }
}
import org.testng.annotations.Test;

import java.util.Objects;

public class UtilsMethod {
    @Test
    public void testStringUtils(){
        System.out.println("pre");
        assert(Objects.nonNull("3"));
        System.out.println("post");

    }
}

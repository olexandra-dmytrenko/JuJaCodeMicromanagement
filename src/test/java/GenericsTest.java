import java.util.List;

public class GenericsTest {

    public <T> void generic(List<T> list, Class<T> clazz){
        if (clazz == Integer.class){
            //...
        }
    }
    public void generic(Integer intr){}
}

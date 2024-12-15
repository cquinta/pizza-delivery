package academy.quarkus.pizza;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import javax.inject.Inject;
import java.util.List;

@QuarkusTest
public class PizzaTest {
    @Inject
    PizzaResource pizzaResource;
    @Test
    public void testSanity() {
        List<Pizza> ps = pizzaResource.getPizza();
        Assertions.notNull(ps);
    }
}

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShopRepositoryTest {
    @Test
    public void mustRemove (){
        ShopRepository shopRepository = new ShopRepository();
        Product product = new Product(10,"Korm", 100);
        shopRepository.add(product);
        Product [] expected = {};
        Product [] actual = shopRepository.removeById(10);
    }

    @Test
    public void findAnException (){
        ShopRepository shopRepository = new ShopRepository();
        Product product = new Product(10,"Korm", 100);
        shopRepository.add(product);
        Assertions.assertThrows(NotFoundException.class, () -> {
                shopRepository.removeById(5);
        });
    }
}

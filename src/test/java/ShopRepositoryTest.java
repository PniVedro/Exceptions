import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShopRepositoryTest {
    @Test
    public void mustRemove (){
        ShopRepository shopRepository = new ShopRepository();
        Product product1 = new Product(10,"Korm", 100);
        Product product2 = new Product(15,"Korm", 105);
        shopRepository.add(product1);
        shopRepository.add(product2);
        Product [] expected = {product2};
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

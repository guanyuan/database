import com.Cart;
import com.Item;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class ItemListTest {

    @Test
    public void should_connect_database() throws Exception {
        Cart cart = new Cart();
        assertThat(cart.getNameById("1"), is("XiaoLi"));
    }

    @Test
    public void should_get_itemlist_of_XiaoMing() throws Exception {
        Cart cart = new Cart();
        Item item1 = new Item("2", "XiaoMing", "10000", "JiaDuoBao");
        Item item2 = new Item("2", "XiaoMing", "10000", "JiaDuoBao");
        List<Item> xiaoMingDetail = cart.getDetailByName("XiaoMing");
        assertThat(xiaoMingDetail.size(), is(2));
    }
}

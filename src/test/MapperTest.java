import com.Item;
import com.ItemMapper;
import com.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class MapperTest {
    @Test
    public void should_get_query_result_using_annotation_mapping() throws Exception {
        SqlSession sqlSession = new MyBatisUtils().createFactory();
        ItemMapper mapper = sqlSession.getMapper(ItemMapper.class);
        //sqlSession.close();
        List<Item> allItem = mapper.getAllItem();
//        assertThat(allItem.size(), is(3));
    }
}

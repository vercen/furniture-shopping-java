import com.edu.furn.bean.Furn;
import com.edu.furn.dao.FurnMapper;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.math.BigDecimal;

/**
 * @author vercen
 * @version 1.0
 * @date 2023/3/20 1:41
 */
public class FurnMapperTest {

    @Test
    public void insertTest(){
        ApplicationContext ioc =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        //2获取FurnMapper
        FurnMapper furnMapper = ioc.getBean(FurnMapper.class);
//        System.out.println("furnMapper--" + furnMapper.getClass());
        //3.添加数据
//        Furn furn =
//                new Furn(null, "北欧风格沙发~~", "顺平家居~~", new BigDecimal(180), 666,
//                        70, "assets/images/product-image/1.jpg");
//        int i = furnMapper.insertSelective(furn);
//        System.out.println(i);
//        System.out.println("ok");
        Furn furn = furnMapper.selectByPrimaryKey(4);



    }
}

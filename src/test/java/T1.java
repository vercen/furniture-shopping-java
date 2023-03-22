import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author vercen
 * @version 1.0
 * @date 2023/3/20 0:50
 */
public class T1 {
    @Test
    public void t1(){
        //1、创建SpringIOC 容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println(ac.getBean("pooledDataSource"));
        System.out.println(ac.getBean("sqlSessionFactory"));
    }
}

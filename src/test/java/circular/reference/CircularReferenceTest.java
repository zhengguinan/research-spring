package circular.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <p>Title: research-spring</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2018</p>
 * <p>Company: www.jd.com</p>
 *
 * @author zhengguinan
 * @version 1.0
 * @date 2018/1/30
 */
public class CircularReferenceTest {
    public static void main(String[] args) {
        //http://blog.csdn.net/u010644448/article/details/59108799
        ApplicationContext context = new ClassPathXmlApplicationContext("circular-reference.xml");
        System.out.println(context.getBean("a", StudentA.class));
    }
}

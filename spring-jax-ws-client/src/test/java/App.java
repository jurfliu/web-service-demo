import com.ljf.spring.jax.ws.client.service.BeiJingClientUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class App {
    // 注入远程访问服务端的接口的代理对象。
    @Resource
    private  BeiJingClientUserService userService;
    @Test
    public void test() throws Exception {
        System.out.println(userService);
        // class com.sun.proxy.$Proxy45
        System.out.println(userService.getClass());

        // 远程调用服务接口
        String content = userService.sayHelloToBeijingName("北京");
        System.out.println(content);
    }
}

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

public class Test1 {
    private ApplicationContext applicationContext;

    @Before
    public void init() {
        applicationContext = new ClassPathXmlApplicationContext(
                "classpath:Spring/applicationConfig-Dao.xml");
    }

    @Test
    public void testJedisPool( ) {
        JedisPool pool = (JedisPool) applicationContext.getBean("jedisPool");
        Jedis jedis = pool.getResource();
        try  {
            jedis.set("name", "lisi");
            String name = jedis.get("name");
            System.out.println(name);
        }catch(Exception ex){
            ex.printStackTrace();
        }finally{
            if(jedis != null){
                //关闭连接
                jedis.close();
            }
        }
    }

}

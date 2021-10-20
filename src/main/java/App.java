import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class); //Указываем спрингу где искать анотации

        HelloWorld firstHelloBean = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(firstHelloBean.getMessage());

        HelloWorld anotherHelloBean = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(anotherHelloBean.getMessage());

        System.out.println(firstHelloBean.equals(anotherHelloBean));

        Cat firstCatBean = (Cat) applicationContext.getBean("cat");
        System.out.println(firstCatBean.getMessage());

        Cat anotherCatBean = (Cat) applicationContext.getBean("cat");
        System.out.println(anotherCatBean.getMessage());

        System.out.println(firstCatBean.equals(anotherCatBean));
    }
}
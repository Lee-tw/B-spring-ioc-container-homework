@Component 已经可以支持声明一个 bean 了，为何还要再弄个 @Bean 出来？

@Component 只适用于将自己编写的类放进 spring 容器中，如果想要将第三方库放进 spring 容器中，
就需要使用 @Bean 配合 @Configuration 来使用

使用方法

@Configuration
public class MyClass {
  @Bean
  public ThirdPartyClass getClass1() {
    return new ThirdPartyClass();
  }
}
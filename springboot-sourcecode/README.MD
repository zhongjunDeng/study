#   ApplicationContextInitializer(启动加载)
1. 使用场景
   2. 在ConfigurableApplicationContext类型(或者子类型)的ApplicationContext做refresh之前，允许我们对ConfiurableApplicationContext的实例做进一步的设置和处理。
3. 使用方式
   4. 在启动类中使用
   5. 在application.yml中使用
   6. 在spring.factories中使用
#   ApplicationListener
1. 使用场景：对时间进行监听
#   CommandLineRunner 与 ApplicationRunner
1. 两个接口的实现方法不同，参数不一样，没有其他区别，两个参数都可以接收java命令设置的参数及值
   2. 使用场景： 针对预加载数据需求，提前加载到缓存中或类的属性中，并希望执行操作的时间是在容器启动末尾时间执行操作
#   FactoryBean
1. 动态将Bean注入IOC


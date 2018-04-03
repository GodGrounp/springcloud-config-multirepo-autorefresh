启动依赖：

1. 本地启动 rabbitmq， localhost， 端口 5672，  已有账户 admin/admin； 也可以根据自己 rabbitmq环境修改 配置服务里边的 application.yml 中rabbitmq相关的配置
2. 两个配置仓库， 可以将下面2个git仓库 download 下来， 然后修改 springcloud-config-autorefresh-server 的配置文件
3. 配置仓库
   1. 通用配置仓库 https://github.com/minorpoet/spring-cloud-config-repo
   2. 独立的应用仓库 https://github.com/minorpoet/spring-cloud-config-repo-alone

启动顺序：

1. springcloud-config-autorefresh-eureka 服务注册中心
2. springcloud-config-autorefresh-server 配置服务
3. springcloud-config-autorefresh-client-dog 配置消费者 dog
4. springcloud-config-autorefresh-client-cat 另一个配置消费者 cat
5. springcloud-config-autorefresh-client-special 消费独立配置仓库的消费者

局部刷新指定配置消费者， 加上参数 destination={eureka.instance.instance-id} 注册到 eureka 的唯一id

curl -X POST http://localhost:8080/bus/refresh -d 'destination=autorefresh-client-dog:8081'



拆分开来的好处是： 更新特定配置的时候 基于git的 webhoot 配置成只更新的对应应用的配置，而不会广播到所有配置消费服务
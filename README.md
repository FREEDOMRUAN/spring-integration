# spring-integration
Samples of different Spring Integration modules (mybatis,springmvc,jquery)

```sql
CREATE TABLE user(
		id BIGINT(20)NOT NULL AUTO_INCREMENT,
		user_name VARCHAR(20)NOT NULL,
		email VARCHAR(20),
		gender VARCHAR(10),
		address VARCHAR(40),
		birthDay DATETIME default NULL,
		update_date DATETIME default NULL,
		register_date DATETIME default NULL,
		PRIMARY KEY(id)
)ENGINE = INNODB AUTO_INCREMENT = 1 DEFAULT CHARSET = utf8;
```
 
> * com.company.dao.pojo这里存放的是与数据库对应的表的POJO
> * com.company.dao这里存放最原子的数据库操作的代码,每一个类的操作,都有一张与之对应的表.它只向 com.company.dao.service 层提供服务.
> * com.company.dao.service这里存放的是对 com.company.dao 的管理服层,因为有些关系不是只是操作一张表的,可能要对两张或以上的表进行事务操作.这时, 就应该把这些操作放在这里.
> * com.company.controller这里存放的是所有 controller 的类,即Restful API层.前端可以直接访问的方法就放在这里.
> * com.company.task这里存放的是所有与task相关的类.比如用了spring task的服务的类都放在这里.（如果有的话）
> * com.company.rabbitmq.queue这里存放的是所有与消息队列进队相关的类.
> * com.company.rabbitmq.listener这里存放的是所有与消息队列出队相关的监听器的类
> * com.company.utils这里存放的是所有与工具类相关的类
> * com.company.pojo这里存放的是除了DB的映射关系的POJO以外的POJO
> * com.company.constants这里存放的是与常量有关的类
> * com.company.redis这里存放的是所有与redis操作相关的类
> * com.company.filter这里存放所有filter类
> * com.company.inteceptor这里存放所有interceptor类
> * com.company.service为其他类提供的服务类,因为有些时候,使用Utils静态工具类,无法注入Spring的依赖,
> * 这时可以使用@service来注解某个服务类,为其他类提供服务,又可以使用Spring的DI优点.因为Spring默认下是对象是单例的.所以不必担心对象实例化过多的问题.




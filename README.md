# SpringBootDubbo
这是一个springboot整合Dubbo的一个小demo

1.整个demo主要由三个module组成，DubboService是通用借口模块，供provider和consumer使用。mvn install后供其它模块导入

2.provider是服务提供者模块,主要是将接口实现，并用@service声明，并将springboot app开启即可

3.consumer是消费者模块，注意application.propreties下面的scan是consumer，同时因为提供controller，所以要有server.port
来给定端口，通过restful api方式调用

4.注意pom.xml中都要有log4j

5.启动后可以由dubbo admin查看情况

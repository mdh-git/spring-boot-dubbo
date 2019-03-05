# spring-boot-dubbo

zookeeper-3.4.11

zookeeper-3.4.11\conf 下有个zoo_sample.cfg复制一份相同的命名zoo.cfg

然后打开zoo.cfg 修改dataDir=../data （当前文件夹的上级目录）

windows环境下  启动 cmd 启动 zkServer.cmd 启动zk服务

windows环境下  启动 cmd 启动     zkCli.cmd    启动zkclient服务器





dubbo - admin 

在zkdubbo—incubator-dubbo-ops-master—dubbo-admin

进入文件夹dubbo-admin    cmd---   mvn clean package

jar包  java -jar  dubbo-admin-0.0.1-SNAPSHOT.jar  运行

启动localhost:7001就ok了





dubbo-monitor

在zkdubbo—incubator-dubbo-ops-master—dubbo-monitor-simple

进入文件夹dubbo-monitor-simple    cmd---   mvn clean package

打包完成有两个压缩包

dubbo-monitor-simple-2.0.0.jar

dubbo-monitor-simple-2.0.0-assembly.tar.gz（需要的）

解压dubbo-monitor-simple-2.0.0-assembly.tar.gz

在dubbo-monitor-simple-2.0.0——conf文件下有dubbo.properties

主要检查dubbo.properties

dubbo.registry.address=zookeeper://127.0.0.1:2181（本地配置）

启动 dubbo-monitor-simple-2.0.0/assembly.bin  下start.bat 启动成功

访问localhost:8080





项目构建

公共的属性，接口 放在api

提供者  service-provider       dubbo的提供者（简单期间使用springboot）

消费者 service-consumer     dubbo的消费者（简单期间使用springboot  web模块）
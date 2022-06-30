## 项目简述
### 三维五子棋聊天服务器：
- 与前端swing客户端的聊天加好友等接口对接
- 实时展示连接客户的ip和端口
- 与连接数据库，进行增删改查

运行`EchoThreadServer`后会打开客户端管理窗口，显示登入的客户端，默认500并发

## 服务器信息:
> 阿里云服务器ip: `103.46.128.46` <br>
> 阿里云服务器端口:`59614`
### 连接本地聊天服务器:
 
运行`src/main/java下的com.ZLchat.server.EchoThreadServer.java`
来启动服务器，当弹出管理用户动态表格即为启动成功。 <br>
如果显示xx端口占用,这里以`8080`为例:
根据端口号查找进程：

     netstat -aon |findstr 8080
     
 杀死该进程: 

     taskkill -f -pid 8080
    
###  连接云聊天服务器:
 将`src/main/java/com/ZLchat/util/ComponentUtil/Controller/Controller.java`类中 **52行** 的 <br>
  
     clien = new Socket("localhost", 8888)
改为 
     
     clien = new Socket("103.46.128.46", 59614) <br>
     
 云服务器ip:`103.46.128.46`  云服务器端口:`59614`

<br>

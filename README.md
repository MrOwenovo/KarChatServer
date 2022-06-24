# 项目简述
### 三维五子棋服务器，运行EchoThreadServer后会打开客户端管理窗口，显示登入的客户端，默认500并发
### 阿里云服务器ip: 103.46.128.46
### 阿里云服务器端口:59614
---

<br>



# KarGoBangServer项目结构
## 数据访问层:dao
>用于与数据库进行交互，分为
>- 接口部分: 内含与数据库进行交互的方法，注册为bean
>- impl:  接口的实现类，通过ioc获取
>- mapper: 与数据库完成映射的映射类，注册为mapper
>- operation: 博客部分的数据库交互（未整合）

<br>

---

## 实体层:entity
>从数据库中获取的实体类

<br>

---


---

## 工具类:util
>- BeansUtil: 配置spring的IOC容器的配置类，内涵mybatis配置
>- ColorUtil:用于读取颜色，修改颜色的工具类
>- ComponentUtil:用于形成主界面的组件
   >   - Button: 按钮控件
         >     + ChooseBackButton: 点击背景会变颜色的按钮，鼠标进入按钮范围内会变色
>     + RadioButton: 圆形功能性按钮，进入范围会变色，用于右上角关闭最小化最大化
>     + RoundButton: 圆角按钮，通过绘制图形完成的圆角
>     + ThreeDimensionalBorder:带阴影的按钮，可以控制阴影颜色和范围
>  - CompositeComponent: 复合控件,即完成度较高的组件
     >      + Menu: 菜单栏组件，主程序左半部分的菜单栏以及上面的功能标签
>      + MenuContent: 菜单内容组件，及点击功能标签后显示的内容窗口
>  - Frame: 画布控件
     >      + FadingText: 渐变消失的提醒组件
>      + Frameless:没有边框栏的，实现拖动的画布
>  - Label: 标签组件
     >      + DynamicJLabel: 字体标签，可以跟随字体长度变化大小，需要确定字体类型以及中心点，会以中心点为中心变化，修改可以只修改字体并自适应
>      + InnerLabel: 聊天窗口，即主程序双击好友打开的聊天窗，仿照steam聊天窗
>      + messageLabel: 消息标签，分为我方消息和对方消息，自动匹配头像位置，并且字数超过一定数量会进行换行，最后一行字单独列出，与InnerLabel联合使用
>      + RadioJLabel: 圆角标签
>      + RadioTextJLabel: 背景带图片和文字的标签
>      + ShakeLabel: 实现Shakeable的表现，通过方法可以抖动
>  - Loading: 加载组件，也是复合组件
     >    + Loading: 最基本的加载条，登录界面的加载条，圆形加载条的前后速度不一致，形成高级效果
>    + LoadingBack: 前后速度一致的圆形加载条，只有一条，用于组成LoadingHome
>    + LoadingHome:登录成功进入主界面的加载界面，由3个半径和颜色不同的LoadingBack组成
       >    <br>LoadingHome:
       >    ![LoadingHome](src/main/resources/readMe/loading.png)
>    + ServerLoading:小范围且加入图片的加载条，如主界面服务器断开连接时左上角头像的加载条
>- **Controller**: 驱动程序运行的驱动类
>- EmailUtil: 发送邮件类，需要查看下面的注意事项进行配置
>- FontUtil:字体工具类，包括查看系统所有自带字体，以及获取某一字体一行字的长度，用于判断组件长度
>- PictureUtil:图片工具类
   >    + GetPicture:将数据库中的图像字符串转为BufferedImage
>    + RemoveBackground: 某些图片背景带有白色和黑色，将背景去除
>    + RemoveBlack:原理同上
>    + ToBufferedImage:将Image转为BufferedImage
>    + ToPicture:BufferedImage图片转化成字符串储存在数据库中
       >-SoundUtil: 音乐处理类，某些类功能未完善好，光使用PlaySound播放MP3
>    + PlaySound:播放音乐

>****Constant****:<br>常量类，包括spring上下文的context,Controller用到的是否进行操作的boolean标志，存储的用户名密码，存储的好友列表等等，以及后台线程是否执行完的记录

<br>

---




---


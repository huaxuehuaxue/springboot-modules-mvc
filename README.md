# springboot-modules-mvc
Springboot工程实例，父工程中包含两个springboot微服务，用不同端口启动，有共同依赖。

##Features
- [done] 同一个工程中多个springboot；不同端口启动
- [todo] OAuth2 统一授权
- [todo] 日志收集
- [todo] 统一异常处理、异常页面建设

##使用
- 编译整个项目：
-         在父项目目录中执行：`gradle build`
        
-运行单个springboot模块：
-        运行smm-workflow-server：
-             在父项目目录中执行：`gradle smm-workflow-server:bootRun`
-        运行smm-nodejs-server：
-             在父项目目录中执行：`gradle smm-nodejs-server:bootRun`
             
-运行全部springboot模块：
-        `gradle bootRun --parallel`
                让各位大佬见笑了，为了找此命令，花了几天的时间~~~            
             
             
             
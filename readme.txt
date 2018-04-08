框架创建步骤：
    一、创建父框架springboot-modules-mvc
        选择Spring Initializr，选择Gradle Project； 创建之后删除src文件夹

    二、创建smm-util、smm-dao、smm-service、smm-nodejs-server、smm-workflow-server
        在父项目springboot-modules-mvc右键，然后选择：New-->Module-->...
        注意：smm-util、smm-dao、smm-service新建之后，删除里面的所有.java文件，因为要作为模块，并不作为springboot入口

    三、修改各个build.gradle文件
        父项目build.gradle : 做全局定义，避免子项目重复定义
        smm-common/util不依赖任何内容，build.gradle为空
        smm-dao的build.gradle配置 spring-context
        smm-service依赖smm-util、smm-dao包，依赖spring-context
        smm-nodejs-server/smm-workflow-server依赖smm-util、smm-dao、smm-common、smm-service，是作为springboot的入口，有buildscript和springboot的依赖








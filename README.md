# 概述

为实现springboot打包中，lib和jar独立开，每次上传只传代码



# lib分离打包
- `main` 此分支是只有maven引用，无本地引用的分支离线打包
- `system-lib-jar` 此分支是有引用`system`级别的java包，打包后的启动


# 运行方式

```shell
java -jar demo.jar
```
当出现uuid就成功了！


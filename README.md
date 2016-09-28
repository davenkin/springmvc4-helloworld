HelloWorld in Spring MVC 4.

一个程序员的能力不在于增加代码的能力,而在于减少代码的能力.


如何运行程序: git clone代码后,在命令行中将目录切换到springmvc4-helloworld文件夹, 对于Linux用户,运行"./gradlew jettyRun",对于Windows用户,运行"gradlew.bat jettyRun",初次执行可能会比较慢, 因为gradle会从网上下载很多依赖.

打开程序: [http://localhost:8080/springmvc4-helloworld/hello](http://localhost:8080/springmvc4-helloworld/hello)


尝试一下挑战吧:
对于该程序,只删除文件或者文件里的某些行,不能修改某行,不能增加文件,最后在运行"./gradlew jettyRun"时,依然可以在打开[http://localhost:8080/springmvc4-helloworld/hello](http://localhost:8080/springmvc4-helloworld/hello)时看到页面上的"Hello World!", 能删除文件行或文件最多者胜出.


Here is the challenge:

Reduce the code as much as you can by just deleting lines or files, and do not add files, then run "./gradlew jettyRun", you can still see "Hello World!" at [http://localhost:8080/springmvc4-helloworld/hello](http://localhost:8080/springmvc4-helloworld/hello). The person deleted the lines the most wins.


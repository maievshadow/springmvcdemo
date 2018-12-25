<<<<<<< HEAD
# springmvcdemo
=======
#
open modules settings --> artifact /facets (web resources directory)

and web.xml ---> 

<context-param>
        <param-name>contextConfigLocation</param-name>
        <param-value>/WEB-INF/applicationContext.xml</param-value> ---attention
    </context-param>
    <listener>
        <listener-class>org.springframework.web.context.ContextLoaderListener</listener-class>
    </listener>
    <servlet>
        <servlet-name>dispatcher</servlet-name>
        <servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
        <init-param>
            <param-name>contextConfigLocation</param-name>
            <param-value>/WEB-INF/dispatcher-servlet.xml</param-value> (--attention)
        </init-param>
        
        ojbk~~~
    jdbc.properties --BUG1
    pom.xml --<build>
    *Mapper.java -- @java 方式的SQL 写法问题
>>>>>>> v1

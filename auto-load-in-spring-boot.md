
在idea中实现SpringBoot实现服务器自动重启

# 导入依赖


```

    <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-devtools</artifactId>
      <optional>true</optional>
    </dependency>

```

# 导入插件

```
<build>
    <pluginManagement><!-- lock down plugins versions to avoid using Maven defaults (may be moved to parent pom) -->
      <plugins>
        <plugin>
          <groupId>org.springframework.boot</groupId>
          <artifactId>spring-boot-maven-plugin</artifactId>
          <configuration>
            <fork>true</fork> <!-- 如果没有该配置，devtools不会生效 -->
          </configuration>
        </plugin>
    ...
```

# 设置Setting
输入compiler，然后勾选Build project automatically

# maintenance
如果在mac默认是没有这个快捷简单，那么进入Setting，搜索maintenance,可以看到在KeyMap中有这个选项，设置一个快捷键就可以访问。
按住shift+alt+ctrl+/，进入maintenance,然后选择进入Registry,勾选compiler.automake.when.app.running








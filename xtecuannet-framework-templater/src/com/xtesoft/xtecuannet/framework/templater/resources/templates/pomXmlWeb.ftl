<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>org.xtecuan.ejemplos.spring</groupId>
    <artifactId>crud</artifactId>
    <version>1.0-SNAPSHOT</version>
    <packaging>war</packaging>

    <name>crud</name>

    <properties>
        <endorsed.dir>${project.build.directory}/endorsed</endorsed.dir>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    </properties>

    <dependencies>
        <dependency>
            <groupId>org.xtecuan.ejemplos.spring</groupId>
            <artifactId>crud-modelo</artifactId>
            <version>1.0-SNAPSHOT</version>
        </dependency>
        <dependency>
            <groupId>javax</groupId>
            <artifactId>javaee-web-api</artifactId>
            <version>6.0</version>
            <scope>provided</scope>
        </dependency>
        <dependency>
            <groupId>com.xtesoft.xtecuannet.framework</groupId>
            <artifactId>xtecuannet-framework-viewcontroller-mvn</artifactId>
            <version>1.0-SNAPSHOT</version>
        </dependency>
        <dependency>
            <groupId>com.xtesoft.xtecuannet.framework</groupId>
            <artifactId>primefaces-utils-springframework-mvn</artifactId>
            <version>1.0-SNAPSHOT</version>
        </dependency>
        <dependency>
            <groupId>com.xtesoft.xtecuannet.framework</groupId>
            <artifactId>xtecuannet-framework-model-mvn</artifactId>
            <version>1.0.2-SNAPSHOT</version>
        </dependency>
        <dependency>
            <groupId>commons-fileupload</groupId>
            <artifactId>commons-fileupload</artifactId>
            <version>1.3</version>
        </dependency>
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-webmvc</artifactId>
            <version>3.0.7.RELEASE</version>
        </dependency> 
        <dependency>
            <groupId>org.glassfish</groupId>
            <artifactId>javax.faces</artifactId>
            <version>2.2.0-SNAPSHOT</version>
            <scope>provided</scope>
        </dependency>
    </dependencies>

    <build>
        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-compiler-plugin</artifactId>
                <version>2.3.2</version>
                <configuration>
                    <source>1.6</source>
                    <target>1.6</target>
                    <compilerArguments>
                        <endorseddirs>${endorsed.dir}</endorseddirs>
                    </compilerArguments>
                </configuration>
            </plugin>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-war-plugin</artifactId>
                <version>2.1.1</version>
                <configuration>
                    <failOnMissingWebXml>false</failOnMissingWebXml>
                </configuration>
            </plugin>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-dependency-plugin</artifactId>
                <version>2.1</version>
                <executions>
                    <execution>
                        <phase>validate</phase>
                        <goals>
                            <goal>copy</goal>
                        </goals>
                        <configuration>
                            <outputDirectory>${endorsed.dir}</outputDirectory>
                            <silent>true</silent>
                            <artifactItems>
                                <artifactItem>
                                    <groupId>javax</groupId>
                                    <artifactId>javaee-endorsed-api</artifactId>
                                    <version>6.0</version>
                                    <type>jar</type>
                                </artifactItem>
                            </artifactItems>
                        </configuration>
                    </execution>
                </executions>
            </plugin>
        </plugins>
    </build>
    <repositories>
        
          <repository>
            <id>prime-repo</id>
            <name>Prime Technology Maven Repository</name>
            <url>http://repository.primefaces.org/</url>
        </repository>
 
        <!--<repository>
            <id>repository.jboss.org</id>
            <name>JBoss Repository for Maven</name>
            <url>http://repository.jboss.org/maven2</url>
        </repository>-->
        <repository>
            <id>xtecuan.org</id>
            <name>Xtecuan.org repository</name>
            <url>http://xtecuan.org/xtecuannet_framework/repository</url>
        </repository>
        
        <repository>
            <id>jvnet-nexus-snapshots</id>
            <name>jvnet-nexus-snapshots</name>
            <url>https://maven.java.net/content/repositories/snapshots/</url>
        </repository>
    </repositories>
</project>

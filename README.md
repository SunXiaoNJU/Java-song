# Java唱片

### 1、主奏与伴奏中支持仅输入的35个音符：

 “1--” ~ “7--”， “1-” ~ “7-”， “1” ~ “7”， “1+” ~ “7+”， “1++” ~ “7++”
分别代表倍低音、低音、中音、高音、倍高音一共35个音符

### 2、怎么切换自己的歌曲

* 找到你喜欢的歌曲的钢琴谱，一一对应扒铺子下来，包括主奏和间奏

### 3、Java播放歌曲原理

* 通过多线程的方式，开启两个线程，其中一个线程进行主奏的播放，另一个线程进行间奏的播放即可
* 利用第三方依赖调用电脑相关音频即可

```maven
<dependency>
            <groupId>org.jflac</groupId>
            <artifactId>jflac-codec</artifactId>
            <version>1.5.2</version>
        </dependency>
        <dependency>
            <groupId>io.github.ambitiousliu</groupId>
            <artifactId>jmp-extension</artifactId>
            <version>3.1.8</version>
        </dependency>
```

### 4、注意

* **输入字符"0"，则会使音长额外延长一倍**
* **输入这其中35个音符以及“0”以外的任意字符不会对弹奏起任何作用**
* **如需换行填写，则需在上一行的末尾以及下一行的开头都加上空格**

 
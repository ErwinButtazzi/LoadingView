# LoadingView
A LoadingView for Android,It's color,style...... can be customized.
## Description
	This LoadingView is a  circular ProgressBar in Android.It's color,style(include material style,linear style),progress style can be customized.
##Demo
![](https://github.com/dudu90/LoadingView/blob/master/screenshot/screenshot.gif)
##Usage
###Gradle
```groovy
	compile 'com.pitt.loading.library:library:0.8'
```
###Maven
```xml
<dependency>
  <groupId>com.pitt.loading.library</groupId>
  <artifactId>library</artifactId>
  <version>0.8</version>
  <type>pom</type>
</dependency>
```
then add the LoadingView to your layout's xml
```xml
<com.pitt.loadingview.library.LoadingView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        loadingview:color="#ff00"
        loadingview:progress_style="material"
        loadingview:ring_radius="15dp"
        loadingview:ring_style="round"
        loadingview:ring_width="3dp" />
```	
## XML attributes
| Name | Type | Default | Description |
|:----:|:----:|:-------:|:-----------:|
|color|color|0xFF0099CC|The Ring's Color|
|progress_style|enum|material|The Ring's style when execute animation|
|ring_radius|dimension|15dp|The Ring's radius|
|ring_style|enum|square|The ring's style(the paint's Cap)|
|ring_width|dimension|3.5dp|The ring's width|
####email
fengshengq@gmail.com
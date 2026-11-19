# 实验二 Android 界面布局

移动软件开发课程实验，作者：王鑫懿（学号 121052024077）。

用四种布局各做一个界面，练习 LinearLayout、TableLayout、ConstraintLayout 的写法，主界面四个按钮分别进入四个子界面。

## 主要内容

- 线性布局：横向 4 列、纵向 4 行，每格加权分配宽度，显示 One,One 到 Four,Four 的方格
- 表格布局：仿“Hello TableLayout”示例，用 TableRow 做出带标题行和分隔线的菜单
- 约束布局一：计算器界面，数字键与运算符按约束链排布，支持加减乘除与除零提示
- 约束布局二：太空旅行界面，用 Chain 和 Guideline 摆放飞船、星球、宇航员图标和底部导航

## 如何运行

1. 用 Android Studio 打开本目录（不要打开上层文件夹）
2. 首次 Sync 需要联网下载 Gradle 8.7 与依赖；国内网络若拉不动 Google Maven，可保留 `settings.gradle` 里的阿里云镜像
3. 选择模拟器或真机，运行 `app`

环境配置：Android Gradle Plugin 8.5.2 / Gradle 8.7 / compileSdk 34 / minSdk 24 / JDK 17

## 目录

```
app/src/main/java/        源码
app/src/main/res/         布局、字符串、图片等资源
docs/                     实验报告（Word）
```

## 说明

界面用到的图片放在 app/src/main/res/drawable-nodpi，换机器也不会丢。

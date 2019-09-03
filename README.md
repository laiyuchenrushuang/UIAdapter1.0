#  UIAdapter1.0
[![](https://jitpack.io/v/laiyuchenrushuang/UIAdapter1.0.svg)](https://jitpack.io/#laiyuchenrushuang/UIAdapter1.0)
1. 可以使用在基类。
2. 可以每个activity里面动态设置。

![](https://github.com/laiyuchenrushuang/UIAdapter1.0/blob/master/tp.png)

![](https://github.com/laiyuchenrushuang/UIAdapter1.0/blob/master/tp1.png)

# 使用方法

  `UiUtils`是一个工具类  
  
1. 需要在application里面绑定密度  UiUtils.setDensity(this);
2. `UiUtils`里面可以在界面初始化的时候设置activity和方向 setOrientation(Activity activity, String orientation) -> orientation是width,height

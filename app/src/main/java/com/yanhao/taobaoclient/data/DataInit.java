package com.yanhao.taobaoclient.data;

import com.yanhao.taobaoclient.R;
import com.yanhao.taobaoclient.model.Category;
import com.yanhao.taobaoclient.model.Product;


/**
 * 存放初始数据
 * Created by yons on 2015/3/18.
 */
public class DataInit {
    public static final Product[] products={
      new Product(1001,"三星I9100",1, R.drawable.sansung9100,1266.0,"主屏尺寸:4.3英寸,网络类型:WCDMA(3G),操作系统:Android 2.3"),
      new Product(1002,"中兴U880",1, R.drawable.zte880,1322.0,"主屏尺寸:3.5英寸,网络类型:TD-SCDMA,操作系统:Android 2.2"),
      new Product(1003,"魅族Note",1, R.drawable.meizu_note,2200.0,"主屏尺寸:5.5英寸,网络类型:移动TD-LTE(4G),操作系统:Flyme 4.1"),
      new Product(1004,"华为Mate7",1, R.drawable.huawei_mate7,2400.0,"主屏尺寸:6英寸,网络类型:FDD-LTE(4G),操作系统:EMUI 3.0"),
      new Product(1005,"小米M4",1, R.drawable.xiaomi_m4,1999.0,"主屏尺寸:5英寸,网络类型:移动TD-LTE(4G),操作系统:MIUI V5"),
      new Product(1006,"摩托罗拉MotoX",1, R.drawable.motox,2500.0,"主屏尺寸:5.2英寸,网络类型:TD-LTE(4G),操作系统:Android 5.0"),
      new Product(1007,"OPPO_Find7",1, R.drawable.oppo_find7,1360.0,"主屏尺寸:5.5英寸,网络类型:TD-LTE(4G),操作系统:Android 4.3"),
      new Product(1008,"OnePlus Two",1, R.drawable.oneplus_two,1750.0,"主屏尺寸:5.5英寸,网络类型:TD-LTE(4G),操作系统:Color OS"),
      new Product(2001,"MacBook 12英寸",2, R.drawable.macbook,8999.0,"CPU:英特尔 酷睿 M系列,内存:8GB,显卡类型:核芯显卡"),
      new Product(2002,"联想Y50-70AM-ISE",2, R.drawable.lenovo_y50,8400.0,"CPU:英特尔 酷睿 i7,内存:8GB,显卡类型:GTX 860M"),
      new Product(2003,"华硕U305",2, R.drawable.auus_u305,6300.0,"CPU:英特尔 酷睿 i5,内存:8GB,显卡类型:核芯显卡")
    };
    public static final Category[] categories={
      new Category(1,"手机"),
      new Category(2,"电脑")
    };
}

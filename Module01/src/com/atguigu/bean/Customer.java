package com.atguigu.bean;

import java.util.ArrayList;
import java.util.Date;

public class Customer {
    /**
     * 执行(run) 	 	alt+r
     * 提示补全 (Class Name Completion)  	 	 	alt+/
     * 单行注释 	 	 	 	 	 	 	ctrl + /
     * 多行注释 	ctrl + shift + /
     * 向下复制一行 (Duplicate Lines)  	 	 	ctrl+alt+down
     * 删除一行或选中行 (delete line)  	 	 	ctrl+d
     * 向下移动行(move statement down)  	 	 	alt+down
     * 向上移动行(move statement up)  	 	 	 	alt+up
     * 向下开始新的一行(start new line) 	 	 	 	shift+enter
     * 向上开始新的一行 (Start New Line before current)      	ctrl+shift+enter
     * 如何查看源码 (class) 	 	 	 	 	ctrl + 选中指定的结构 或
     * ctrl + shift + t
     * 万能解错/生成返回值变量  	 	 	 	alt + enter
     * 退回到前一个编辑的页面 (back) 	 	 	 	alt + left
     * 进入到下一个编辑的页面(针对于上条) (forward)    	alt + right
     * 查看继承关系(type hierarchy) 	 	 	 	F4
     *
     * @param args
     */
    public static void main(String[] args) {

        System.out.println("helloworld!123");


        System.out.println("helloworld!123");


        //注释数据库能尽快把曾经
        Date date = new Date();

        ArrayList list = new ArrayList();
        System.out.println();

    }

    /**
     * @param args 16 	格式化代码(reformat code)  	 	 	 	ctrl+shift+F
     *             17 	提示方法参数类型(Parameter Info)  	 	 	ctrl+alt+/
     *             18 	复制代码 	 	 	 	 	 	 	ctrl + c
     *             19 	撤销 	 	 	 	 	 	 	 	ctrl + z
     *             20 	反撤销  	 	 	 	 	 	ctrl + y
     *             21 	剪切 	 	 	 	 	 	 	  	ctrl + x
     *             22 	粘贴 	 	 	 	 	 	 	 	ctrl + v
     *             23 	保存 	 	 	 	 	 	 	 	ctrl + s
     *             24 	全选 	 	 	 	 	 	 	 	ctrl + a
     *             25 	选中数行，整体往后移动 	 	 	 	 	tab
     *             26 	选中数行，整体往前移动 	 	 	 	 	shift + tab
     *             27 	查看类的结构：类似于 eclipse 的 outline 	 	 	ctrl+o
     *             28 	重构：修改变量名与方法名(rename) 	 	 	 	alt+shift+r
     *             29 	大写转小写/小写转大写(toggle case) 	 	 	ctrl+shift+y
     */
    public static void add(String[] args) {
        System.out.println("helloworld!");
        ArrayList arrayList = new ArrayList();
        arrayList.add(1,123);
    }
}

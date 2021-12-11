package com.jason.providerdemo;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    private List<String> groupList = new ArrayList<>();
    private ArrayList<ArrayList<String>> itemSet = new ArrayList<>();
    ListDemo() {
        groupList.add("我的家人");
        groupList.add("我的朋友");
        groupList.add("黑名单");

        ArrayList<String> itemList1 = new ArrayList<>();
        itemList1.add("姐姐");
        itemList1.add("大哥哥");
        itemList1.add("二哥哥");
        itemList1.add("老婆");
        itemList1.add("闺女");
        itemList1.add("爸爸");
        itemList1.add("妈妈");

        ArrayList<String> itemList2 = new ArrayList<>();
        itemList2.add("李涛");
        itemList2.add("罗娟");

        ArrayList<String> itemList3 = new ArrayList<>();
        itemList3.add("张三");
        itemList3.add("李四");

        itemSet.add(itemList1);
        itemSet.add(itemList2);
        itemSet.add(itemList3);
    }

    public static void main(String[] args) {
        System.out.println("hello ");
    }
}

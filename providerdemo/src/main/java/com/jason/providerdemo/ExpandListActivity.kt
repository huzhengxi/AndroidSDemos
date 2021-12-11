package com.jason.providerdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_expand_list.*
import java.util.ArrayList

class ExpandListActivity : AppCompatActivity() {
    private var groupList: ArrayList<String> = ArrayList()
    private var itemSet = ArrayList<ArrayList<String>>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_expand_list)

        initData()
        val adapter = MyAdapter(this, groupList, itemSet)
        expandable_list.setAdapter(adapter)
    }

    private fun initData() {
        groupList.add("我的家人")
        groupList.add("我的朋友")
        groupList.add("黑名单")


        val itemList1 = ArrayList<String>()
        itemList1.add("姐姐")
        itemList1.add("大哥哥")
        itemList1.add("二哥哥")
        itemList1.add("老婆")
        itemList1.add("闺女")
        itemList1.add("爸爸")
        itemList1.add("妈妈")

        val itemList2 = ArrayList<String>()
        itemList2.add("李涛")
        itemList2.add("罗娟")

        val itemList3 = ArrayList<String>()
        itemList3.add("张三")
        itemList3.add("李四")

        itemSet.add(itemList1)
        itemSet.add(itemList2)
        itemSet.add(itemList3)
    }
}
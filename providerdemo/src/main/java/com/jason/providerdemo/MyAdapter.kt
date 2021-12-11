package com.jason.providerdemo

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseExpandableListAdapter
import android.widget.TextView

class MyAdapter(
    var context: Context,
    var groupList: ArrayList<String>,
    var itemList: ArrayList<ArrayList<String>>
) : BaseExpandableListAdapter() {
    override fun getGroupCount(): Int {
        return this.groupList.size
    }

    override fun getChildrenCount(groupPosition: Int): Int {
        return itemList[groupPosition].size
    }

    override fun getGroup(groupPosition: Int): Any {
        return groupList[groupPosition]
    }

    override fun getChild(groupPosition: Int, childPosition: Int): Any {
        return itemList[groupPosition][childPosition]
    }

    override fun getGroupId(groupPosition: Int): Long {
        return groupPosition.toLong()
    }

    override fun getChildId(groupPosition: Int, childPosition: Int): Long {
        return childPosition.toLong()
    }

    override fun hasStableIds(): Boolean {
        return false
    }

    override fun getGroupView(
        groupPosition: Int,
        isExpanded: Boolean,
        convertView: View?,
        parent: ViewGroup?
    ): View {
        var view = convertView;
        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.item_layout, parent, false)
        }

        val groupTv: TextView? = view?.findViewById(R.id.group_tv)
        groupTv?.text = groupList[groupPosition]

        return view!!
    }

    override fun getChildView(
        groupPosition: Int,
        childPosition: Int,
        isLastChild: Boolean,
        convertView: View?,
        parent: ViewGroup?
    ): View {
        var view = convertView
        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.sub_item_laytout, parent, false)
        }
        val childTxt: TextView? = view?.findViewById(R.id.name_tv)
        childTxt?.text = itemList[groupPosition][childPosition]
        return view!!
    }

    override fun isChildSelectable(groupPosition: Int, childPosition: Int): Boolean {
        return true
    }
}
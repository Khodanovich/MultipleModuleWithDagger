package com.example.core_ui.presentation.field_adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView

open class FieldAdapter<T : Any> : RecyclerView.Adapter<FieldViewHolder<T>>() {


    private var dataList: MutableList<T> = arrayListOf()

    val layouter = Layouter()

    fun setData(list: List<T>) {
        this.dataList = list.toMutableList()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FieldViewHolder<T> {

        return layouter.getHolder(parent, viewType)
    }

    override fun getItemCount(): Int {

        return dataList.size
    }

    override fun onBindViewHolder(holder: FieldViewHolder<T>, position: Int) {

        holder.bind(dataList[position])
    }

    override fun getItemViewType(position: Int): Int {

        return layouter.getViewType(dataList[position])
    }

}

class Layouter {

    val holders = mutableListOf<LayoutModel<*, *>>()

    fun <T> add(
        type: Class<T>,
        layout: Int,
        holderCreator: (viewDataBinding: ViewDataBinding) -> FieldViewHolder<T>
    ) {

        holders.add(
            LayoutModel(
                type,
                layout,
                holderCreator
            )
        )
    }

    fun getViewType(any: Any): Int {

        for (index in holders.indices) {
            if (any.javaClass == holders[index].type) return index
        }
        return -1
    }

    fun <Type> getHolder(parent: ViewGroup, type: Int): FieldViewHolder<Type> {

        val inflater = LayoutInflater.from(parent.context)

        val viewDataBinding =
            DataBindingUtil.inflate<ViewDataBinding>(inflater, holders[type].layout, parent, false)

        return holders[type].holderCreator(viewDataBinding) as FieldViewHolder<Type>
    }

}

class LayoutModel<Type, ViewHolder>(
    val type: Class<Type>,
    @LayoutRes val layout: Int,
    val holderCreator: (viewDataBinding: ViewDataBinding) -> FieldViewHolder<ViewHolder>
)

open class FieldViewHolder<T>(
    private val viewDataBinding: ViewDataBinding,
    private val variableId: Int
) : RecyclerView.ViewHolder(viewDataBinding.root) {

    fun bind(data: T) {
        viewDataBinding.setVariable(variableId, data)
        viewDataBinding.executePendingBindings()
    }
}

package com.example.core_ui.presentation.binding

import android.widget.ImageView
import androidx.databinding.BindingAdapter

/**
 * @author a.khodanovich
 */
@BindingAdapter("android:src")
fun ImageView.setImageResource(resource: Int) {
    this.setImageResource(resource)
}

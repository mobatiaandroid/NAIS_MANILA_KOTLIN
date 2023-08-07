package com.mobatia.naismanila.custom_view

import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import com.mobatia.naismanila.R

class CustomFontDJ5TextWhite  : androidx.appcompat.widget.AppCompatTextView{
    constructor(context: Context, attrs: AttributeSet, defStyle: Int) : super(context, attrs, defStyle) {
        // ...
        val type= Typeface.createFromAsset(context.assets,"fonts/DJ5CTRIAL.otf")
        this.typeface = type
        this.setTextColor(resources.getColor(R.color.white))
    }

    constructor(context: Context, attrs: AttributeSet) : this(context, attrs, 0) {
        val type =
            Typeface.createFromAsset(context.assets, "fonts/DJ5CTRIAL.otf")
        this.typeface = type
        this.setTextColor(context.resources.getColor(R.color.white))
    }
}
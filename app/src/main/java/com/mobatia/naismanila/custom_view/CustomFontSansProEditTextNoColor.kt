package com.mobatia.naismanila.custom_view

import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet

class CustomFontSansProEditTextNoColor : androidx.appcompat.widget.AppCompatEditText {
    constructor(context: Context) : super(context) {
        val type = Typeface.createFromAsset(context.assets, "fonts/SourceSansPro-Regular.otf")
        this.typeface = type
        //        this.setTextColor(context.getResources().getColor(R.color.white));
    }

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {
        val type = Typeface.createFromAsset(context.assets, "fonts/SourceSansPro-Regular.otf")
        this.typeface = type
        //       this.setTextColor(context.getResources().getColor(R.color.white));
    }

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    ) {
        val type = Typeface.createFromAsset(context.assets, "fonts/SourceSansPro-Regular.otf")
        this.typeface = type
        //        this.setTextColor(context.getResources().getColor(R.color.white));
    }
}
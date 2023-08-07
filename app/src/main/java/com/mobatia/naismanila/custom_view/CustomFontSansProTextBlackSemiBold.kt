package com.mobatia.naismanila.custom_view

import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet

class CustomFontSansProTextBlackSemiBold : androidx.appcompat.widget.AppCompatTextView {
    constructor(context: Context) : super(context) {
        val type = Typeface.createFromAsset(context.assets, "fonts/SourceSansPro-Semibold.otf")
        this.typeface = type
        //this.setTextColor(context.getResources().getColor(R.color.black));
    }

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {
        val type = Typeface.createFromAsset(context.assets, "fonts/SourceSansPro-Semibold.otf")
        this.typeface = type
        //this.setTextColor(context.getResources().getColor(R.color.black));
    }

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    ) {
        val type = Typeface.createFromAsset(context.assets, "fonts/SourceSansPro-Semibold.otf")
        this.typeface = type
        // this.setTextColor(context.getResources().getColor(R.color.black));
    }
}
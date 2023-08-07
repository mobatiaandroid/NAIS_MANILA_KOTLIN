package com.mobatia.naismanila.constant

import android.content.Context

class PreferenceManager {
    companion object {

        private val PREFSNAME = "NAIS_MANILA"


        fun setAccessToken(context: Context, id: String?) {
            val prefs = context.getSharedPreferences(
                PREFSNAME, Context.MODE_PRIVATE
            )
            val editor = prefs.edit()
            editor.putString("access_token", id)
            editor.apply()
        }

        fun getAccessToken(context: Context): String? {
            val prefs = context.getSharedPreferences(
                PREFSNAME,
                Context.MODE_PRIVATE
            )
            return prefs.getString("access_token", "")
        }

        fun setIsFirstTime(context: Context, id: String?) {
            val prefs = context.getSharedPreferences(
                PREFSNAME, Context.MODE_PRIVATE
            )
            val editor = prefs.edit()
            editor.putString("first", id)
            editor.apply()
        }

        fun getIsFirstTime(context: Context): String? {
            val prefs = context.getSharedPreferences(
                PREFSNAME,
                Context.MODE_PRIVATE
            )
            return prefs.getString("first", "")
        }
    }
}
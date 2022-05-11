package com.malshanidahanayaka.android.robolectrictestingassignment

import org.junit.runner.RunWith
import android.view.View
import android.widget.TextView
import junit.framework.Assert.assertNotNull
import junit.framework.Assert.assertTrue
import org.junit.Before
import org.junit.Test
import org.robolectric.Robolectric
import org.robolectric.RobolectricTestRunner



@RunWith(RobolectricTestRunner::class)
class RobolectricActivityTest {

    private var activity: MainActivity? = null

    @Before
    @Throws(Exception::class)
    fun setUp() {
        activity = Robolectric.buildActivity(MainActivity::class.java)
            .create()
            .resume()
            .get()
    }

    @Test
    fun validateTextViewContent() {
        val tvActivity = activity!!.findViewById<View>(R.id.ActivityText) as TextView
        assertNotNull("TextView could not be found", tvActivity)
        assertTrue(
            "TextView value not matching",
            "Fragment_Text_Value" == tvActivity.text.toString()
        )
    }
}
package com.example.robolectricissue7455

import androidx.core.content.res.ResourcesCompat
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class FontUnitTest {
    @Test
    fun fonts() {
        val context = InstrumentationRegistry.getInstrumentation().targetContext
        val fontRes = R.font.test_font_family
        ResourcesCompat.getFont(context, fontRes)
    }
}
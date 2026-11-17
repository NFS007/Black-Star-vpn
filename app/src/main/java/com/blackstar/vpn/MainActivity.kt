package com.blackstar.vpn

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.VERTICAL
        layout.gravity = Gravity.CENTER
        layout.setBackgroundColor(Color.rgb(10, 10, 10))
        layout.setPadding(30, 30, 30, 30)

        val logo = TextView(this)
        logo.text = "★"
        logo.textSize = 75f
        logo.setTextColor(Color.rgb(255, 190, 40))

        val title = TextView(this)
        title.text = "BLACK STAR"
        title.textSize = 32f
        title.setTextColor(Color.WHITE)
        title.gravity = Gravity.CENTER

        val subtitle = TextView(this)
        subtitle.text = "PREMIUM VPN"
        subtitle.textSize = 16f
        subtitle.setTextColor(Color.GRAY)

        val button = TextView(this)
        button.text = "CONNECT"
        button.textSize = 22f
        button.gravity = Gravity.CENTER
        button.setTextColor(Color.BLACK)
        button.setBackgroundColor(Color.rgb(255, 190, 40))
        button.setPadding(65, 25, 65, 25)

        layout.addView(logo)
        layout.addView(title)
        layout.addView(subtitle)

        val space = TextView(this)
        space.text = "\n\n"
        layout.addView(space)

        layout.addView(button)

        setContentView(layout)
    }
}

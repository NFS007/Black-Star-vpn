
package com.blackstar.vpn

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast

class MainActivity : Activity() {

    private var selectedPlan = "FREE"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.VERTICAL
        layout.gravity = Gravity.CENTER
        layout.setPadding(30, 30, 30, 30)
        layout.setBackgroundColor(Color.rgb(10, 10, 10))

        val star = TextView(this)
        star.text = "★"
        star.textSize = 75f
        star.gravity = Gravity.CENTER
        star.setTextColor(Color.rgb(255, 190, 40))

        val title = TextView(this)
        title.text = "BLACK STAR"
        title.textSize = 32f
        title.gravity = Gravity.CENTER
        title.setTextColor(Color.WHITE)

        val subtitle = TextView(this)
        subtitle.text = "PREMIUM VPN"
        subtitle.textSize = 16f
        subtitle.gravity = Gravity.CENTER
        subtitle.setTextColor(Color.GRAY)

        layout.addView(star)
        layout.addView(title)
        layout.addView(subtitle)

        addSpace(layout)

        addPlan(layout, "FREE", "Bepul")
        addPlan(layout, "PREMIUM", "$1.99 / month")
        addPlan(layout, "PREMIUM PRO", "$2.99 / month")

        addSpace(layout)

        val connect = TextView(this)
        connect.text = "CONNECT"
        connect.textSize = 22f
        connect.gravity = Gravity.CENTER
        connect.setTextColor(Color.BLACK)
        connect.setBackgroundColor(Color.rgb(255, 190, 40))
        connect.setPadding(65, 25, 65, 25)

        connect.setOnClickListener {
            Toast.makeText(
                this,
                "$selectedPlan tarifi tanlandi. VPN server hali ulanmagan.",
                Toast.LENGTH_LONG
            ).show()
        }

        layout.addView(connect)
        setContentView(layout)
    }

    private fun addPlan(
        layout: LinearLayout,
        name: String,
        price: String
    ) {
        val plan = TextView(this)
        plan.text = "$name\n$price"
        plan.textSize = 18f
        plan.gravity = Gravity.CENTER
        plan.setTextColor(Color.WHITE)
        plan.setBackgroundColor(Color.rgb(35, 35, 35))
        plan.setPadding(30, 20, 30, 20)

        val params = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT,
            LinearLayout.LayoutParams.WRAP_CONTENT
        )
        params.setMargins(0, 8, 0, 8)

        plan.setOnClickListener {
            selectedPlan = name
            Toast.makeText(
                this,
                "$name tanlandi",
                Toast.LENGTH_SHORT
            ).show()
        }

        layout.addView(plan, params)
    }

    private fun addSpace(layout: LinearLayout) {
        val space = TextView(this)
        space.text = "\n"
        layout.addView(space)
    }
}

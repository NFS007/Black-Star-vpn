
package com.blackstar.vpn

data class SubscriptionPlan(
    val name: String,
    val price: Int,
    val duration: String,
    val traffic: String,
    val adsEnabled: Boolean
)

object SubscriptionManager {

    val plans = listOf(
        SubscriptionPlan(
            name = "FREE",
            price = 0,
            duration = "1 month",
            traffic = "500 MB daily",
            adsEnabled = true
        ),
        SubscriptionPlan(
            name = "PREMIUM",
            price = 29000,
            duration = "1 month",
            traffic = "High traffic",
            adsEnabled = false
        ),
        SubscriptionPlan(
            name = "PREMIUM PRO",
            price = 49000,
            duration = "1 month",
            traffic = "Maximum traffic",
            adsEnabled = false
        )
    )
}

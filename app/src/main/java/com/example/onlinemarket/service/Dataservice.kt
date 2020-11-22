package com.example.onlinemarket.service

import com.example.onlinemarket.model.category
import com.example.onlinemarket.model.product

object Dataservice {
    val categories= listOf(
        category("SHIRTS", "shirtimage"),
        category("HOODIES", "hoodieimage"),
        category("HATS", "hatimage"),
        category("DIGITAL", "digitalgoodsimage"),
        category("SHIRTS", "shirtimage"),
        category("HOODIES", "hoodieimage"),
        category("HATS", "hatimage"),
        category("DIGITAL", "digitalgoodsimage")



    )
    val shirt= listOf(
        product("balckshirt","shirt1","$18"),
        product("whitekshirt","shirt2","$19"),
        product("brownshirt","shirt3","$20"),
        product("mateblackshirt","shirt4","$18"),
        product("fkblackshirt","shirt5","$20")
    )
    val hat= listOf(
        product("broundbackh","hat1","$10"),
        product("blackhat","hat2","$12"),
        product("whitehat","hat3","$15"),
        product("bluewhitehat","hat4","$11")

        )
    val hoodie= linkedSetOf(
        product("blackhoodie","hoodie1","$25"),
        product("pinkhoodie","hoodie2","$26"),
        product("grayhoodie","hoodie3","$27"),
        product("fullblackhoodie","hoodie4","$30")

    )
}

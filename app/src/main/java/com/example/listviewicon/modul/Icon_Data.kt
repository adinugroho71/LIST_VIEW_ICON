package com.example.listviewicon.modul

import com.example.listviewicon.R


object Icon_Data {
        private val iconName = arrayOf(
            "Ruby",
            "Rails",
            "Python",
            "Java Script",
            "PHP"
        )
    private val detail = arrayOf(
        "Ruby is an open-source and fully object-oriented programming language.",
        "Rails on Ralls is a server-side web application development framework written in Rubby.",
        "Python is interpreted scripting and object-oriented programming",
        "JavaScript is an object-based scripting language.",
        "PHP is an interpreted language."
    )
    private val iconPoster = intArrayOf(
        R.drawable.icon1,
        R.drawable.icon2,
        R.drawable.icon3,
        R.drawable.icon4,
        R.drawable.icon5
    )
    val listicon: ArrayList<Icon>
        get() {
            val list = arrayListOf<Icon>()
            for (position in iconName.indices) {
                val icon = Icon()
                icon.name = iconName[position]
                icon.detail = detail[position]
                icon.poster = iconPoster[position]
                list.add(icon)
            }
            return list
        }
}
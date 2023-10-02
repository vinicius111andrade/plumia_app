package com.vdemelo.plumia.sdk

import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

fun AppCompatActivity.setupToolbar(title: String = "", toolbar: Toolbar) {
    setSupportActionBar(toolbar)
}

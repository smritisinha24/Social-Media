package com.example.socialmediaapp.models

import android.icu.number.NumberFormatter.DecimalSeparatorDisplay

data class Users(val uid:String = "",
                val displayName: String? = "",
                val imageUrl: String = "")
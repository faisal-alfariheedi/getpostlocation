package com.example.getpostlocation

import com.google.gson.annotations.SerializedName

class celep {

    var data:ArrayList<dat>?=null

    class dat {
        @SerializedName("pk")
        var pk: Int? = null

        @SerializedName("name")
        var name: String? = null

        @SerializedName("location")
        var location: String? = null

        constructor(name: String?, location: String?) {
            this.name = name
            this.location = location
        }
    }

}
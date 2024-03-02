package com.keremkarza.bilfitprojectfinal;

import android.graphics.drawable.Drawable;
import android.media.Image;

public class exercise {
    public String name,description;
    public int set,rep,category;
    public int image;
    exercise(String name, String description, int set, int rep, int image,int category)
    {
        this.name = name;
        this.description = description;
        this.set = set;
        this.rep =rep;
        this.image = image;
        this.category = category;
    }

    public int getRep() {
        return rep;
    }

    public int getSet() {
        return set;
    }
}

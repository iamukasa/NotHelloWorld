package com.iamukasa.nothelloworld;

import android.net.Uri;

public class Items {
    int sImage;
    int sSound;

    public Items(int sImage, int sSound) {
        this.sImage = sImage;
        this.sSound = sSound;
    }

    public int getsImage() {
        return sImage;
    }

    public void setsImage(int sImage) {
        this.sImage = sImage;
    }

    public int getsSound() {
        return sSound;
    }

    public void setsSound(int sSound) {
        this.sSound = sSound;
    }
}

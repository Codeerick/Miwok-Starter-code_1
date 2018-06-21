package com.example.android.miwok;

import android.media.Image;

public class word {
// default tranlation for the word
    private String mDefaultTranslation;

// Miwok translation for the word
    private String mMiwokTranslation;

    // Image resouce
    private int mImageResourceId= NO_IMAGE_PROVIDED;

private static final int NO_IMAGE_PROVIDED = -1;
    /**
     *
     * @param defaultTranslation
     * @param miwokTranslation
     */

    public word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    /**
     *@param defaultTranslation
     * @param miwokTranslation
     * @param imageResourceId
     */

    public word(String defaultTranslation, String miwokTranslation, int imageResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
       mImageResourceId  = imageResourceId;
    }
// get the default translation of the word
    public String getDefaultTranslation() {
     return mDefaultTranslation;
    }

    // get the Miwok translation
    public String getmMiwokTranslation () {
        return mMiwokTranslation;
}

    // get iamge resouce
    public int getImageResourceId(){
        return mImageResourceId;
    }

    /**
     * Returns wether no it has no image or it does.
     * @return
     */
    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;

    }
}



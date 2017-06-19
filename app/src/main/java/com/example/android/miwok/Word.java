package com.example.android.miwok;

/**
 * Created by Shreyans on 19-06-2017.
 * Custom Object to feed into ArrayAdapter
 */

public class Word {

    private String mDefaultTranslation;

    private String mMivokTranslation;

    /*
    @param defaultTranslation is the word that the user is already familiar with.
    @param mivokTranslation is the word in Mivok language.
     */
    public Word(String defaultTranslation, String mivokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMivokTranslation = mivokTranslation;
    }

    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getmMivokTranslation() {
        return mMivokTranslation;
    }
}
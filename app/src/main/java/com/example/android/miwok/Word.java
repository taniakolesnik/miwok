package com.example.android.miwok;

import android.media.MediaPlayer;

/**
 * Created by tetianakolesnik on 24/12/2017.
 */

public class Word {

    /**
     * Default translation for the word
     */
    private String mDefaultTranslation;

    /**
     * Miwok translation for the word
     */
    private String mMiwokTranslation;

    /**
     * Image for the word
     */
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Audio file for word
     */

    private int mAudioResourceId;

    /**
     * @param defaultTranslation default translation of word
     * @param miwokTranslation   Miwork version of word
     * @param audioResourceId Audio file to play for each word
     */


    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
    }

    /**
     * @param defaultTranslation default translation of word
     * @param miwokTranslation   Miwork version of word
     * @param imageResourceId    drawable image id associated with word
     * @param audioResourceId Audio file to play for each word
     */

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }


    /**
     * Gets the string value in the TextView.
     *
     * @return current text in the TextView.
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Gets the string value in the TextView.
     *
     * @return current text in the TextView.
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    /**
     * Gets the string value
     *
     * @return current image resource id .
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     *
     * @return if image provided for this object
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    /**
     * Gets the string value
     *
     * @return current audio resource id .
     */
    public int getAudioResourceId() {
        return mAudioResourceId;
    }

    /**
     * Returns the string representation of the {@link Word} object.
     */

    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                ", mAudioResourceId=" + mAudioResourceId +
                '}';
    }
}

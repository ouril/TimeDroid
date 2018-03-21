package com.example.ouril.timedroid;

/**
 * Created by ouril on 20.03.18.
 */

public class Question {
    private int mTestResId;
    private boolean mAnsverTrue;

    public Question(int textResId, boolean answerTrue) {
        mTestResId = textResId;
        mAnsverTrue = answerTrue;
    }

    public int getTestResId() {
        return mTestResId;
    }

    public void setTestResId(int testResId) {
        mTestResId = testResId;
    }

    public boolean isAnswerTrue() {
        return  mAnsverTrue;
    }
}

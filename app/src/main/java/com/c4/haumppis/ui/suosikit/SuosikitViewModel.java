package com.c4.haumppis.ui.suosikit;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SuosikitViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public SuosikitViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("not ready fam =(");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
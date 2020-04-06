package com.c4.haumppis.ui.reseptit;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ReseptitViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ReseptitViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Reseptit fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
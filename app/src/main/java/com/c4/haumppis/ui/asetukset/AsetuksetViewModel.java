package com.c4.haumppis.ui.asetukset;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AsetuksetViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public AsetuksetViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("not ready fam =(");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
package com.c4.haumppis.ui.kauppalista;

        import androidx.lifecycle.LiveData;
        import androidx.lifecycle.MutableLiveData;
        import androidx.lifecycle.ViewModel;

public class KauppalistaViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public KauppalistaViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Kauppalista fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
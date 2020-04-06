package com.c4.haumppis.ui.kauppalista;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.c4.haumppis.R;

public class KauppalistaFragment extends Fragment {

    private KauppalistaViewModel kauppalistaViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        kauppalistaViewModel =
                ViewModelProviders.of(this).get(KauppalistaViewModel.class);
        View root = inflater.inflate(R.layout.fragment_kauppalista, container, false);
        final TextView textView = root.findViewById(R.id.text_kauppalista);
        kauppalistaViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}

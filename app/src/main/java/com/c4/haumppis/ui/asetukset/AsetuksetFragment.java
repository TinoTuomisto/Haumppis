package com.c4.haumppis.ui.asetukset;

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

public class AsetuksetFragment extends Fragment {

    private AsetuksetViewModel asetuksetViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        asetuksetViewModel =
                ViewModelProviders.of(this).get(AsetuksetViewModel.class);
        View root = inflater.inflate(R.layout.fragment_asetukset, container, false);
        final TextView textView = root.findViewById(R.id.text_notifications3);
        asetuksetViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}

package com.c4.haumppis.ui.reseptit;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

import com.c4.haumppis.R;
import com.c4.haumppis.content.Broileripekonipasta;
import com.c4.haumppis.content.Kaurapuuro;
import com.c4.haumppis.content.Kaurasuklaasmoothie;
import com.c4.haumppis.content.Myslimustikkamuffinsit;
import com.c4.haumppis.content.Template;
import com.c4.haumppis.content.Tomaattikeitto;

public class ReseptitFragment extends Fragment {

    private ReseptitViewModel reseptitViewModel;

     @Override
     public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

         View view = inflater.inflate(R.layout.fragment_reseptit, container, false);

         Button button26 = (Button) view.findViewById(R.id.button26);
         button26.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent in = new Intent(getActivity(), Kaurapuuro.class);
                 startActivity(in);
             }
         });

         Button button1 = (Button) view.findViewById(R.id.button1);
         button1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent in = new Intent(getActivity(), Kaurasuklaasmoothie.class);
                 startActivity(in);
             }
         });

         Button button3 = (Button) view.findViewById(R.id.button3);
         button3.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent in = new Intent(getActivity(), Myslimustikkamuffinsit.class);
                 startActivity(in);
             }
         });

         Button button8 = (Button) view.findViewById(R.id.button8);
         button8.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent in = new Intent(getActivity(), Tomaattikeitto.class);
                 startActivity(in);
             }
         });

         Button button9 = (Button) view.findViewById(R.id.button9);
         button9.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent in = new Intent(getActivity(), Broileripekonipasta.class);
                 startActivity(in);
             }
         });

         Button buttonTemplate = (Button) view.findViewById(R.id.buttonTemplate);
         buttonTemplate.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent in = new Intent(getActivity(), Template.class);
                 startActivity(in);
             }
         });


         return view;

    }


}

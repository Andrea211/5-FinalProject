package com.example.jokesandroidlib;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class JokesAndroidLibActivityFragment extends Fragment {

    public JokesAndroidLibActivityFragment(){
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        // inflate the layout
        View view = inflater.inflate(R.layout.fragment_jokes_activity, container, false);
        Intent intent = getActivity().getIntent();

        //String joke = intent.getStringExtra("jokes");
        //TextView textView = view.findViewsWithText(R.id.jokes_text_view);
        //textView.setText(joke);

        String gce_result = getActivity().getIntent().getStringExtra("gce_result");
        TextView gce_result_show = (TextView) view.findViewById(R.id.jokes_text_view);
        gce_result_show.setText(gce_result);

        return  view;
    }
}

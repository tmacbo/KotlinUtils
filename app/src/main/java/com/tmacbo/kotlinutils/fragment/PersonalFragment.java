package com.tmacbo.kotlinutils.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.tmacbo.kotlinutils.R;

/**
 * @Author tmacbo
 * @Since on 2017/6/26  22:46
 * @mail tang_bo@hotmail.com
 * @Description TODO
 */

public class PersonalFragment extends Fragment {
    private TextView textView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);
        textView = (TextView) rootView.findViewById(R.id.section_label);
        textView.setText("PersonalFragment");
        return rootView;
    }

}

package com.tmacbo.kotlinutils.fragment;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.transition.Explode;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.tmacbo.kotlinutils.R;
import com.tmacbo.kotlinutils.activity.LoginActivity;

/**
 * @Author tmacbo
 * @Since on 2017/6/26  21:30
 * @mail tang_bo@hotmail.com
 * @Description TODO
 */

public class HomeFragment extends Fragment implements View.OnClickListener {
    private TextView textView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);
        textView = (TextView) rootView.findViewById(R.id.section_label);
        textView.setText("HomeFragment");
        return rootView;
    }


    public void onSomeButtonClicked(View view) {
        getActivity().getWindow().setExitTransition(new Explode());
        Intent intent = new Intent(getContext(), LoginActivity.class);
        startActivity(intent,
                ActivityOptions
                        .makeSceneTransitionAnimation(getActivity()).toBundle());
    }

    @Override
    public void onClick(View view) {

//        if (view == mTextMessage) {
//            onSomeButtonClicked(view);
//        }
    }

//    /**
//     * A placeholder fragment containing a simple view.
//     */
//    public static class PlaceholderFragment extends Fragment {
//        /**
//         * The fragment argument representing the section number for this
//         * fragment.
//         */
//
//
//        public PlaceholderFragment() {
//        }
//
//        /**
//         * Returns a new instance of this fragment for the given section
//         * number.
//         */
//        public static PlaceholderFragment newInstance(int sectionNumber) {
//            PlaceholderFragment fragment = new PlaceholderFragment();
//            Bundle args = new Bundle();
//            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
//            fragment.setArguments(args);
//            return fragment;
//        }
//
//        @Override
//        public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                                 Bundle savedInstanceState) {
//
//        }
//    }
}

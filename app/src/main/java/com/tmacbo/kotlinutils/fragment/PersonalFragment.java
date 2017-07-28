package com.tmacbo.kotlinutils.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.tmacbo.kotlinutils.R;

import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import rx.Observable;
import rx.Observer;

import static android.content.ContentValues.TAG;

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


    private void observaleCreate() {
//        Observable<Integer> observable = Observable.create(new ObservableOnSubscribe<Integer>() {
//            @Override
//            public void subscribe(ObservableEmitter<Integer> emitter) throws Exception {
//                Log.d(TAG, "Observable thread is : " + Thread.currentThread().getName());
//                Log.d(TAG, "emit 1");
//                emitter.onNext(1);
//            }
//        });
//
//        Consumer<Integer> consumer = new Consumer<Integer>() {
//            @Override
//            public void accept(Integer integer) throws Exception {
//                Log.d(TAG, "Observer thread is :" + Thread.currentThread().getName());
//                Log.d(TAG, "onNext: " + integer);
//            }
//        };
//
//        observable.subscribe(consumer);
    }
}

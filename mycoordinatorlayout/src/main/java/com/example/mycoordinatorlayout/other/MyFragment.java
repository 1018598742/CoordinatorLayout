package com.example.mycoordinatorlayout.other;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mycoordinatorlayout.R;

/**
 * Created by Administrator on 2016/12/14.
 */
public class MyFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_my,container,false);
        RecyclerView mListView = (RecyclerView) view.findViewById(R.id.rv_list);
        LinearLayoutManager llm = new LinearLayoutManager(getContext());
        mListView.setLayoutManager(llm);
        mListView.setAdapter(new MyRecyclerViewAdatper());
        return view;
    }

}

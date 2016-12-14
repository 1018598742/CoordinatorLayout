package com.example.mycoordinatorlayout.other;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Administrator on 2016/12/14.
 */
public class MyRecyclerViewAdatper extends RecyclerView.Adapter {
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
       View view =  View.inflate(parent.getContext(),android.R.layout.simple_expandable_list_item_1,null);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        MyViewHolder myViewHolder = (MyViewHolder) holder;
        myViewHolder.mTextView.setText("第"+position+"个内容");
    }

    @Override
    public int getItemCount() {
        return 100;
    }
    class MyViewHolder extends RecyclerView.ViewHolder{
        private TextView mTextView;
        public MyViewHolder(View itemView) {
            super(itemView);
            mTextView = (TextView) itemView;
        }
    }
}

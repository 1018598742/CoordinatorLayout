package com.example.mycoordinatorlayout.activity;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.mycoordinatorlayout.R;
import com.example.mycoordinatorlayout.util.SnackbarUtil;

import static android.support.design.widget.Snackbar.make;

/**
 * 自定义behavior实现的悬浮按钮旋转
 */

public class MyBehaviorLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_behavior_layout);
        ((FloatingActionButton) findViewById(R.id.myfab)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                make(v,"我的悬浮按钮",Snackbar.LENGTH_LONG).setAction("我的按钮", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //进行修改snackbar的操作
                        Snackbar snackbar = Snackbar.make(v,"新的悬浮按钮", Snackbar.LENGTH_LONG);
                        //修改snackbar的背景颜色，文字颜色
                        setSnackbarColor(snackbar, Color.YELLOW,Color.BLUE);
                        //添加snackbar的图片
                        SnackbarUtil.SnackbarAddView(snackbar,R.layout.snackbar_addview,0);
                        snackbar.show();
                    }
                }).show();

            }
        });


    }
    public void setSnackbarColor(Snackbar snackbar,int messageColor,int backgroundColor){
        View view = snackbar.getView();
        if (view != null){
            view.setBackgroundColor(backgroundColor);
            ((TextView) view.findViewById(R.id.snackbar_text)).setTextColor(messageColor);
        }
    }
}

package com.example.mycoordinatorlayout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.mycoordinatorlayout.activity.MyBehaviorLayout;
import com.example.mycoordinatorlayout.activity.MyFloatingActionButton;
import com.example.mycoordinatorlayout.activity.MyTabLayout;
import com.example.mycoordinatorlayout.activity.MyTabLayout2;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fab = ((Button) findViewById(R.id.button_fab));
        fab.setOnClickListener(this);
        ((Button) findViewById(R.id.button_tab)).setOnClickListener(this);
        ((Button) findViewById(R.id.button_collapsing)).setOnClickListener(this);
        ((Button) findViewById(R.id.button_mybehavior)).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button_fab:
                jumpActivity(MyFloatingActionButton.class);
                break;
            case R.id.button_tab:
                jumpActivity(MyTabLayout.class);
                break;
            case R.id.button_collapsing:
                jumpActivity(MyTabLayout2.class);
                break;
            case R.id.button_mybehavior:
                jumpActivity(MyBehaviorLayout.class);
                break;
        }
    }

    private void jumpActivity(Class cls) {
        Intent intent = new Intent(MainActivity.this,cls);
        startActivity(intent);
    }
}

package com.example.android.portfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Toast mAppToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showProject(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch " + ((Button)view).getText().toString();
        int duration = Toast.LENGTH_SHORT;

        if(mAppToast !=null){
            mAppToast.cancel();
        }

        // Make and display new toast
        mAppToast = Toast.makeText(context, text, duration);
        mAppToast.show();
    }
}

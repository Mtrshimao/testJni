package com.testjni;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.testjni.jni.JniUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        JniUtils jniUtils = new JniUtils();
        TextView text = findViewById(R.id.test1);
        text.setText(jniUtils.getMessage()+"===="+jniUtils.getWorld());
    }
}

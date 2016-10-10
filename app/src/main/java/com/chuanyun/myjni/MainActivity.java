package com.chuanyun.myjni;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView mTextView;
    private int a = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextView = (TextView) this.findViewById(R.id.test);

        NdkJniUtils jni = new NdkJniUtils();

        mTextView.setText(jni.getCLanguageString());

    }
}

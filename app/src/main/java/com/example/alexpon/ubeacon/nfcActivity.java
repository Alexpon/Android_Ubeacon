package com.example.alexpon.ubeacon;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by alexpon on 2015/5/24.
 */
public class nfcActivity extends ActionBarActivity {

    private Button declear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nfc);
        initView();
        setListener();
    }

    public void initView(){
        declear = (Button) findViewById(R.id.decB);
    }

    public void setListener(){
        declear.setOnClickListener(nfcListener);
    }

    private Button.OnClickListener nfcListener = new Button.OnClickListener(){
        @Override
        public void onClick(View v){
            switch (v.getId()) {
                case R.id.decB:
                    finish();
                    break;
            }
        }
    };

}

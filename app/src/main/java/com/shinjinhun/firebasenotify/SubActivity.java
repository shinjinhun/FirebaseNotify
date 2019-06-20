package com.shinjinhun.firebasenotify;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class SubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.e("jhTest","onResume 호출 됨");
        Toast.makeText(this, "onResume 호출 됨",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("jhTest","onPause 호출 됨");
        Toast.makeText(this, "onPause 호출 됨",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("jhTest","onStop 호출 됨");
        Toast.makeText(this, "onStop 호출 됨",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("jhTest","onDestroy 호출 됨");
        Toast.makeText(this, "onDestroy 호출 됨",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("jhTest","onStart 호출 됨");
        Toast.makeText(this, "onStart 호출 됨",Toast.LENGTH_LONG).show();
    }
}

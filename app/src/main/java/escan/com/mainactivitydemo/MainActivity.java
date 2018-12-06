package escan.com.mainactivitydemo;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import mvcView.RootViewMvcImpl;


public class MainActivity extends Activity {


    private final String TAG =  "ActivityDemo";
    RootViewMvcImpl mViewMvc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        //fetch data
        // init view
        mViewMvc = new RootViewMvcImpl(this,null);
        setContentView(mViewMvc.getRootView());
        Log.v(TAG,"onCreate()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v(TAG,"onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v(TAG,"onResume()");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v(TAG,"onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v(TAG,"onStop()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.v(TAG,"onRestart()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v(TAG,"onDestroy()");
    }
}

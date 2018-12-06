package mvcView;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import escan.com.mainactivitydemo.R;

public class RootViewMvcImpl implements  ViewMvc {

    private View mRootView;
    private EditText inUserName,inNumber;
    private Button btnSave,btnGet;

    public RootViewMvcImpl(Context context,ViewGroup container){
        mRootView = LayoutInflater.from(context).inflate(R.layout.activity_main,container);
        initViews();
    }

    private void initViews(){
        btnGet = (Button)mRootView.findViewById(R.id.btnGet);
        btnSave = (Button)mRootView.findViewById(R.id.btnSave);
        inUserName = (EditText)mRootView.findViewById(R.id.inUsername);
        inNumber = (EditText)mRootView.findViewById(R.id.inNumber);
    }


    @Override
    public View getRootView() {
        return  mRootView;
    }

    @Override
    public Bundle getViewState() {
        return null;
    }
}

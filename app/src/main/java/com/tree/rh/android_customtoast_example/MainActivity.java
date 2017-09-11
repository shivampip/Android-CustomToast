package com.tree.rh.android_customtoast_example;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.tree.rh.ctlib.CT;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }//onCreateEND


    public void showToast(View v){
        Button b= (Button) v;
        switch (b.getText().toString()){
            case "Success":
                CT.success(this, "Success");
                break;
            case "Success2":
                CT.success2(this, "Success");
                break;
            case "Failed":
                CT.failed(this, "Failed");
                break;
            case "Failed2":
                CT.failed2(this, "Failed");
                break;
            case "Loading":
                CT.loading(this, "Loading...");
                break;
            case "Loading2":
                CT.loading2(this, "Loading...");
                break;
            case "Mute":
                CT.mute(this, "Silent mode");
                break;
            case "Mute2":
                CT.mute2(this, "Silent mode");
                break;
            case "Custom":
                new CT.Builder(this, "Custom toast")
                        .image(R.drawable.apple)
                        .borderWidth(25)
                        .backCol(Color.BLACK)
                        .textCol(Color.CYAN)
                        .borderCol(Color.BLACK)
                        .radius(20,20,20,20)
                        .show();
                break;
            case "Custom2":
                new CT.Builder(this, "Custom toast")
                        .image(R.drawable.apple)
                        .borderWidth(10)
                        .backCol(Color.WHITE)
                        .textCol(Color.BLACK)
                        .borderCol(Color.BLACK)
                        .radius(80,0,0,80)
                        .show();
                break;
            case "Normal2":
                new CT.Builder(this, "Normal toast")
                        .borderWidth(0)
                        .backCol(Color.BLACK)
                        .textCol(Color.WHITE)
                        .radius(80,0,0,80)
                        .show();
                break;
            default:
                CT.normal(this, "Normal Toast");
        }
    }//showToastEND

}//classEND

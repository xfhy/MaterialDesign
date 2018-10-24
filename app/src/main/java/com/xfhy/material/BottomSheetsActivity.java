package com.xfhy.material;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.bottomsheet.BottomSheetBehavior;

import androidx.appcompat.app.AppCompatActivity;

public class BottomSheetsActivity extends AppCompatActivity {

    private BottomSheetBehavior mBehavior;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_sheets);
        mBehavior = BottomSheetBehavior.from(findViewById(R.id.layout));
    }

    public void fab(View view) {

        if (mBehavior.getState() == BottomSheetBehavior.STATE_EXPANDED) {
            //折叠
            mBehavior.setState(BottomSheetBehavior.STATE_COLLAPSED);
        } else {
            mBehavior.setState(BottomSheetBehavior.STATE_EXPANDED);
        }
    }

}

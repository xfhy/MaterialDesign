package com.xfhy.material;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

/*
 * https://blog.csdn.net/zhang___yong/article/details/66979073
 * */
public class BottomSheetDialogFragmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_sheet_dialog_fragment);

        findViewById(R.id.btn_test).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CustomBottomSheetDialogFragment customBottomSheetDialogFragment = CustomBottomSheetDialogFragment.newInstance();
                customBottomSheetDialogFragment.show(getSupportFragmentManager(), "bottom_dialog");
            }
        });
    }
}

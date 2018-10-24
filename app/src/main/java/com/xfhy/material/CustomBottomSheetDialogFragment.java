package com.xfhy.material;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

/**
 * Created by feiyang on 2018/10/22 17:26
 * Description :
 */
public class CustomBottomSheetDialogFragment extends BottomSheetDialogFragment {

    public static CustomBottomSheetDialogFragment newInstance() {

        Bundle args = new Bundle();

        CustomBottomSheetDialogFragment fragment = new CustomBottomSheetDialogFragment();
        fragment.setArguments(args);
        return fragment;
    }

    private BottomSheetBehavior mBehavior;

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        BottomSheetDialog dialog = (BottomSheetDialog) super.onCreateDialog(savedInstanceState);
        View view = View.inflate(getContext(), R.layout.fragment_custom_bottom_sheet_dialog, null);
        dialog.setContentView(view);

        //设置背景透明   这样才好实现圆角
        ((View) view.getParent()).setBackgroundColor(getResources().getColor(android.R.color.transparent));

        /*
         设置高度
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int height = (int) (getContext().getResources().getDisplayMetrics().heightPixels * 0.9); layoutParams.height = height;
        view.setLayoutParams(layoutParams);*/
        mBehavior = BottomSheetBehavior.from((View) view.getParent());
        return dialog;
    }

    @Override
    public void onStart() {
        super.onStart();
        //默认全屏展开
        //mBehavior.setState(BottomSheetBehavior.STATE_EXPANDED);
    }

    public void doclick(View v) {
        //点击任意布局关闭
        //mBehavior.setState(BottomSheetBehavior.STATE_HIDDEN);
    }

}

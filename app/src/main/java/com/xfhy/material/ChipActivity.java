package com.xfhy.material;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

/**
 * 2018年10月23日08:39:12
 * 先简单展示几个demo
 *
 * - style="@style/Widget.MaterialComponents.Chip.Entry"：
 * 注意： Chip通常与独立的ChipDrawable一起使用。
 *
 * ![](https://mmbiz.qpic.cn/mmbiz_gif/jE32KtUXy6FZfDV7CO21g6UcwKhzCLfBTiagOI4w1kSKHGsIbiaia2AEukZw8LV1eyk9ohrbBaWI2rEbicqedLg3sw/640
 * ?wx_fmt=gif&tp=webp&wxfrom=5&wx_lazy=1)
 *
 * - style="@style/Widget.MaterialComponents.Chip.Filter"：
 * 注意：Filter Chip通常放置在一个ChipGroup。
 *
 * ![](https://mmbiz.qpic.cn/mmbiz_gif/jE32KtUXy6FZfDV7CO21g6UcwKhzCLfB5CU4YCCc5TtJBBRBnlo6mVzpHupcoDbib83jYl3Xwk3G22AUEZKJMyg/640?wx_fmt
 * =gif&tp=webp&wxfrom=5&wx_lazy=1)
 *
 * - style="@style/Widget.MaterialComponents.Chip.Choice"：
 * 注意：Filter Chip通常放置在一个ChipGroup。
 *
 * ![](https://mmbiz.qpic.cn/mmbiz_gif/jE32KtUXy6FZfDV7CO21g6UcwKhzCLfBetRzJnYLNhVOBNzh47cxKuKicDuonAYWbGgtELWicqC4vH8nNeDlCqbw/640
 * ?wx_fmt=gif&tp=webp&wxfrom=5&wx_lazy=1)
 *
 * - style="@style/Widget.MaterialComponents.Chip.Action"：
 *
 * ![](https://mmbiz.qpic.cn/mmbiz_gif/jE32KtUXy6FZfDV7CO21g6UcwKhzCLfBjeyJpia2ibs8tzZAHicYrO854aJmEuBytsRp8CaUxzCvynEBtJNCtfibVw/640
 * ?wx_fmt=gif&tp=webp&wxfrom=5&wx_lazy=1)
 */
public class ChipActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chip);
    }
}

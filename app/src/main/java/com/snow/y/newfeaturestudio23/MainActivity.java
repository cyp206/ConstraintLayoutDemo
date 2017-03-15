package com.snow.y.newfeaturestudio23;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    /**
     *ConstraintLayout 约束布局
     * 特点：能够根据容器或则控件与控件之间的百分比来摆放控件，减少来布局嵌套过多的问题，也能够减少一些屏幕适配的问题
     * 相关属性：
     * 1，给控件添加约束条件，一般直接拖。
     * 2，添加约束线 GuideLine 来辅助布局约束
     * 3，ide 自动添加约束，看情况适用。 autoconnect，inference
     *
     * 相关URL ：http://blog.csdn.net/guolin_blog/article/details/53122387
     *
     */

}

/*
 * Copyright (C) 2016 hejunlin <hejunlin2013@gmail.com>
 * 
 * Github:https://github.com/hejunlin2013/LivePlayback
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.hejunlin.liveplayback;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.hejunlin.liveplayback.widget.MetroViewBorderImpl;

/**
 * Created by hejunlin on 2016/10/28.
 * blog: http://blog.csdn.net/hejjunlin
 */
public class MainActivity extends Activity {

    private MetroViewBorderImpl mMetroViewBorderImpl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mMetroViewBorderImpl = new MetroViewBorderImpl(this);
        mMetroViewBorderImpl.setBackgroundResource(R.drawable.border_color);
        loadRecyclerViewMenuItem();
    }

    private void loadRecyclerViewMenuItem() {
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.ry_menu_item);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        createOptionItemData(recyclerView);
    }

    private void createOptionItemData(RecyclerView recyclerView) {
        OptionItemAdapter adapter = new OptionItemAdapter(this);
        recyclerView.setAdapter(adapter);
    }
}

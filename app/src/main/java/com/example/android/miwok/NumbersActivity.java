/*
 * Copyright (C) 2016 The Android Open Source Project
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
package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        //ListView numbersList = (ListView) findViewById(R.id.numbersList);
        ArrayList<String> numbersEnglish = new ArrayList<>();
        numbersEnglish.add(0, "One");
        numbersEnglish.add(1, "Two");
        numbersEnglish.add(2, "Three");
        numbersEnglish.add(3, "Four");
        numbersEnglish.add(4, "Five");
        numbersEnglish.add(5, "Six");
        numbersEnglish.add(6, "Seven");
        numbersEnglish.add(7, "Eight");
        numbersEnglish.add(8, "Nine");
        numbersEnglish.add(9, "Ten");

        LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);
        for (int index = 0; index < numbersEnglish.size(); index++) {
            TextView wordView = new TextView(this);
            wordView.setText(numbersEnglish.get(index));
            rootView.addView(wordView);
        }
    }

    }


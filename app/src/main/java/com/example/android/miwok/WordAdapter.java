package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Shreyans on 19-06-2017.
 * Since ArrayAdapter can not parse more than two ArrayList, a custom adapter is created.
 */

public class WordAdapter extends ArrayAdapter<Word> {
    public WordAdapter(Activity context, ArrayList<Word> numbersEnglish) {
        super(context, 0, numbersEnglish);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false
            );
        }
        Word currentWord = getItem(position);

        TextView numberEnglish = (TextView) listItemView.findViewById(R.id.numbersEnglish);
        numberEnglish.setText(currentWord.getmDefaultTranslation());

        TextView numberMivok = (TextView) listItemView.findViewById(R.id.numbersMiwok);
        numberMivok.setText(currentWord.getmMivokTranslation());
        return listItemView;
    }
}

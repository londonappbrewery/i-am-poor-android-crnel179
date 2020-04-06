package com.londonappbrewery.iampoor;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.tv);
        TextView textView2 = findViewById(R.id.tv2);

        String text = "I am Rich NOT poor!";
        String text2 = "NEVER poor!";

        SpannableStringBuilder ssb = new SpannableStringBuilder(text); //a Spanned to be able to modify the spans (add or remove formatting)
        SpannableStringBuilder ssb2 = new SpannableStringBuilder(text2);

        ForegroundColorSpan fcsWhite = new ForegroundColorSpan(Color.WHITE); //set the colour for the text
        ForegroundColorSpan fcsGray = new ForegroundColorSpan(Color.GRAY);

        ssb.setSpan(fcsWhite, 5, 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE); //set the colour for the text starting and ending in the specified characters (number of the chars in the specified string)
        ssb.setSpan(fcsGray, 14, 18, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ssb2.setSpan(fcsGray, 6, 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        textView.setText(ssb);
        textView2.setText(ssb2);
    }
}

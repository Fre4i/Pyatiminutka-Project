package com.example.pyatiminutka.ui.book;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;

import com.example.pyatiminutka.Models.Func.LoadTheme;
import com.example.pyatiminutka.Models.Func.StatusBarColor;
import com.example.pyatiminutka.R;

public class Activity_book_term extends AppCompatActivity {

//    private Button enlarge;
//    private Button reduce;
    private TextView term_Text;
    private TextView page_text_counter;


    private static final String TAG = "myLogs";

    private int page_counter = 1;

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Проверка установленной темы
        LoadTheme.LoadTheme(this);

        StatusBarColor.StatusBarColor(R.color.colorPrimary, R.color.colorPrimaryNight,this);

        //actionBar.hide();
        setContentView(R.layout.activity_book_term);

        //Кнопка назад
        setSupportActionBar(toolbar = findViewById(R.id.toolbar));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        term_Text = findViewById(R.id.text_term);

        //Запись данных
        SharedPreferences myPreferences
                = PreferenceManager.getDefaultSharedPreferences(Activity_book_term.this);
        float text_size = myPreferences.getFloat("text_size", 0);

        //Установка раннее выбранного шрифта
        if (myPreferences.contains("text_size")) {
            term_Text.setTextSize(TypedValue.COMPLEX_UNIT_PX, text_size);
        }

        //Получение данных из предыдущего activity
        Intent intent = getIntent();
        String numbook = intent.getStringExtra("numbook");
        int numbook1 = Integer.parseInt(numbook);
        if (numbook1 == 0) {
            term_Text.setText("1 страница ТЕРМОДИНАМИКА КуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУ123123");
        }
        if (numbook1 == 1) {
            term_Text.setText("1 страница МЕХАНИКА КуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУ123123");
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_book, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        //Запись данных
        SharedPreferences myPreferences
                = PreferenceManager.getDefaultSharedPreferences(Activity_book_term.this);
        SharedPreferences.Editor myEditor = myPreferences.edit();

        if (id == R.id.textEnlarge) {
            float mOriginalTextSize = term_Text.getTextSize();
            if (mOriginalTextSize < 64) {
                mOriginalTextSize = mOriginalTextSize + 10f;
                term_Text.setTextSize(TypedValue.COMPLEX_UNIT_PX, mOriginalTextSize);
                myEditor.putFloat("text_size", mOriginalTextSize);
                myEditor.commit();
            }
            else {
                Toast toast = Toast.makeText(Activity_book_term.this, R.string.text_max_size, Toast.LENGTH_SHORT);
                toast.show();
                term_Text.setTextSize(TypedValue.COMPLEX_UNIT_PX, mOriginalTextSize);
            }
        } else if (id == R.id.textReduce) {
            float mOriginalTextSize = term_Text.getTextSize();

            //Log.d(TAG, "Перед проверкой уменьшения " + mOriginalTextSize);
            if (mOriginalTextSize > 42) {
                mOriginalTextSize = mOriginalTextSize - 10f;
                term_Text.setTextSize(TypedValue.COMPLEX_UNIT_PX, mOriginalTextSize);
                myEditor.putFloat("text_size", mOriginalTextSize);
                myEditor.commit();
            }
            else {
                Toast toast = Toast.makeText(Activity_book_term.this, R.string.text_min_size, Toast.LENGTH_SHORT);
                toast.show();
                term_Text.setTextSize(TypedValue.COMPLEX_UNIT_PX, mOriginalTextSize);
            }


        } else if (id == android.R.id.home){
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }


    //Кнопка, которая листает страницы назад
    public void clickpreviouspage(View view) {
        term_Text = findViewById(R.id.text_term);
        page_text_counter = findViewById(R.id.page_text_counter);
        Intent intent = getIntent();
        String numbook = intent.getStringExtra("numbook");
        int numbook1 = Integer.parseInt(numbook);
        if (numbook1 == 0) {

            if (page_counter == 2) {
                page_counter = 1;
                page_text_counter.setText(getString(R.string.text_page) + " " + page_counter + " " + getString(R.string.text_from) + " " + 6);
                term_Text.setText("1 страница ТЕРМОДИНАМИКА КуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУ123123");
            } else if (page_counter == 3) {
                page_counter = 2;
                page_text_counter.setText(getString(R.string.text_page) + " " + page_counter + " " + getString(R.string.text_from) + " " + 6);
                term_Text.setText("2 страница ТЕРМОДИНАМИКА КуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУ123123");
            } else if (page_counter == 4) {
                page_counter = 3;
                page_text_counter.setText(getString(R.string.text_page) + " " + page_counter + " " + getString(R.string.text_from) + " " + 6);
                term_Text.setText("3 страница ТЕРМОДИНАМИКА КуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУ123123");
            } else if (page_counter == 5) {
                page_counter = 4;
                page_text_counter.setText(getString(R.string.text_page) + " " + page_counter + " " + getString(R.string.text_from) + " " + 6);
                term_Text.setText("4 страница ТЕРМОДИНАМИКА КуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУ123123");
            } else if (page_counter == 6) {
                page_counter = 5;
                page_text_counter.setText(getString(R.string.text_page) + " " + page_counter + " " + getString(R.string.text_from) + " " + 6);
                term_Text.setText("5 страница ТЕРМОДИНАМИКА КуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУ123123");
            }
        } if (numbook1 == 1) {

            if (page_counter == 2) {
                page_counter = 1;
                page_text_counter.setText(getString(R.string.text_page) + " " + page_counter + " " + getString(R.string.text_from) + " " + 6);
                term_Text.setText("1 страница МЕХАНИКА КуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУ123123");
            } else if (page_counter == 3) {
                page_counter = 2;
                page_text_counter.setText(getString(R.string.text_page) + " " + page_counter + " " + getString(R.string.text_from) + " " + 6);
                term_Text.setText("2 страница МЕХАНИКА КуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУ123123");
            } else if (page_counter == 4) {
                page_counter = 3;
                page_text_counter.setText(getString(R.string.text_page) + " " + page_counter + " " + getString(R.string.text_from) + " " + 6);
                term_Text.setText("3 страница МЕХАНИКА КуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУ123123");
            } else if (page_counter == 5) {
                page_counter = 4;
                page_text_counter.setText(getString(R.string.text_page) + " " + page_counter + " " + getString(R.string.text_from) + " " + 6);
                term_Text.setText("4 страница МЕХАНИКА КуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУ123123");
            } else if (page_counter == 6) {
                page_counter = 5;
                page_text_counter.setText(getString(R.string.text_page) + " " + page_counter + " " + getString(R.string.text_from) + " " + 6);
                term_Text.setText("5 страница МЕХАНИКА КуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУ123123");
            }
        }
    }


    //Кнопка, которая листает страницы вперёд
    public void clicknextpage(View view) {
        term_Text = findViewById(R.id.text_term);
        page_text_counter = findViewById(R.id.page_text_counter);
        Intent intent = getIntent();
        String numbook = intent.getStringExtra("numbook");
        int numbook1 = Integer.parseInt(numbook);
        if (numbook1 == 0) {


            if (page_counter == 1) {
                page_counter = 2;
                page_text_counter.setText(getString(R.string.text_page) + " " + page_counter + " " + getString(R.string.text_from) + " " + 6);
                term_Text.setText("2 страница ТЕРМОДИНАМИКА КуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУ123123");
            } else if (page_counter == 2) {
                page_counter = 3;
                page_text_counter.setText(getString(R.string.text_page) + " " + page_counter + " " + getString(R.string.text_from) + " " + 6);
                term_Text.setText("3 страница ТЕРМОДИНАМИКА КуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУ123123");
            } else if (page_counter == 3) {
                page_counter = 4;
                page_text_counter.setText(getString(R.string.text_page) + " " + page_counter + " " + getString(R.string.text_from) + " " + 6);
                term_Text.setText("4 страница ТЕРМОДИНАМИКА КуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУ123123");
            } else if (page_counter == 4) {
                page_counter = 5;
                page_text_counter.setText(getString(R.string.text_page) + " " + page_counter + " " + getString(R.string.text_from) + " " + 6);
                term_Text.setText("5 страница ТЕРМОДИНАМИКА КуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУ123123");
            } else if (page_counter == 5) {
                page_counter = 6;
                page_text_counter.setText(getString(R.string.text_page) + " " + page_counter + " " + getString(R.string.text_from) + " " + 6);
                term_Text.setText("6 страница ТЕРМОДИНАМИКА КуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУ123123");
            }
        } if (numbook1 == 1) {
            if (page_counter == 1) {
                page_counter = 2;
                page_text_counter.setText(getString(R.string.text_page) + " " + page_counter + " " + getString(R.string.text_from) + " " + 6);
                term_Text.setText("2 страница МЕХАНИКА КуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУ123123");
            } else if (page_counter == 2) {
                page_counter = 3;
                page_text_counter.setText(getString(R.string.text_page) + " " + page_counter + " " + getString(R.string.text_from) + " " + 6);
                term_Text.setText("3 страница МЕХАНИКА КуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУ123123");
            } else if (page_counter == 3) {
                page_counter = 4;
                page_text_counter.setText(getString(R.string.text_page) + " " + page_counter + " " + getString(R.string.text_from) + " " + 6);
                term_Text.setText("4 страница МЕХАНИКА КуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУ123123");
            } else if (page_counter == 4) {
                page_counter = 5;
                page_text_counter.setText(getString(R.string.text_page) + " " + page_counter + " " + getString(R.string.text_from) + " " + 6);
                term_Text.setText("5 страница МЕХАНИКА КуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУ123123");
            } else if (page_counter == 5) {
                page_counter = 6;
                page_text_counter.setText(getString(R.string.text_page) + " " + page_counter + " " + getString(R.string.text_from) + " " + 6);
                term_Text.setText("6 страница МЕХАНИКА КуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУКуКуКУ123123");
            }
        }
    }
}
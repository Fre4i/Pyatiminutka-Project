package com.example.pyatiminutka.ui.questions;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.example.pyatiminutka.R;
import com.example.pyatiminutka.Models.constants.AppConstants;
import com.example.pyatiminutka.Models.DataBase.QuestionTest;

public class Question10Fragment extends Fragment {

    private TextView question10text;
    private CheckBox answer_one;
    private CheckBox answer_two;
    private CheckBox answer_three;
    private CheckBox answer_four;

    private int textquestion;
    private int answer_one_text;
    private int answer_two_text;
    private int answer_three_text;
    private int answer_four_text;
    private int correctAnswer1;
    private int correctAnswer2;
    private int correctAnswer3;
    private int correctAnswer4;

    private Button fix_question;
    private Button change_question;

    private int score_new_form = 0;

    private String currentView1;
    private int currentView;

    private AlphaAnimation anim1;
    private AlphaAnimation anim2;

    private ViewPager viewPager;

    private final int test_num = AppConstants.map_test_number.get("test_num");
    private final int difficult = AppConstants.map_difficult.get("Difficult");

    private QuestionTest questionTest = new QuestionTest();


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_question10_layout, container, false);

        findByIdFragment(root);

        change_question.setAlpha(0.6f);
        anim1 = new AlphaAnimation(0.6f, 1.0f);
        anim1.setDuration(150);
        anim1.setFillAfter(true);
        anim2 = new AlphaAnimation(1f, 0.6f);
        anim2.setDuration(150);
        anim2.setFillAfter(true);

        Bundle args = getArguments();
        currentView = args.getInt(AppConstants.ARG_SECTION_NUMBER) - 1;
        currentView1 = Integer.toString(currentView);

        Log.d("myLogs", "Возвращаемая позиция TabLayout " + currentView);

        //Возвращение данных вопроса по номеру текущего таба (currentView)
        if (difficult == 1) {
            textquestion = questionTest.QuestionTest[test_num][0][currentView]; //Текст вопроса
            question10text.setText(textquestion);

            answer_one_text = questionTest.choiceans[test_num][0][currentView][0]; //текст первого варианта ответа
            answer_one.setText(answer_one_text);
            answer_two_text = questionTest.choiceans[test_num][0][currentView][1]; //текст второго варианта ответа
            answer_two.setText(answer_two_text);
            answer_three_text = questionTest.choiceans[test_num][0][currentView][2]; //текст третьего варианта ответа
            answer_three.setText(answer_three_text);
            answer_four_text = questionTest.choiceans[test_num][0][currentView][3]; //текст четвёртого варианта ответа
            answer_four.setText(answer_four_text);

            correctAnswer1 = questionTest.correctAnswer[test_num][0][currentView][0];
            correctAnswer2 = questionTest.correctAnswer[test_num][0][currentView][1];
            correctAnswer3 = questionTest.correctAnswer[test_num][0][currentView][2];
            correctAnswer4 = questionTest.correctAnswer[test_num][0][currentView][3];

            Log.d("myLogs", "Правильные ответы " + correctAnswer1 + correctAnswer2 + correctAnswer3 + correctAnswer4);
        } else if (difficult == 2) {
            textquestion = questionTest.QuestionTest[test_num][1][currentView]; //Текст вопроса
            question10text.setText(textquestion);

            answer_one_text = questionTest.choiceans[test_num][1][currentView][0]; //текст первого варианта ответа
            answer_one.setText(answer_one_text);
            answer_two_text = questionTest.choiceans[test_num][1][currentView][1]; //текст второго варианта ответа
            answer_two.setText(answer_two_text);
            answer_three_text = questionTest.choiceans[test_num][1][currentView][2]; //текст третьего варианта ответа
            answer_three.setText(answer_three_text);
            answer_four_text = questionTest.choiceans[test_num][1][currentView][3]; //текст четвёртого варианта ответа
            answer_four.setText(answer_four_text);

            correctAnswer1 = questionTest.correctAnswer[test_num][1][currentView][0];
            correctAnswer2 = questionTest.correctAnswer[test_num][1][currentView][1];
            correctAnswer3 = questionTest.correctAnswer[test_num][1][currentView][2];
            correctAnswer4 = questionTest.correctAnswer[test_num][1][currentView][3];
        } else if (difficult == 3) {
            textquestion = questionTest.QuestionTest[test_num][2][currentView]; //Текст вопроса
            question10text.setText(textquestion);

            answer_one_text = questionTest.choiceans[test_num][2][currentView][0]; //текст первого варианта ответа
            answer_one.setText(answer_one_text);
            answer_two_text = questionTest.choiceans[test_num][2][currentView][1]; //текст второго варианта ответа
            answer_two.setText(answer_two_text);
            answer_three_text = questionTest.choiceans[test_num][2][currentView][2]; //текст третьего варианта ответа
            answer_three.setText(answer_three_text);
            answer_four_text = questionTest.choiceans[test_num][2][currentView][3]; //текст четвёртого варианта ответа
            answer_four.setText(answer_four_text);

            correctAnswer1 = questionTest.correctAnswer[test_num][2][currentView][0];
            correctAnswer2 = questionTest.correctAnswer[test_num][2][currentView][1];
            correctAnswer3 = questionTest.correctAnswer[test_num][2][currentView][2];
            correctAnswer4 = questionTest.correctAnswer[test_num][2][currentView][3];
        }

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.fixq10:
                        if (answer_one.isChecked() || answer_two.isChecked() || answer_three.isChecked() || answer_four.isChecked()) {
                            if (correctAnswer1 == 1 && answer_one.isChecked()) {
                                score_new_form += 1;
                            } else if (answer_one.isChecked()) score_new_form += 4;

                            if (correctAnswer2 == 1 && answer_two.isChecked()) {
                                score_new_form += 1;
                            } else if (correctAnswer2 == 0 && answer_two.isChecked()) {
                                score_new_form += 4;
                                Log.d("myLogs", "Счётчик увеличился");
                            }


                            if (correctAnswer3 == 1 && answer_three.isChecked()) {
                                score_new_form += 1;
                            } else if (answer_three.isChecked()) score_new_form += 4;


                            if (correctAnswer4 == 1 && answer_four.isChecked()) {
                                score_new_form += 1;
                            } else if (answer_four.isChecked()) score_new_form += 4;


                            int val = currentView + 1;
                            if (score_new_form == correctAnswer1 + correctAnswer2 + correctAnswer3 + correctAnswer4) {
                                QuestionTest.skip_answers[currentView] = 0;
                                QuestionTest.results[currentView] = 1;
                            } else {
                                QuestionTest.skip_answers[currentView] = 0;
                                QuestionTest.incorrect_results[currentView] = 1;
                                QuestionTest.results[currentView] = 3;
                            }

                            AnimQuestionFadeIn();

                            viewPager.setCurrentItem(currentView + 1);

                        } else if (!answer_one.isChecked() && !answer_two.isChecked() &&
                                !answer_three.isChecked() && !answer_four.isChecked()) {
                            AlertDialog.Builder a_builder = new AlertDialog.Builder(getContext());
                            a_builder.setMessage("Вы не выбрали ниодного варианта ответа")
                                    .setCancelable(true)
                                    .setPositiveButton("Да", new DialogInterface.OnClickListener() {
                                        @Override
                                        public void onClick(DialogInterface dialog, int which) {
                                            AnimQuestionFadeIn();

                                            viewPager.setCurrentItem(currentView + 1); //Метка при коприровании
                                            QuestionTest.skip_answers[currentView] = 1;
                                            QuestionTest.results[currentView] = 0;
                                            QuestionTest.incorrect_results[currentView] = 0;

                                        }
                                    })
                                    .setNegativeButton("Нет", new DialogInterface.OnClickListener() {
                                        @Override
                                        public void onClick(DialogInterface dialog, int which) {
                                            QuestionTest.skip_answers[currentView] = 1;
                                            QuestionTest.results[currentView] = 0;
                                            QuestionTest.incorrect_results[currentView] = 0;
                                            dialog.cancel();
                                        }
                                    });
                            AlertDialog alert = a_builder.create();
                            alert.setTitle("Пропустить вопрос?");
                            alert.show();
                        }

                        if (answer_one.isChecked())
                            QuestionTest.choosed_answers1[currentView] = 1; //Метка при коприровании
                        if (answer_two.isChecked())
                            QuestionTest.choosed_answers2[currentView] = 1; //Метка при коприровании
                        if (answer_three.isChecked())
                            QuestionTest.choosed_answers3[currentView] = 1; //Метка при коприровании
                        if (answer_four.isChecked())
                            QuestionTest.choosed_answers4[currentView] = 1; //Метка при коприровании
                        break;


                    case R.id.changeq10:
                        score_new_form = 0;

                        if (answer_one.isChecked())
                            QuestionTest.choosed_answers1[currentView] = 0; //Метка при коприровании
                        if (answer_two.isChecked())
                            QuestionTest.choosed_answers2[currentView] = 0; //Метка при коприровании
                        if (answer_three.isChecked())
                            QuestionTest.choosed_answers3[currentView] = 0; //Метка при коприровании
                        if (answer_four.isChecked())
                            QuestionTest.choosed_answers4[currentView] = 0; //Метка при коприровании
                        QuestionTest.skip_answers[currentView] = 1;
                        QuestionTest.results[currentView] = 0;
                        QuestionTest.incorrect_results[currentView] = 0;

                        AnimQuestionFadeFrom();


                        break;
                }
            }
        };

        fix_question.setOnClickListener(onClickListener);
        change_question.setOnClickListener(onClickListener);

        return root;
    }

    private void findByIdFragment(View v) {
        question10text = v.findViewById(R.id.question10text);

        answer_one = v.findViewById(R.id.answer_one_q10);
        answer_two = v.findViewById(R.id.answer_two_q10);
        answer_three = v.findViewById(R.id.answer_three_q10);
        answer_four = v.findViewById(R.id.answer_four_q10);

        fix_question = v.findViewById(R.id.fixq10);
        change_question = v.findViewById(R.id.changeq10);

        viewPager = getActivity().findViewById(R.id.view_pager);
    }

    private void AnimQuestionFadeIn() {
        answer_one.setEnabled(false);
        answer_two.setEnabled(false);
        answer_three.setEnabled(false);
        answer_four.setEnabled(false);

        fix_question.startAnimation(anim2);
        fix_question.setAlpha(.6f);

        fix_question.setEnabled(false);

        change_question.startAnimation(anim1);
        change_question.setAlpha(1.0f);

        change_question.setEnabled(true);

        answer_one.startAnimation(anim2);
        answer_two.startAnimation(anim2);
        answer_three.startAnimation(anim2);
        answer_four.startAnimation(anim2);
        answer_one.setAlpha(.6f);
        answer_two.setAlpha(.6f);
        answer_three.setAlpha(.6f);
        answer_four.setAlpha(.6f);
    }

    private void AnimQuestionFadeFrom() {
        answer_one.setEnabled(true);
        answer_two.setEnabled(true);
        answer_three.setEnabled(true);
        answer_four.setEnabled(true);

        fix_question.startAnimation(anim1);
        fix_question.setAlpha(1.0f);

        fix_question.setEnabled(true);

        change_question.startAnimation(anim2);
        change_question.setAlpha(.6f);

        change_question.setEnabled(false);

        answer_one.startAnimation(anim1);
        answer_two.startAnimation(anim1);
        answer_three.startAnimation(anim1);
        answer_four.startAnimation(anim1);
        answer_one.setAlpha(1.0f);
        answer_two.setAlpha(1.0f);
        answer_three.setAlpha(1.0f);
        answer_four.setAlpha(1.0f);
    }
}

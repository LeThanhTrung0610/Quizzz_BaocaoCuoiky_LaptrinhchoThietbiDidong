package com.example.quizzz;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.fragment.NavHostFragment;

import com.example.quizzz.databinding.FragmentFirstBinding;

import java.util.ArrayList;
import java.util.Collections;

public class FirstFragment extends Fragment {

    private FragmentFirstBinding binding;
    private int score = 0;
    private int question_no = 0;

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // receive data
        Bundle firstBundle = getArguments();
        int topicID = firstBundle.getInt("topic", -1);
        int diffID = firstBundle.getInt("diff", -1);

        // random question
        ArrayList<Integer> questionID = new ArrayList<>();


        for (int i=0; i<QuestionBank.list.get(topicID).get(diffID).size(); i++) questionID.add(i);
        Collections.shuffle(questionID);

        Questions[] quizzes = new Questions[]{
                QuestionBank.list.get(topicID).get(diffID).get(questionID.get(0)),
                QuestionBank.list.get(topicID).get(diffID).get(questionID.get(1)),
                QuestionBank.list.get(topicID).get(diffID).get(questionID.get(2)),
                QuestionBank.list.get(topicID).get(diffID).get(questionID.get(3)),
                QuestionBank.list.get(topicID).get(diffID).get(questionID.get(4))
            };

        score = 0;
        question_no = 0;

        binding = FragmentFirstBinding.inflate(inflater, container, false);

        binding.textviewFirst.setText(quizzes[0].getQuestionText());
        binding.progressBar.setProgress(question_no + 1);
        binding.progressText.setText(String.format("%d/5",question_no + 1));

        binding.buttonTrue.setOnClickListener(view -> {
            boolean answer = quizzes[question_no].isAnswer();
            score += (answer) ? 1 : 0;

            question_no += 1;
            if (question_no < 5) {
                String question = quizzes[question_no].getQuestionText();

                binding.textviewFirst.setText(question);
                binding.progressBar.setProgress(question_no + 1);
                binding.progressText.setText(String.format("%d/5", question_no + 1));
            }

            if (question_no == 5) {
                Bundle bundle = new Bundle();
                bundle.putInt("score", score);
                bundle.putInt("topic", topicID);
                bundle.putInt("diff", diffID);
                NavHostFragment.findNavController(FirstFragment.this)
                        .navigate(R.id.action_FirstFragment_to_SecondFragment, bundle);
            }
        });

        binding.buttonFalse.setOnClickListener(view -> {
            boolean answer = quizzes[question_no].isAnswer();
            score += (!answer) ? 1 : 0;

            question_no += 1;

            if(question_no < 5) {
                String question = quizzes[question_no].getQuestionText();
                binding.textviewFirst.setText(question);
                binding.progressBar.setProgress(question_no + 1);
                binding.progressText.setText(String.format("%d/5", question_no + 1));
            }

            if (question_no == 5)
            {
                Bundle bundle = new Bundle();
                bundle.putInt("score", score);
                bundle.putInt("topic", topicID);
                bundle.putInt("diff", diffID);
                NavHostFragment.findNavController(FirstFragment.this)
                        .navigate(R.id.action_FirstFragment_to_SecondFragment, bundle);
            }
        });

        // test function
        return binding.getRoot();

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}
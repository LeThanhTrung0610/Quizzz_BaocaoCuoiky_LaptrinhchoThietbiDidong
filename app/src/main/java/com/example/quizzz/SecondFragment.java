package com.example.quizzz;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentResultListener;
import androidx.navigation.fragment.NavHostFragment;

import com.example.quizzz.databinding.FragmentSecondBinding;

public class SecondFragment extends Fragment {

    private FragmentSecondBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentSecondBinding.inflate(inflater, container, false);

        Bundle secondArg = getArguments();
        int data = 0;
        int topicID = 0;
        int diffID = 0;
        if (secondArg != null) {
            data = secondArg.getInt("score", -1);
            topicID = secondArg.getInt("topic", -1);
            diffID = secondArg.getInt("diff", -1);
        }
        binding.textviewResult.setText(String.format("%d/5",data));

        int score = data;
        String topicName = QuestionBank.getTopicName(topicID);
        String diffName = QuestionBank.getDiffName(diffID);

        binding.buttonShare.setOnClickListener(view -> {
            Intent sendIntent = new Intent();
            String shareText = "I have correctly answered " + Integer.toString(score) + " questions in " +
                                diffName + " mode of topic " + topicName;

            sendIntent.setAction(Intent.ACTION_SEND);
            sendIntent.putExtra(Intent.EXTRA_TEXT, shareText);
            sendIntent.setType("text/plain");

            Intent shareIntent = Intent.createChooser(sendIntent, null);
            startActivity(shareIntent);
        });


        return binding.getRoot();
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.buttonComplete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(SecondFragment.this)
                        .navigate(R.id.action_SecondFragment_to_topicFragment);
            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}
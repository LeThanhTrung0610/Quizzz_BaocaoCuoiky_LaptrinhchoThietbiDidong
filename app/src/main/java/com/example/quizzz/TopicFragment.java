package com.example.quizzz;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.quizzz.databinding.FragmentTopicBinding;

public class TopicFragment extends Fragment {
    private FragmentTopicBinding binding;
    int topicID = 0;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentTopicBinding.inflate(inflater, container, false);

        binding.topic1.setOnClickListener(view -> {
            topicID = 0;
            Bundle bundle = new Bundle();
            bundle.putInt("topic", topicID);
            NavHostFragment.findNavController(TopicFragment.this).navigate(R.id.action_topicFragment_to_diffFragment, bundle);
        });

        binding.topic2.setOnClickListener(view -> {
            topicID = 1;
            Bundle bundle = new Bundle();
            bundle.putInt("topic", topicID);
            NavHostFragment.findNavController(TopicFragment.this).navigate(R.id.action_topicFragment_to_diffFragment, bundle);
        });

        binding.topic3.setOnClickListener(view -> {
            topicID = 2;
            Bundle bundle = new Bundle();
            bundle.putInt("topic", topicID);
            NavHostFragment.findNavController(TopicFragment.this).navigate(R.id.action_topicFragment_to_diffFragment, bundle);
        });

        binding.topic4.setOnClickListener(view -> {
            topicID = 3;
            Bundle bundle = new Bundle();
            bundle.putInt("topic", topicID);
            NavHostFragment.findNavController(TopicFragment.this).navigate(R.id.action_topicFragment_to_diffFragment, bundle);
        });

        binding.topic5.setOnClickListener(view -> {
            topicID = 4;
            Bundle bundle = new Bundle();
            bundle.putInt("topic", topicID);
            NavHostFragment.findNavController(TopicFragment.this).navigate(R.id.action_topicFragment_to_diffFragment, bundle);
        });

        binding.topic6.setOnClickListener(view -> {
            topicID = 5;
            Bundle bundle = new Bundle();
            bundle.putInt("topic", topicID);
            NavHostFragment.findNavController(TopicFragment.this).navigate(R.id.action_topicFragment_to_diffFragment, bundle);
        });
        return binding.getRoot();
    }
}
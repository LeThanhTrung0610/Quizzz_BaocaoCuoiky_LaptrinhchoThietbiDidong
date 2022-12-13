package com.example.quizzz;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.quizzz.databinding.FragmentDiffBinding;

public class jDiffFragment extends Fragment {
    private FragmentDiffBinding binding;
    int diffID = 0;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentDiffBinding.inflate(inflater, container, false);
        Bundle bundle = getArguments();

        binding.ez.setOnClickListener(view ->{
            diffID = 0;
            bundle.putInt("diff", diffID);
            NavHostFragment.findNavController(DiffFragment.this).navigate(R.id.action_diffFragment_to_FirstFragment, bundle);
        });

        binding.med.setOnClickListener(view ->{
            diffID = 1;
            bundle.putInt("diff", diffID);
            NavHostFragment.findNavController(DiffFragment.this).navigate(R.id.action_diffFragment_to_FirstFragment, bundle);
        });

        binding.hard.setOnClickListener(view ->{
            diffID = 2;
            bundle.putInt("diff", diffID);
            NavHostFragment.findNavController(DiffFragment.this).navigate(R.id.action_diffFragment_to_FirstFragment, bundle);
        });
        return binding.getRoot();
    }
}
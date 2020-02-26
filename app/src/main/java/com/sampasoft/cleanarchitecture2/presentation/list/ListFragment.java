package com.sampasoft.cleanarchitecture2.presentation.list;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.sampasoft.cleanarchitecture2.MainActivity;
import com.sampasoft.cleanarchitecture2.databinding.FragmentListBinding;

import java.util.Objects;

public class ListFragment extends Fragment {

    private FragmentListBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return (binding = FragmentListBinding.inflate(inflater, container, false)).getRoot();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        MainActivity activity = ((MainActivity) getActivity());
        Objects.requireNonNull(activity).setToolbar(binding.toolbar);
    }
}

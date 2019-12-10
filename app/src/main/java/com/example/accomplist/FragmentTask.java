package com.example.accomplist;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ListView;

import com.google.android.material.textfield.TextInputEditText;

/**
 * A simple {@link Fragment} subclass.

 */
public class FragmentTask extends Fragment {


    public FragmentTask() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_task, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        final NavController navController = Navigation.findNavController(view);

        Button bacButton = view.findViewById(R.id.bacBtn);
        bacButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_fragmentTask_to_fragmentHome);
            }
        });

        Button addTaskBtn = view.findViewById(R.id.createTaskBtn);
        final CheckBox checkOne = view.findViewById(R.id.checkBtn);
        final TextInputEditText input = view.findViewById(R.id.inputText);
        input.setVisibility(View.GONE);
        checkOne.setVisibility(View.GONE);
        addTaskBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkOne.setVisibility(View.VISIBLE);
                input.setVisibility(View.VISIBLE);
            }
        });
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        if (savedInstanceState != null) {
            mMyFragment = getSupportFragmentManager().getFragment(savedInstanceState, "myFragmentName");
            //Restore the fragment's state here
        }
    }
    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putSerializable("list", (Serializable) myData);
        //Save the fragment's state here
    }

}

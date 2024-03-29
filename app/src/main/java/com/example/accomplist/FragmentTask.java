package com.example.accomplist;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;

import com.google.android.material.textfield.TextInputEditText;

/**
 * A simple {@link Fragment} subclass.

 */
public class FragmentTask extends Fragment  {
    //private boolean called = false;
    //private Button chapOneButton;
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





        Button addTaskBtn = view.findViewById(R.id.createTaskBtn);
        final CheckBox checkOne = view.findViewById(R.id.checkBtn);
        final TextInputEditText input = view.findViewById(R.id.textInputEditText);
        input.setVisibility(View.GONE);
        checkOne.setVisibility(View.GONE);
        addTaskBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkOne.setVisibility(View.VISIBLE);
                input.setVisibility(View.VISIBLE);
            }
        });
        Button doneButton = view.findViewById(R.id.doneBtn);
        doneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                navController.navigate(R.id.action_fragmentTask_to_blankFragment);

            }
        });



    }

    }






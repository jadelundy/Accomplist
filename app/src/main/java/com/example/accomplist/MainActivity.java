package com.example.accomplist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    Bundle savedArgs = new Bundle();
    FragmentTask fragment = new FragmentTask();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstance!= null){
            savedArgs.putString(fragment.USER, savedInstanceState.getString(SAVED_USER));
        }
        @Override
        protected void onSaveInstanceState(Bundle outState) {
            super.onSaveInstanceState(outState);
            // Save the user entered username
            EditText etUser = (EditText) findViewById(R.id.user_ID);
            outState.putString(SAVED_USER, etUser.getText().toString());
        }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        //Save the fragment's instance

    }

}

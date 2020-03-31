package com.ustsv.java.myapplication;

//import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
//import android.support.v4.app.Fragment;
//import android.support.v4.app.FragmentManager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.fragment_container);

//        if (fragment == null) {
//            fragment = CrimeFragment.newInstance();
//            fm.beginTransaction()
//                    .add(R.id.fragment_container, fragment)
//                    .commit();
//        }

        if (fragment == null) {
            fragment = CrimeFragment.newInstance();
        }
        fm.beginTransaction().replace(R.id.fragment_container, fragment).commit();
    }

}

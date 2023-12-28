package com.example.bookie;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.bookie.Fragments.Fragment1;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
BottomNavigationView bnView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bnView = findViewById(R.id.bnView);

        bnView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                int id = item.getItemId();

                if (id == R.id.nav_home) {
                    loadFrag(new Fragment1(),false);

                } else if (id == R.id.nav_category) {

                    loadFrag(new Fragment1(),true);

                } else if (id == R.id.nav_bookmark) {
                    loadFrag(new Fragment1(),true);

                } else if (id == R.id.nav_downloads) {

                    loadFrag(new Fragment1(),true);

                } else {//profile

                }
                    return true;
                }

        });
       // bnView.setSelectedItemId(R.id.nav_home);

    }

    public void loadFrag(Fragment fragment, boolean flag) {



        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        if(!flag)
        ft.add(R.id.container, fragment);
        else
            ft.replace(R.id.container, fragment);
        ft.commit();
    }
}
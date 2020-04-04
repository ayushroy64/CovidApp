package com.example.covidapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    BottomNavigationView bottomNavigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);



        loadFragment(new HomeFragment());


    }
    private boolean loadFragment(Fragment fragment) {
        //switching fragment
        if (fragment != null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_container, fragment)
                    .commit();
            return true;
        }
        return false;
    }
   /* BottomNavigationView.OnNavigationItemSelectedListener navigationItemSelectedListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    switch (item.getItemId()) {
                        case R.id.navigation_home:
                            getSupportFragmentManager().beginTransaction().replace(R.id.container,
                                    new HomeFragment()).commit();

                        case R.id.navigation_guidelines:
                            openFragment(GuidelineFragment.newInstance("", ""));
                            return true;
                        case R.id.navigation_tracker:
                            openFragment(TrackerFragment.newInstance("", ""));
                            return true;
                        case R.id.navigation_news:
                            openFragment(NewsFragment.newInstance("",""));
                    }
                    return false;
                }
            };*/

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Fragment fragment = null;

        switch (item.getItemId()) {
            case R.id.navigation_home:
                fragment = new HomeFragment();
                break;

            case R.id.navigation_guidelines:
                fragment = new GuidelineFragment();
                break;

            case R.id.navigation_news:
                fragment = new NewsFragment();
                break;

            case R.id.navigation_tracker:
                fragment = new TrackerFragment();
                break;

            case R.id.navigation_donation:
                fragment = new DonateFragment();
                break;
        }

        return loadFragment(fragment);
    }

}

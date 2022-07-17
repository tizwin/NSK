package com.example.android.nsk.Adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.android.nsk.Fragments.FountainsFragment;
import com.example.android.nsk.Fragments.MonumentsFragment;
import com.example.android.nsk.Fragments.MuseumsFragment;
import com.example.android.nsk.Fragments.ParksFragment;
import com.example.android.nsk.Fragments.TheatersFragment;

public class PlacesFragmentPageAdapter extends FragmentPagerAdapter {

    private String tabTitles[] = new String[] {"Парки", "Памятники", "Фонтаны", "Театры", "Музеи",};

    public PlacesFragmentPageAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new ParksFragment();
        } else if (position == 1) {
            return new MonumentsFragment();
        } else if (position == 2) {
            return new FountainsFragment();
        } else if (position == 3) {
            return new TheatersFragment();
        } else {
            return new MuseumsFragment();
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }

    @Override
    public int getCount() {
        return 5;
    }
}

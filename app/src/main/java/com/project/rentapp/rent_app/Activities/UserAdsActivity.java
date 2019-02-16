package com.project.rentapp.rent_app.Activities;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import com.project.rentapp.rent_app.Fragments.UserAdsFragment;
import com.project.rentapp.rent_app.R;

public class UserAdsActivity extends BaseNavigationActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LayoutInflater inflater = (LayoutInflater) this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View contentView = inflater.inflate(R.layout.activity_user_ads, null, false);
        drawer.addView(contentView, 0);

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.user_ads_fragment_container, new UserAdsFragment(), "userAdsList")
                .commit();
    }
}

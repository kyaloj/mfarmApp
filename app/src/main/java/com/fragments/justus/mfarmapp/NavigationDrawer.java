package com.fragments.justus.mfarmapp;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.fragments.justus.mfarmapp.mockedActivity.Settings;
import com.fragments.justus.mfarmapp.mockedFragments.FragmentIndex;

import it.neokree.materialnavigationdrawer.MaterialNavigationDrawer;
import it.neokree.materialnavigationdrawer.elements.MaterialAccount;
import it.neokree.materialnavigationdrawer.elements.MaterialSection;


public class NavigationDrawer extends MaterialNavigationDrawer {

    @Override
    public void init(Bundle savedInstanceState) {
        // add accounts
        MaterialAccount account = new MaterialAccount(this.getResources(),"NeoKree","neokree@gmail.com", R.drawable.photo, R.drawable.bamboo);
        this.addAccount(account);

        MaterialAccount account2 = new MaterialAccount(this.getResources(),"Hatsune Miky","hatsune.miku@example.com",R.drawable.photo2,R.drawable.mat2);
        this.addAccount(account2);

        MaterialAccount account3 = new MaterialAccount(this.getResources(),"Example","example@example.com",R.drawable.photo,R.drawable.mat3);
        this.addAccount(account3);

        // create sections
        this.addSection(newSection("Section 1", R.drawable.ic_mic_white_24dp, new FragmentIndex()));
        this.addSection(newSection("Section 2", R.drawable.ic_hotel_grey600_24dp, new FragmentIndex()));


        // create bottom section
        this.addBottomSection(newSection("Bottom Section", R.drawable.ic_settings_black_24dp, new Intent(this, Settings.class)));
    }
}

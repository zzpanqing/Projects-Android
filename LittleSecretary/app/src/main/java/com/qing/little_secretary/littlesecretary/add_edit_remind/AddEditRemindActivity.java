package com.qing.little_secretary.littlesecretary.add_edit_remind;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.qing.little_secretary.littlesecretary.R;

public class AddEditRemindActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_edit_remind);

        // Set up the toolbar.
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);

        AddEditRemindFragment addEditRemindFragment =
                (AddEditRemindFragment) getSupportFragmentManager()
                .findFragmentById(R.id.contentFrame);

        if(addEditRemindFragment == null)
            addEditRemindFragment = AddEditRemindFragment.newInstance();
    }
}

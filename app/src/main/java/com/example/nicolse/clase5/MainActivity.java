package com.example.nicolse.clase5;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends FragmentActivity implements  MyListFragment.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onRssItemSelected(String link) {


        boolean dual_pane=getResources().getBoolean(R.bool.dual_pane);
        if(dual_pane){
            DetailFragment fragment = (DetailFragment) getSupportFragmentManager().findFragmentById(R.id.detailFragment);
            if(MyListFragment.BUTTON_TYPE_SELECTED== MyListFragment.buttonType.Updater){
                fragment.setText(link);
            }

            if(MyListFragment.BUTTON_TYPE_SELECTED== MyListFragment.buttonType.DisplayerBeach){
                fragment.setImage(R.drawable.beach);
            }

        }else{
            Intent intent = new Intent(getApplicationContext(),DetailActivity.class);
            intent.putExtra(DetailActivity.EXTRA_URL,link);
            startActivity(intent);
        }




    }
}

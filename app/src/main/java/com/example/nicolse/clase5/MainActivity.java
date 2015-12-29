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

import java.util.logging.Logger;

public class MainActivity extends FragmentActivity implements  MyListFragment.OnItemSelectedListener {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onRssItemSelected(String link,MyListFragment.buttonType tipodeboton) {


        boolean dual_pane=getResources().getBoolean(R.bool.dual_pane);
        if(dual_pane){
            DetailFragment detailFragment = (DetailFragment) getSupportFragmentManager().findFragmentById(R.id.detailFragment);
            detailFragment.setComponent(link,tipodeboton);
        }else{
            Intent intent = new Intent(getApplicationContext(),DetailActivity.class);
            System.out.println("----------------------"+link+"-----------------------");
            intent.putExtra(DetailActivity.EXTRA_URL,link);
            intent.putExtra("buttonType", tipodeboton);
            startActivity(intent);
        }

    }
}

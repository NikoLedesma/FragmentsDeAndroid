package com.example.nicolse.clase5;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v4.app.FragmentActivity;

/**
 * Created by NicolásE on 23/12/2015.
 */
public class DetailActivity extends FragmentActivity {

    public static final String EXTRA_URL="url";

    @Override
    /*

    porque esto me tira una pantalla blanca???
    *     public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
    *
    *
    * */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(getResources().getBoolean(R.bool.dual_pane)){
            finish();
            return;
        }

        setContentView(R.layout.activity_detail);
        Bundle extras = getIntent().getExtras();
        if(extras!=null){
            String url = extras.getString(EXTRA_URL);
            DetailFragment detailFragment=(DetailFragment)
                    getSupportFragmentManager().findFragmentById(R.id.detailFragment);
            detailFragment.setText(url);
        }

    }
}

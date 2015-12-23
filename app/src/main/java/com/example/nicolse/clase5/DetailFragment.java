package com.example.nicolse.clase5;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.nicolse.clase5.R;

/**
 * Created by NicolásE on 22/12/2015.
 */


public class DetailFragment extends Fragment{

    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState){
        View view =inflater.inflate(R.layout.fragment_news_detail,container ,true);
        return view;
        }


    public void setText(String url) {
        TextView view = null;
        view = (TextView) getView().findViewById(R.id.detailsText);
        view.setText(url);
    }

}

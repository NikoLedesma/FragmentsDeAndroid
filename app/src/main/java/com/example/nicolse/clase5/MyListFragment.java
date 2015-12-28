package com.example.nicolse.clase5;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;

/**
 * Created by NicolásE on 22/12/2015.
 */
public class MyListFragment extends Fragment {

    private OnItemSelectedListener listener;
    public enum buttonType { Updater , DisplayerBeach }

    public interface  OnItemSelectedListener {
        public void onRssItemSelected(String link,buttonType tipodeboton);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
    View view = inflater.inflate(R.layout.fragment_news_list,container,true);
        setOnClickListenerAllButtons(view);
        return view;
    }



    public void setOnClickListenerAllButtons(View view){
        Button buttonUpdater =(Button) view.findViewById(R.id.update_button);
        buttonUpdater.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateDetail("fake",buttonType.Updater);
            }
        });


        Button buttonDiplayerBeach = (Button) view.findViewById(R.id.image_button);
        buttonDiplayerBeach.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        updateDetail("beacher",buttonType.DisplayerBeach);
                    }
                }

        );
    }


//EL context del onAttach se podria considerar como el "activity main" lo cual el "activity" seria el listener?
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if(context instanceof OnItemSelectedListener){
            listener= (OnItemSelectedListener) context;
        }
        else{
            throw  new ClassCastException(context.toString()
                    +" must implement MyListFragment.OnItemSelectedListener");
        }
    }

    public void updateDetail(String uri,buttonType tipodeboton){
        String newTime=null;
        switch (tipodeboton){
            case DisplayerBeach:
                newTime = String.valueOf(111101111);
                listener.onRssItemSelected(newTime,tipodeboton);
            break;

            case Updater:
                newTime = String.valueOf(System.currentTimeMillis());
                listener.onRssItemSelected(newTime,tipodeboton);
            break;
        }


    }

}

















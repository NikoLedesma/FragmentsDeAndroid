package com.example.nicolse.clase5;

import android.media.Image;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.nicolse.clase5.R;

/**
 * Created by NicolásE on 22/12/2015.
 */


public class DetailFragment extends Fragment{

    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState){

        View view=null;
        view =inflater.inflate(R.layout.fragment_news_detail,container ,true);
        return view;
        }






    public void setComponent(String url , MyListFragment.buttonType button_type_selected){
        if(button_type_selected== MyListFragment.buttonType.Updater){
            setText(url);
        }
        if(button_type_selected== MyListFragment.buttonType.DisplayerBeach){
            setImage(Integer.parseInt(url));
        }
    }








    public void setText(String url) {
        TextView view = null;
        view = (TextView) getView().findViewById(R.id.detailsText);
        view.setText(url);
        view.setTextSize(40f);

        ImageView imagen = null;
        imagen = (ImageView) getView().findViewById(R.id.detailsImage);
        imagen.setVisibility(View.INVISIBLE);


    }

    public void setImage(int img){

        ImageView imagen = null;
        imagen = (ImageView) getView().findViewById(R.id.detailsImage);
        imagen.setImageResource(img);
        imagen.setVisibility(View.VISIBLE);

/*        ViewGroup.MarginLayoutParams imageViewParams = new ViewGroup.MarginLayoutParams(
                ViewGroup.MarginLayoutParams.WRAP_CONTENT,
                ViewGroup.MarginLayoutParams.WRAP_CONTENT);
        imagen.setLayoutParams(imageViewParams);
*/

        TextView view = null;
        view = (TextView) getView().findViewById(R.id.detailsText);
        view.setTextSize(0.0f);
    }

}

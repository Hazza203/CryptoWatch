package com.example.harry.cryptowatch.View.Adapters;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Harry on 21-Nov-17.
 */

public class CoinListAdapter extends BaseAdapter implements View.OnClickListener {

    private Activity activity;
    private ArrayList data;
    private static LayoutInflater inflater = null;
    private Resources res;

    public CoinListAdapter(Activity activity, ArrayList list, Resources resLocal){
        this.activity = activity;
        this.data = list;
        this.res = resLocal;

        /* ********** Inflated used to call external xml layout ********** */
        inflater = ( LayoutInflater ) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    public int getCount() {
        if(data.size()<=0){
            return 1;
        }
        return data.size();
    }

    public Object getItem(int position) { return position; }
    public long getItemId(int position) { return position; }

    //Holder class used to contains xml elements
    public static class ViewHolder{
        public TextView text;
        public ImageView image;
    }

    public View getView(int Position, View convertView, ViewGroup parent){

        View view = convertView;
        ViewHolder holder;

        /* ***** TO DO ***** */

        return view;
    }

    @Override
    public void onClick(View v){


    }

}

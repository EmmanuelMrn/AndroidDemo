package com.example.codereviewtest.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.codereviewtest.OptionPhoneSettingActivity;
import com.example.codereviewtest.R;

import java.util.List;

public class AdapterPhoneSettings extends RecyclerView.Adapter<AdapterPhoneSettings.ListViewHolder>{

    private int[] mOptionsImages = {
            R.drawable.ic_signal,
            R.drawable.ic_screen_brightness,
            R.drawable.ic_volume_ringtone,
            R.drawable.ic_menu_home_screen,
            R.drawable.ic_customize_phone,
            R.drawable.ic_android
    };

    List<String> listDatos;
    private Context context;

    public AdapterPhoneSettings( Context context, List<String> listDatos ){
        this.context = context;
        this.listDatos = listDatos;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.adapter_item, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder listViewHolder, final int position) {
        String positions = listDatos.get(position);

        listViewHolder.mOptionItem.setText(positions);
        listViewHolder.mImageItem.setImageResource(mOptionsImages[position]);

        listViewHolder.mItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getId() == R.id.optionItemLinearLayout) {
                    goToOptionPhoneSetting(position);
                }
            }
        });
    }

    public void goToOptionPhoneSetting(int index){

        Intent intent = new Intent();
        intent.setClass(context, OptionPhoneSettingActivity.class);
        intent.putExtra("index", index);
        context.startActivity(intent);
    }

    @Override
    public int getItemCount() {
        return listDatos.size();
    }


    public class ListViewHolder extends RecyclerView.ViewHolder{

        private TextView mOptionItem;
        private ImageView mImageItem;
        private LinearLayout mItem;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);

            mOptionItem = itemView.findViewById(R.id.labelAdapterItem);
            mImageItem = itemView.findViewById(R.id.imageAdapterItem);
            mItem = itemView.findViewById(R.id.optionItemLinearLayout);
        }
    }
}






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
import com.example.codereviewtest.fragments.OptionSettingFragment;

import java.util.List;


public class PhoneSettingsAdapter extends RecyclerView.Adapter<PhoneSettingsAdapter.ListViewHolder>{
    private int[] mOptionsImages = {
            R.drawable.ic_signal,
            R.drawable.ic_screen_brightness,
            R.drawable.ic_volume_ringtone,
            R.drawable.ic_menu_home_screen,
            R.drawable.ic_customize_phone,
            R.drawable.ic_android
    };

    List<String> mDataListSettingsOptions;
    private Context mContext;

    public PhoneSettingsAdapter(Context context, List<String> dataListSettingsOptions){
        this.mContext = context;
        this.mDataListSettingsOptions = dataListSettingsOptions;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.adapter_item, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder listViewHolder, final int position) {
        String positions = mDataListSettingsOptions.get(position);

        listViewHolder.getmOptionItem().setText(positions);
        listViewHolder.getmImageItem().setImageResource(mOptionsImages[position]);

        listViewHolder.getmItem().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getId() == R.id.option_item_linearlayout) {
                    goToOptionPhoneSetting(position);
                }
            }
        });
    }

    /**
     * This method create a new instance of Intent for go to OptionSettingFragment, also put a parameter for the fragment.
     *
     * @param index: This parameter indicates the option that the user selected and help us to decide which fragment renderize.
     */
    public void goToOptionPhoneSetting(int index){

        Intent intent = new Intent();
        intent.setClass(mContext, OptionPhoneSettingActivity.class);
        intent.putExtra(OptionSettingFragment.INDEX, index);
        if(mContext != null) {
            mContext.startActivity(intent);
        }
    }

    @Override
    public int getItemCount() {
        return mDataListSettingsOptions.size();
    }


    public class ListViewHolder extends RecyclerView.ViewHolder{

        private TextView mOptionItem;
        private ImageView mImageItem;
        private LinearLayout mItem;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);

            mOptionItem = itemView.findViewById(R.id.label_adapter_item);
            mImageItem = itemView.findViewById(R.id.image_adapter_item);
            mItem = itemView.findViewById(R.id.option_item_linearlayout);
        }

        public TextView getmOptionItem() {
            return mOptionItem;
        }

        public ImageView getmImageItem() {
            return mImageItem;
        }

        public LinearLayout getmItem() {
            return mItem;
        }
    }
}






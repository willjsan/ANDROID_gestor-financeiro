package com.bill.trackbills.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

import com.bill.trackbills.R;

public class OverviewWrapperAdapter extends BaseAdapter {

    Context context;

    public OverviewWrapperAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return 1;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        View createdView = inflateLayou(viewGroup);
        binding(position, createdView);
        return createdView;
    }

    private void binding(int position, View createdView) {

//        TextView tv = createdView.findViewById(R.id.teste_tv);
//        Button bt = createdView.findViewById(R.id.teste_bt);
//        tv.setText("eu sou um teste tv");
//        bt.setText("eu sou um teste bt");

    }

    private View inflateLayou(ViewGroup viewGroup) {
        return LayoutInflater.from(context).inflate(R.layout.overview_list_item,
                viewGroup, false);
    }

}

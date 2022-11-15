package com.example.baikiemtra1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CaSiAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<CaSi> arraylist;

    public CaSiAdapter(Context context, int layout, List<CaSi> arraylist) {
        this.context = context;
        this.layout = layout;
        this.arraylist = arraylist;
    }

    @Override


    public int getCount() {
        return arraylist.size();
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
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(layout, null);
        CaSi caSi = arraylist.get(i);

        TextView textView1 = view.findViewById(R.id.tv_name);
        TextView textView2 = view.findViewById(R.id.tv_nghedanh);
        TextView textView3 = view.findViewById(R.id.tv_quocgia);
        ImageView imageView1 = view.findViewById(R.id.imgAvatar);

        textView1.setText(caSi.getTen());
        textView2.setText(caSi.getNgheDanh());
        textView3.setText(caSi.getQuocGia());
        imageView1.setImageResource(caSi.getHinhAnh());

        return view;
    }
}

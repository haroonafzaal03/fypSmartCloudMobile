package com.mobbilecomputer.bnu.retrofitandroidconnectivity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class Setting extends Fragment {

  TextView textView;
  RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_setting, container, false);

         textView = view.findViewById(R.id.text);

        textView.setText("hello Fragmet from setting");
        textView.setTextSize(25f);

        //Recyler Code here

        List<String> list = new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");
        recyclerView = view.findViewById(R.id.recyler_Setting);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(new RecylerViewAdapter(list));

        return  view;
    }
    private class RecylerViewholder extends RecyclerView.ViewHolder{
        private CardView cardView;
        private TextView mTextView;

        public RecylerViewholder(View itemView) {
            super(itemView);
        }
        public RecylerViewholder(LayoutInflater inflater,ViewGroup container){
            super(inflater.inflate(R.layout.fragment_dashboard,container,false));

            cardView = itemView.findViewById(R.id.card_container);
            mTextView = itemView.findViewById(R.id.cardtTitle);
        }
    }
    public class RecylerViewAdapter extends RecyclerView.Adapter<RecylerViewholder>{

        private     List<String> mList;
        public RecylerViewAdapter(List<String> list ){
            this.mList = list;

        }
        @Override
        public RecylerViewholder onCreateViewHolder(ViewGroup parent, int viewType) {
            LayoutInflater  inflater = LayoutInflater.from(getActivity());

            return new RecylerViewholder(inflater,parent);
        }

        @Override
        public void onBindViewHolder(RecylerViewholder holder, int position) {
            holder.mTextView.setText(mList.get(position));
        }

        @Override
        public int getItemCount() {
            return mList.size();
        }
    }

}

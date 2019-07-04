package com.iamukasa.nothelloworld;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recycler;
    MyAdapter adapter;

    ArrayList <Items> sounditems;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sounditems= new ArrayList<Items>();

        recycler =(RecyclerView)findViewById(R.id.recyclerview);
        recycler.setLayoutManager(new GridLayoutManager(this,2));


        sounditems.add(new Items(android.R.drawable.ic_menu_report_image,R.raw.sound));
        sounditems.add(new Items(android.R.drawable.ic_btn_speak_now,R.raw.airhorn));
        sounditems.add(new Items(android.R.drawable.ic_dialog_alert,R.raw.vybz));
        sounditems.add(new Items(android.R.drawable.ic_input_add,R.raw.leroy_2));
        sounditems.add(new Items(android.R.drawable.ic_dialog_map,R.raw.bazinga));
        sounditems.add(new Items(android.R.drawable.ic_btn_speak_now,R.raw.wuba));
        sounditems.add(new Items(android.R.drawable.ic_delete,R.raw.roger));
        sounditems.add(new Items(android.R.drawable.ic_lock_idle_charging,R.raw.sound));
        sounditems.add(new Items(android.R.drawable.ic_lock_lock,R.raw.wuba));
        sounditems.add(new Items(android.R.drawable.ic_lock_power_off,R.raw.roger));
        sounditems.add(new Items(android.R.drawable.ic_menu_report_image,R.raw.sound));
        sounditems.add(new Items(android.R.drawable.ic_btn_speak_now,R.raw.airhorn));
        sounditems.add(new Items(android.R.drawable.ic_dialog_alert,R.raw.vybz));
        sounditems.add(new Items(android.R.drawable.ic_input_add,R.raw.leroy_2));
        sounditems.add(new Items(android.R.drawable.ic_dialog_map,R.raw.bazinga));
        sounditems.add(new Items(android.R.drawable.ic_btn_speak_now,R.raw.wuba));
        sounditems.add(new Items(android.R.drawable.ic_delete,R.raw.roger));
        sounditems.add(new Items(android.R.drawable.ic_lock_idle_charging,R.raw.sound));
        sounditems.add(new Items(android.R.drawable.ic_lock_lock,R.raw.wuba));
        sounditems.add(new Items(android.R.drawable.ic_lock_power_off,R.raw.roger));

        adapter=new MyAdapter(getApplicationContext(),sounditems);


        recycler.setAdapter(adapter);















    }

    private class MyAdapter extends  RecyclerView.Adapter<MyAdapter.MyViewHolder>{
        Context context;
        ArrayList<Items> feedItems;

        public MyAdapter(Context context, ArrayList<Items> feedItems)  {
            this.context = context;
            this.feedItems=feedItems;
        }

        @NonNull
        @Override
        public MyAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_item,null);

            MyViewHolder viewHolder = new MyViewHolder(view);
            return viewHolder;
        }

        @Override
        public void onBindViewHolder(@NonNull MyAdapter.MyViewHolder holder, int position) {
            final Items feedItem = feedItems.get(position);

            holder.soundimage.setImageResource(feedItem.getsImage());

            holder.t.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    MediaPlayer mp = MediaPlayer.create(context,feedItem.getsSound());
                    mp.start();

                }
            });







        }

        @Override
        public int getItemCount() {
            return (null != feedItems ? feedItems.size() : 0);
        }

        public class MyViewHolder  extends RecyclerView.ViewHolder{
            CardView t;
            ImageView soundimage;
            public MyViewHolder(@NonNull View itemView) {
                super(itemView);
                this.soundimage =(ImageView)itemView.findViewById(R.id.soundimage);
                this.t =(CardView)itemView.findViewById(R.id.cardview);
            }
        }
    }
}

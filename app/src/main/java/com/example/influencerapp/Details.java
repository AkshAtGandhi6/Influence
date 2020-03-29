package com.example.influencerapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Details extends AppCompatActivity {
    List<City> lstvideos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        lstvideos = new ArrayList<>();
        lstvideos.add(new City("Video1","Video ","1000rs", "Submitted on 10/2/2020","Accepted",R.drawable.play_video));
        lstvideos.add(new City("Video2","Video ","2000rs", "Submitted on 10/3/2020","Accepted",R.drawable.play_video));
        lstvideos.add(new City("Video3","Video ","3000rs", "Submitted on 12/2/2020","Accepted",R.drawable.play_video));
        lstvideos.add(new City("Video4","Video ","4000rs", "Submitted on 15/2/2020","Accepted",R.drawable.play_video));
        lstvideos.add(new City("Video5","Video ","0rs", "Submitted on 14/2/2020","Denied",R.drawable.play_video));
        lstvideos.add(new City("Video6","Video ","500rs", "Submitted on 18/2/2020","Accepted",R.drawable.play_video));
        lstvideos.add(new City("Video7","Video ","1000rs", "Submitted on 10/1/2020","Accepted",R.drawable.play_video));
        lstvideos.add(new City("Video8","Video ","1000rs", "Submitted on 19/2/2020","Accepted",R.drawable.play_video));
        lstvideos.add(new City("Video9","Video ","0rs", "Submitted on 22/2/2020","Denied",R.drawable.play_video));
        lstvideos.add(new City("Video10","Video ","0rs", "Submitted on 25/2/2020","Denied",R.drawable.play_video));
        lstvideos.add(new City("Video11","Video ","1000rs", "Submitted on 24/2/2020","Accepted",R.drawable.play_video));
        lstvideos.add(new City("Video12","Video ","0rs", "Submitted on 21/2/2020","Denied",R.drawable.play_video));

        RecyclerView myrv = (RecyclerView) findViewById(R.id.recyclerview_id);

        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this,lstvideos);

        myrv.setLayoutManager(new GridLayoutManager(this,2));
        myrv.setAdapter(myAdapter);
    }
}

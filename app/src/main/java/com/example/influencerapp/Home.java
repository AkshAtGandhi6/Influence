package com.example.influencerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.auth.api.Auth;
import com.google.firebase.auth.FirebaseAuth;

public class Home extends AppCompatActivity {
Button signout,profile,video_details,video_submit;
FirebaseAuth fAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        signout = findViewById(R.id.sign_out);
        profile = findViewById(R.id.prof);
        video_details = findViewById(R.id.prof2);
        video_submit = findViewById(R.id.prof3);
        fAuth=FirebaseAuth.getInstance();

        signout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getId() == R.id.sign_out)
                {
                    fAuth.signOut();
                    Toast.makeText(Home.this,"Sign Out Successfull",Toast.LENGTH_LONG).show();
                    if(FirebaseAuth.getInstance().getCurrentUser()==null)
                    {

                        startMain();

                    }

                }
            }
        });
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, Profile.class);
                startActivity(intent);
            }
        });
        video_details.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, Details.class);
                startActivity(intent);
            }
        });
        video_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, Submit.class);
                startActivity(intent);
            }
        });
    }
    public void startMain()
    {
        Intent intent = new Intent(Home.this,MainActivity.class);
        startActivity(intent);
    }
}

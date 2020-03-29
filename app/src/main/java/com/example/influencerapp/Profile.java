package com.example.influencerapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.UserInfo;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import io.opencensus.tags.Tag;

public class Profile extends AppCompatActivity {
TextView name,mail,followers,earnings,videos,number;
ImageView image;
String a,b,c,n,m,fname,email,num;
private FirebaseAuth mAuth;

String TAG="A";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
       FirebaseFirestore db = FirebaseFirestore.getInstance();
        name = findViewById(R.id.prof_name);
        earnings = findViewById(R.id.prof_earning);
        number = findViewById(R.id.prof_number);
        mail=findViewById(R.id.prof_email);
        followers = findViewById(R.id.prof_followers);
        videos = findViewById(R.id.prof_video);

        DocumentReference docRef = db.collection("users").document("User");
        docRef.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                if (task.isSuccessful()) {
                    DocumentSnapshot document = task.getResult();
                    if (document != null) {
                        Log.i("LOGGER","Earnings "+document.getString("Earning"));
                        a=(String) document.getString("Earning");
                        earnings.setText(a);
                        Log.i("LOGGER","Followers "+document.getString("Followers"));
                        b= (String) document.getString("Followers");
                        followers.setText(b);
                        Log.i("LOGGER","Videos "+document.getString("Videos"));
                        c=(String) document.getString("Videos");
                        videos.setText(c);
                    } else {
                        Log.d("LOGGER", "No such document");
                    }
                } else {
                    Log.d("LOGGER", "get failed with ", task.getException());
                }
            }
        });

        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
        if (user != null) {
            // User is signed in
             fname = user.getDisplayName();
             email = user.getEmail();
             num = user.getPhoneNumber();


            for (UserInfo userInfo : user.getProviderData()) {
                if (fname == null && userInfo.getDisplayName() != null) {
                    fname = userInfo.getDisplayName();
                }


            }
             if(fname!=null)
             {
                 name.setText(fname);
             }

            mail.setText("      "+email);

           // number.setText(num);


        }

            //String fullname = mAuth.getCurrentUser().getDisplayName();
        //String Email_add =mAuth.getCurrentUser().getEmail();
       // name.setText(fullname);
      //  mail.setText(Email_add);
//        earnings.setText(a);
//        followers.setText(b);
//        videos.setText(c);




    }
}

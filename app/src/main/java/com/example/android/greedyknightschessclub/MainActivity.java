package com.example.android.greedyknightschessclub;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Find the ImageView in the activity_main.xml layout with the ID twitter_image
        ImageView twitter = (ImageView)findViewById(R.id.twitter_image);
        // Find the ImageView in the activity_main.xml layout with the ID facebook_image
        ImageView facebook = (ImageView)findViewById(R.id.facebook_image);
        // Find the ImageView in the activity_main.xml layout with the ID call_image
        ImageView phone = (ImageView)findViewById(R.id.call_image);
        // Find the ImageView in the activity_main.xml layout with the ID map_image
        ImageView map = (ImageView)findViewById(R.id.map_image);
        //Set a click listener on the twitter ImageView
        twitter.setOnClickListener(this);
        //Set a click listener on the facebook ImageView
        facebook.setOnClickListener(this);
        //Set a click listener on the phone ImageView
        phone.setOnClickListener(this);
        //Set a click listener on the map ImageView
        map.setOnClickListener(this);
    }

    @Override

    public void onClick(View v) {
        // Clicking on the twitter image will take the user to the club twitter page
        if(v.getId() == R.id.twitter_image){
            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_VIEW);
            intent.addCategory(Intent.CATEGORY_BROWSABLE);
            intent.setData(Uri.parse("http://twitter.com"));
            startActivity(intent);
        }
        // Clicking on the facebook image will take the user to the club facebook page
        else if(v.getId() == R.id.facebook_image){
            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_VIEW);
            intent.addCategory(Intent.CATEGORY_BROWSABLE);
            intent.setData(Uri.parse("http://facebook.com"));
            startActivity(intent);
        }
        // Clicking on the call image will take the user to their phone app with the club number ready
        // to dial
        else if(v.getId() == R.id.call_image){
            Uri number = Uri.parse("tel:3014985152");
            Intent intent = new Intent(Intent.ACTION_DIAL, number);
            startActivity(intent);
        }
        // Clicking on the map image will take the user to the club's location on the map
        else if(v.getId() == R.id.map_image) {
            Uri kingsGrant = Uri.parse("geo:38.5362302,-76.958871");
            Intent intent = new Intent(Intent.ACTION_VIEW, kingsGrant);
            intent.setPackage("com.google.android.apps.maps");
            startActivity(intent);
        }
    }

}

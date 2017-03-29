package net.a6te.lazycoder.customadapterdemo1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
private ListView listView;
    private ArrayList<ImageCollection>imageCollections;
    private ImageAdapter imageAdapter;
    private ImageCollection myImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.myList);
        myImage = new ImageCollection();
        imageCollections = new ArrayList<>();

        imageAdapter = new ImageAdapter(this, imageCollections);

        listView.setAdapter(imageAdapter);

    }
}

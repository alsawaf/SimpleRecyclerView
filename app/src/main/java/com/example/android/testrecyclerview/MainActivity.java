package com.example.android.testrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> myArrayList;
    RecyclerView myRecyclerView;
    CustomAdapter myCustomAdapter;
    LinearLayoutManager myLinearLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myArrayList = new ArrayList<String>();
        myArrayList.add("Person 1");
        myArrayList.add("Person 2");
        myArrayList.add("Person 3");
        myArrayList.add("Person 4");
        myArrayList.add("Person 5");
        myArrayList.add("Person 6");
        myArrayList.add("Person 7");
        myArrayList.add("Person 8");
        myArrayList.add("Person 9");
        myArrayList.add("Person 10");


        myRecyclerView = (RecyclerView)findViewById(R.id.myRevyclerView);
        myLinearLayoutManager = new LinearLayoutManager(getApplicationContext());

        myRecyclerView.setLayoutManager(myLinearLayoutManager);

        myCustomAdapter = new CustomAdapter(MainActivity.this , myArrayList);

        myRecyclerView.setAdapter(myCustomAdapter);

    }
}

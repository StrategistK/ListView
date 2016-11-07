package com.study.android.listviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Fruit> mFruitList = new ArrayList<Fruit>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFruits();
        FruitAdapter adapter = new FruitAdapter(MainActivity.this,R.layout.fruit_item,mFruitList);
        ListView listView = (ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Fruit fruit = mFruitList.get(position);
                Toast.makeText(MainActivity.this,fruit.getName(),Toast.LENGTH_LONG).show();
            }
        });
    }

    private void initFruits() {
        Fruit apple = new Fruit("Apple",R.drawable.th);
        mFruitList.add(apple);
        Fruit banana = new Fruit("Banana",R.drawable.th);
        mFruitList.add(banana);
        Fruit orange = new Fruit("Orange",R.drawable.th);
        mFruitList.add(orange);
        Fruit watermelon = new Fruit("Watermelon",R.drawable.th);
        mFruitList.add(watermelon);
        Fruit pear = new Fruit("Pear",R.drawable.th);
        mFruitList.add(pear);
        Fruit grape = new Fruit("Grape",R.drawable.th);
        mFruitList.add(grape);
        Fruit pineapple = new Fruit("Pineapple",R.drawable.th);
        mFruitList.add(pineapple);
        Fruit strawberry = new Fruit("Strawberry",R.drawable.th);
        mFruitList.add(strawberry);
        Fruit cherry = new Fruit("Cherry",R.drawable.th);
        mFruitList.add(cherry);
        Fruit mango = new Fruit("Mango",R.drawable.th);
        mFruitList.add(mango);

    }


}

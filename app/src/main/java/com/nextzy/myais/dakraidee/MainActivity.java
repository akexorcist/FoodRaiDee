package com.nextzy.myais.dakraidee;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView textViewResult;
    Button buttonRandom;
    ImageView imageViewFood;

//    ArrayList<String> foodList = new ArrayList<>();
//    foodList.add("กะเพราหมูสับ");
//    foodList.add("แกงเขียวหวาน");
//    foodList.add("ข้าวผัด");
//    foodList.add("ข้าวมันไก่");
//    foodList.add("ข้าวไข่เจียวโปะไข่ดาว");
//    List<String> foodList = Arrays.asList(
//            "กะเพราหมูสับ",
//            "แกงเขียวหวาน",
//            "ข้าวผัด",
//            "ข้าวมันไก่",
//            "ข้าวไข่เจียวโปะไข่ดาว"
//    );
//
//    List<Integer> imageList = Arrays.asList(
//            R.drawable.image_001,
//            R.drawable.image_002,
//            R.drawable.image_003,
//            R.drawable.image_004,
//            R.drawable.image_005
//    );

    List<Food> foodList = Arrays.asList(
            new Food("ข้าวกะเพราหมูสับ", R.drawable.image_001),
            new Food("แกงเขียวหวาน", R.drawable.image_002),
            new Food("ข้าวผัด", R.drawable.image_003),
            new Food("ข้าวมันไก่", R.drawable.image_004),
            new Food("ข้าวไข่เจียวโปะไข่ดาว", R.drawable.image_005)
    );

    // Primitive Data Type      Class Type
    //=====================================
    // int          ==>         Integer
    // float        ==>         Float
    // double       ==>         Double
    // boolean      ==>         Boolean


//    String[] nameList = {
//            "A",
//            "B",
//            "C"
//    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bindView();
        setupView();
    }

    private void setupView() {
        textViewResult.setVisibility(View.GONE);
        buttonRandom.setOnClickListener(this);
    }

    public void bindView() {
        textViewResult = (TextView) findViewById(R.id.textViewResult);
        buttonRandom = (Button) findViewById(R.id.buttonRandom);
        imageViewFood = (ImageView) findViewById(R.id.imageViewFood);
    }

    @Override
    public void onClick(View view) {
        if(view == buttonRandom) {
            int foodIndex = randomFoodIndex(foodList.size());
            showResult(foodIndex);
        }
    }

    private int randomFoodIndex(int max) {
        Random random = new Random();
        int index = random.nextInt(max);
        return index;
    }

    private void showResult(int foodIndex) {
        Food food = foodList.get(foodIndex);
        String name = food.getName();
        int imageResId = food.getImageResId();

        textViewResult.setText(name);
        textViewResult.setVisibility(View.VISIBLE);
        imageViewFood.setImageResource(imageResId);
    }

}

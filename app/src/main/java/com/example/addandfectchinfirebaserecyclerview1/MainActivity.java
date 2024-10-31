package com.example.addandfectchinfirebaserecyclerview1;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.addandfectchinfirebaserecyclerview1.productAdapter.ProductAdapter;
import com.example.addandfectchinfirebaserecyclerview1.productModel.ProductModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvMain;
    List<ProductModel> productModelList = new ArrayList<>();
    ProductAdapter productAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvMain = findViewById(R.id.rv_main);

        productModelList.add(new ProductModel(1, "phone", "electronics", 5000));
        productModelList.add(new ProductModel(2, "vivo phone", "electronics", 5500));
        productModelList.add(new ProductModel(3, "laptop", "electronics", 55000));
        productModelList.add(new ProductModel(4, "vivo case", "accesories", 50));
        productModelList.add(new ProductModel(5, "charger", "electronics", 1000));
        productModelList.add(new ProductModel(6, "tablet", "electronics", 7000));
        productModelList.add(new ProductModel(7, "oppo phone", "electronics", 7000));
        productModelList.add(new ProductModel(8, "ipad", "electronics", 9000));
        productModelList.add(new ProductModel(9, "realme phone", "electronics", 4000));
        productModelList.add(new ProductModel(10, "honor phone", "electronics", 7000));
        productModelList.add(new ProductModel(11, "iphone", "electronics", 71000));
        productModelList.add(new ProductModel(12, "tablet", "electronics", 7000));

        productAdapter = new ProductAdapter(productModelList);
        rvMain.setAdapter(productAdapter);
        rvMain.setLayoutManager(new LinearLayoutManager(this));
    }
}
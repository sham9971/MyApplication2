package com.example.shivam.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;
import android.widget.EditText;

public class SearchProductsActivity extends AppCompatActivity {

    private Button searchBtn ;
    private EditText inputText ;
    private RecyclerView searchList ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_products);

        inputText =findViewById(R.id.search_product_name);
        searchBtn = findViewById(R.id.search_btn);
        searchList = findViewById(R.id.search_list);

        searchList.setLayoutManager(new LinearLayoutManager(SearchProductsActivity.this));


    }
}

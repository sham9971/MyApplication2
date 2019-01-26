package com.example.shivam.myapplication;

import android.app.ActionBar;
import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class AdminCategoryActivity extends AppCompatActivity {
    private ImageView tShirts,sportsTShirts,femaleDresses,sweathers;
    private ImageView glasses,hatsCaps,walletBagsPurses,shoes;
    private ImageView headPhonesHandFree,laptops,watches,mobilePhones;

    private Button LogOutBtn,CheckOrderBtn ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_category);

        LogOutBtn = (Button) findViewById(R.id.admin_logout_btn);
        CheckOrderBtn = (Button) findViewById(R.id.check_orders_btn);

        LogOutBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(AdminCategoryActivity.this,AdminNewOrdersActivity.class);
                startActivity(intent);

            }
        });
        CheckOrderBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(AdminCategoryActivity.this,MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
                finish();
            }
        });

        tShirts=(ImageView) findViewById(R.id.t_shirts);
        sportsTShirts=(ImageView) findViewById(R.id.sports_t_shirts);
        femaleDresses=(ImageView) findViewById(R.id.female_dresses);
      sweathers=(ImageView) findViewById(R.id.sweathers);
       glasses=(ImageView) findViewById(R.id.glasses);
        hatsCaps=(ImageView) findViewById(R.id.hats_caps);
        walletBagsPurses=(ImageView) findViewById(R.id.purses_bags_wallets);
        shoes=(ImageView) findViewById(R.id.shoes);
        headPhonesHandFree=(ImageView) findViewById(R.id.headphones_handfree);
        laptops=(ImageView) findViewById(R.id.laptops);
        watches=(ImageView) findViewById(R.id.watches);
       mobilePhones=(ImageView) findViewById(R.id.mobilephones);





        tShirts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this,AdminAddNewProductActivity.class);
                intent.putExtra("category","tShirts");
                startActivity(intent);

            }
        });
        sportsTShirts.setOnClickListener(new View.OnClickListener()
        { @Override
            public void onClick(View view)
        {
            Intent intent = new Intent(AdminCategoryActivity.this,AdminAddNewProductActivity.class);
            intent.putExtra("category","sportsTShirts");
            startActivity(intent);
        }

        });
        femaleDresses.setOnClickListener(new View.OnClickListener()
        { @Override
        public void onClick(View view)
        {
            Intent intent = new Intent(AdminCategoryActivity.this,AdminAddNewProductActivity.class);
            intent.putExtra("category","femaleDresses");
            startActivity(intent);
        }

        });
        sweathers.setOnClickListener(new View.OnClickListener()
        { @Override
        public void onClick(View view)
        {
            Intent intent = new Intent(AdminCategoryActivity.this,AdminAddNewProductActivity.class);
            intent.putExtra("category","sweathers");
            startActivity(intent);
        }

        });
        glasses.setOnClickListener(new View.OnClickListener()
        { @Override
        public void onClick(View view)
        {
            Intent intent = new Intent(AdminCategoryActivity.this,AdminAddNewProductActivity.class);
            intent.putExtra("category","glasses");
            startActivity(intent);
        }

        });
        hatsCaps.setOnClickListener(new View.OnClickListener()
        { @Override
        public void onClick(View view)
        {
            Intent intent = new Intent(AdminCategoryActivity.this,AdminAddNewProductActivity.class);
            intent.putExtra("category","hatsCaps");
            startActivity(intent);
        }

        });
        walletBagsPurses.setOnClickListener(new View.OnClickListener()
        { @Override
        public void onClick(View view)
        {
            Intent intent = new Intent(AdminCategoryActivity.this,AdminAddNewProductActivity.class);
            intent.putExtra("category","walletBagsPurses");
            startActivity(intent);
        }

        });
       shoes.setOnClickListener(new View.OnClickListener()
        { @Override
        public void onClick(View view)
        {
            Intent intent = new Intent(AdminCategoryActivity.this,AdminAddNewProductActivity.class);
            intent.putExtra("category","shoes");
            startActivity(intent);
        }

        });
        headPhonesHandFree.setOnClickListener(new View.OnClickListener()
        { @Override
        public void onClick(View view)
        {
            Intent intent = new Intent(AdminCategoryActivity.this,AdminAddNewProductActivity.class);
            intent.putExtra("category","headPhonesHandFree");
            startActivity(intent);
        }

        });
     watches.setOnClickListener(new View.OnClickListener()
        { @Override
        public void onClick(View view)
        {
            Intent intent = new Intent(AdminCategoryActivity.this,AdminAddNewProductActivity.class);
            intent.putExtra("category","watches");
            startActivity(intent);
        }

        });

       mobilePhones.setOnClickListener(new View.OnClickListener()
        { @Override
        public void onClick(View view)
        {
            Intent intent = new Intent(AdminCategoryActivity.this,AdminAddNewProductActivity.class);
            intent.putExtra("category","mobilePhones");
            startActivity(intent);
        }

        });






    }
}

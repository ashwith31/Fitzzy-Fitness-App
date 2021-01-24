package com.example.fitnesscapstone.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Adapter;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.fitnesscapstone.Adapters.foodAdapter;
import com.example.fitnesscapstone.R;
import com.example.fitnesscapstone.dataModels.fooddata;

import java.util.ArrayList;

public class CalorieActivity extends AppCompatActivity implements foodAdapter.clickData {
    TextView calories_value,plan;
    EditText search;
    RecyclerView rv;
    foodAdapter adapter;
    ArrayList<fooddata> fdata=new ArrayList<>();
    int cal_sum=0;
    int intent_check=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calorie);

        calories_value=(TextView) findViewById(R.id.calact_cal);
        plan=(TextView) findViewById(R.id.calact_plan);
        search=(EditText)findViewById(R.id.calact_search);
        rv=(RecyclerView)findViewById(R.id.calact_rv);
        rv.setLayoutManager(new LinearLayoutManager(this));
        adapter=new foodAdapter(fdata,this);
            rv.setAdapter(adapter);

        search.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if(i== EditorInfo.IME_ACTION_SEARCH){
                    searchFilter(search.getText().toString());
                }
                return false;
            }
        });


        loadfood();
    }

    private void loadfood() {
        fdata.add(new fooddata("Bagel",310));
        fdata.add(new fooddata("Biscuit digestives ",480));
        fdata.add(new fooddata("Jaffa cake",370));
        fdata.add(new fooddata("Bread white (thick slice)",240 ));
        fdata.add(new fooddata("Bread wholemeal (thick)",220));
        fdata.add(new fooddata("Chapatis",300));
        fdata.add(new fooddata("Cornflakes",370));
        fdata.add(new fooddata("Crackerbread",325 ));
        fdata.add(new fooddata("Cream crackers",440));
        fdata.add(new fooddata("Macaroni (boiled)",95));
        fdata.add(new fooddata("Naan bread (normal)",320));
        fdata.add(new fooddata("Noodles (boiled)",70));
        fdata.add(new fooddata("Pasta (wholemeal boiled )",105));
        fdata.add(new fooddata("Potatoes** (boiled)",70));
        fdata.add(new fooddata("Potatoes** (roast)",140));
        fdata.add(new fooddata("Rice (white boiled)",140));
        fdata.add(new fooddata("Rice (egg-fried)",200));
        fdata.add(new fooddata("Rice ( Brown )",135 ));
        fdata.add(new fooddata("Rice cakes",373));
        fdata.add(new fooddata("Ryvita Multi grain",331));
        fdata.add(new fooddata("Chicken",200));
        fdata.add(new fooddata("Crab fresh",110 ));
        fdata.add(new fooddata("Duck roast",430));
        fdata.add(new fooddata("Fish cake",200));
        fdata.add(new fooddata("Liver",150));
        fdata.add(new fooddata("Lamb (roast)",300));
        fdata.add(new fooddata("Prawns",100));
        fdata.add(new fooddata("Pork",290));
        fdata.add(new fooddata("Salmon fresh",180));
        fdata.add(new fooddata("Sausage roll",480));
        fdata.add(new fooddata("Turkey",160 ));
        fdata.add(new fooddata("Apple",44));
        fdata.add(new fooddata("Banana",65));
        fdata.add(new fooddata("Beans baked beans",80));
        fdata.add(new fooddata("Blackberries",25));
        fdata.add(new fooddata("Broccoli",32 ));
        fdata.add(new fooddata("Cabbage (boiled)",20));
        fdata.add(new fooddata("Carrot (boiled)",25 ));
        fdata.add(new fooddata("Cauliflower (boiled)",30));
        fdata.add(new fooddata("Cucumber",10));
        fdata.add(new fooddata("Grapes",62));
        fdata.add(new fooddata("Kiwi",50));
        fdata.add(new fooddata("Melon",28));
        fdata.add(new fooddata("Mushrooms (boiled)",12));
        fdata.add(new fooddata("One red Onion",33));
        fdata.add(new fooddata("Orange",30 ));
        fdata.add(new fooddata("Pear",38));
        fdata.add(new fooddata("Pineapple",40));
        fdata.add(new fooddata("Tomato",20));
        fdata.add(new fooddata("Sweetcorn",130));
        fdata.add(new fooddata("Cottage cheese",98));
        fdata.add(new fooddata("Eggs ( 1 average size)",150 ));

        fdata.add(new fooddata("Eggs fried",180));
        fdata.add(new fooddata("Ice cream",180));
        fdata.add(new fooddata("Milk Soya",36));
        fdata.add(new fooddata("Yogurt natural",60 ));



        adapter.notifyDataSetChanged();

    }


    //intent plans
    public void gotoplan(View view) {
        if(intent_check==1){
            Intent intent=new Intent(CalorieActivity.this,BasicPlanActivity.class);
            startActivity(intent);
        }
        if(intent_check==2){
            Intent intent=new Intent(CalorieActivity.this,IntemActivity.class);
            startActivity(intent);
        }
        if(intent_check==3){
            Intent intent=new Intent(CalorieActivity.this,AdvanceActivity.class);
            startActivity(intent);
        }
    }


    public void searchFilter(String s){
       ArrayList<fooddata> tempfdata=new ArrayList<>();

       for (fooddata f:fdata){
           if (f.getFood().toLowerCase().contains(s.toLowerCase())) {
               tempfdata.add(f);
           }
       }

       foodAdapter adapter1=new foodAdapter(tempfdata,this);
       rv.setAdapter(adapter1);
    }

    @Override
    public void click_data(int cal) {
        cal_sum=cal_sum+cal;
        calories_value.setText(""+(cal_sum));

        if(cal_sum<2500){
            plan.setText("Basic plan suits your eating habits");
            intent_check=1;
        }if(cal_sum>2500 && cal_sum<3500){
            plan.setText("Intrmediate plan suits your eating habits");
            intent_check=2;

        }if(cal_sum>3500){
            plan.setText("Advance plan suits your eating habits");
            intent_check=3;
        }
    }
}

package com.example.universalsearch;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    RadioButton rbGoogle, rbYahoo, rbBing, rbDuckDuckGo;
    RadioGroup radioGroup;
    Button btnSearch;
    EditText etSearch;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        etSearch = findViewById(R.id.etSearch);
        radioGroup = findViewById(R.id.radioGroup);
        btnSearch = findViewById(R.id.btnSearch);

        btnSearch.setOnClickListener(v -> search());
    }

    private void search() {
        String text = etSearch.getText().toString().trim();
        String url;
        int selectedID = radioGroup.getCheckedRadioButtonId();
        if (selectedID == rbYahoo){
            url = "https://search.yahoo.com/search?p=";
        } else if (selectedID == R.id.rbDuckDuckGo){
            url = "";
        }

    }


}
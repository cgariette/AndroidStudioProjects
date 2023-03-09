package com.book.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView pdfListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pdfListView = (ListView) findViewById(R.id.PDFList);

        String[] pdfiles = {"Foreward",
                            "EDITORIAL NOTE",
                            "List of abbreviations",
                            "Table of Content",
                            "Key Antimicrobial Stewardship Principles",
                            "Specimen Collection",
                            "Antibiotic Prescribing Algorithm",
                            "Patient Risk Stratification",
                            "Surgical Prophylaxis",
                            "General Principles",
                            "Indication for additional doses",
                            "Treatment Algorithms",
                            "List of Contributors",
                            "Hand Washing Technique"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>( context: this, android.R.layout.simple_list_item_1) {

        }


    }
}
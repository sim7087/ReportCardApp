package com.reportapp071997.reportcard;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

import static com.reportapp071997.reportcard.R.layout.activity_main;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_main);

        ArrayList<ReportCard> subject = new ArrayList<ReportCard>();
        subject.add(new ReportCard("1. Simran","++A",93,'A',85.75));
        subject.add(new ReportCard("2. Jaskirat","-A",73,'A',90.75));
        subject.add(new ReportCard("3. Tushar","+B",83,'B',80));
        subject.add(new ReportCard("4. Sumat","C",90,'C',75.75));
        subject.add(new ReportCard("5. Sonal","+C",89,'B',60.75));
        subject.add(new ReportCard("6. Ramneek","+F",100,'O',81.75));
        subject.add(new ReportCard("7. Charu","--A",100,'B',90.75));
        subject.add(new ReportCard("8. Sakshi","+A",53,'O',90.75));

       GradeAdapter itemsAdapter = new GradeAdapter(this,subject);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

    }

}

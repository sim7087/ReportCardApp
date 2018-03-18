package com.reportapp071997.reportcard;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by abc on 01-02-2018.
 */

public class GradeAdapter extends ArrayAdapter<ReportCard> {

    public GradeAdapter(Activity context, ArrayList<ReportCard> grades) {
        super(context, 0, grades);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ReportCard currentReportCard = getItem(position);
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.layout_grades, parent, false);
        }





        TextView math = (TextView) listItemView.findViewById(R.id.math_text_view);

        math.setText(Integer.toString(currentReportCard.getMathsGrade()));


        TextView english = (TextView) listItemView.findViewById(R.id.english_text_view);

        english.setText(currentReportCard.getEnglishGrade());
        TextView hindi = (TextView) listItemView.findViewById(R.id.hindi_text_view);

        hindi.setText(Character.toString(currentReportCard.getHindiGrade()));

        TextView science = (TextView) listItemView.findViewById(R.id.science_text_view);

        science.setText(Double.toString(currentReportCard.getHindiGrade()));

        TextView studentName = (TextView) listItemView.findViewById(R.id.student_text_view);

        studentName.setText(currentReportCard.getStudentName());

        return listItemView;
    }
}

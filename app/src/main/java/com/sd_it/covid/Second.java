package com.sd_it.covid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Second extends AppCompatActivity {
TextView tv1,tv2,tv3,tv4,tv5,cont;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        final TextView tv1=(TextView)findViewById(R.id.tv1);
        final TextView tv2=(TextView)findViewById(R.id.tv2);
        final TextView tv3=(TextView)findViewById(R.id.tv3);
        final TextView tv4=(TextView)findViewById(R.id.tv4);
        final TextView tv5=(TextView)findViewById(R.id.tv5);
        final TextView cont=(TextView)findViewById(R.id.cont);
        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setBackground(getApplication().getResources().getDrawable(R.drawable.colour2));
                tv2.setBackground(getApplication().getResources().getDrawable(R.drawable.colour1));
                tv3.setBackground(getApplication().getResources().getDrawable(R.drawable.colour1));
                tv4.setBackground(getApplication().getResources().getDrawable(R.drawable.colour1));
                tv5.setBackground(getApplication().getResources().getDrawable(R.drawable.colour1));
                cont.setText("The Corona virus is a terrible virus around the world." +
                        "The virus has left the world in the palm of your hand.Today, " +
                        "people do not know how to get rid of this virus and how to" +
                        " get back to it." +
                        "Lockdown is rampant throughout this virus." +
                        "As a result, the financial situation is worsening." +
                        "The shop's office is closed for viruses. " +
                        "This time we have to be in a closed room " +
                        "We must always see that the distance with each human being is 4 meters." +
                        "We are promising that we will stay home and save lives this time");
            }
        });
        tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv2.setBackground(getApplication().getResources().getDrawable(R.drawable.colour2));
                tv1.setBackground(getApplication().getResources().getDrawable(R.drawable.colour1));
                tv3.setBackground(getApplication().getResources().getDrawable(R.drawable.colour1));
                tv4.setBackground(getApplication().getResources().getDrawable(R.drawable.colour1));
                tv5.setBackground(getApplication().getResources().getDrawable(R.drawable.colour1));
                cont.setText("Prime Minister Narendra Modi  today said, social" +
                        " organisations have a big role to play in countering " +
                        "superstitions, wrong beliefs and misinformation. " +
                        "The Prime Minister was interacting with representatives of organizations" +
                        " working for social welfare, via video conference. He appealed to them to " +
                        "spread awareness about the COVID-19 outbreak. Mr. Modi added that people were" +
                        " seen gathered in places and flouting social distancing norms in the name of belief. " +
                        "He said, it is necessary to highlight the importance of maintaining social distancing during this time.\n" +

                        "Mr. Modi said, the entire nation is " +
                        "displaying immense resilience, grit and patience in facing" +
                        " the challenge of the virus outbreak.\n" +
                        "Recalling Mahatma Gandhi's words, that serving" +
                        " the poor and downtrodden is the best way to serve the nation, " +
                        "the Prime Minister praised the dedication and commitment of organizations " +
                        "participating in the video conference, towards serving humanity." );
                        }
        });
        tv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv3.setBackground(getApplication().getResources().getDrawable(R.drawable.colour2));
                tv1.setBackground(getApplication().getResources().getDrawable(R.drawable.colour1));
                tv2.setBackground(getApplication().getResources().getDrawable(R.drawable.colour1));
                tv4.setBackground(getApplication().getResources().getDrawable(R.drawable.colour1));
                tv5.setBackground(getApplication().getResources().getDrawable(R.drawable.colour1));
                cont.setText("Raising awareness of antimicrobial resistance " +
                        "and promoting behavioural change through public " +
                        "communication programmes that target different audiences in human health," +
                        " animal health and agricultural practice as well as consumers is critical to " +
                        "tackling this issue. Including the use of antimicrobial agents and resistance in " +
                        "school curricula will also promote a better understanding and awareness from an early age.\n" +
                        "Making antimicrobial resistance a core component of professional " +
                        "education, training, certification, continuing education and development" +
                        " in the health and veterinary sectors and agricultural practice will help " +
                        "to ensure proper understanding and awareness among professionals.");
            }
        });
        tv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv4.setBackground(getApplication().getResources().getDrawable(R.drawable.colour2));
                tv1.setBackground(getApplication().getResources().getDrawable(R.drawable.colour1));
                tv3.setBackground(getApplication().getResources().getDrawable(R.drawable.colour1));
                tv2.setBackground(getApplication().getResources().getDrawable(R.drawable.colour1));
                tv5.setBackground(getApplication().getResources().getDrawable(R.drawable.colour1));
                cont.setText("Health workers are at the front line of the COVID-19 outbreak response and as such are exposed to hazards that put them at risk of infection. Hazards include pathogen exposure, long working hours, psychological distress, fatigue, occupational burnout, stigma, and physical and psychological violence. This document highlights the rights and responsibilities of health workers, including the specific measures needed to protect occupational safety and health." +

                        "\nThere are no medicines available to treat COVID-19—yet. That hasn't stopped hundreds of studies from being launched in the first months of the COVID-19 global pandemic. Read on to learn what approaches scientists think might work to relieve COVID-19 symptoms, what drugs may cure serious cases, and other drugs that might prevent infection. See what these investigational drugs may have to offer in the fight against COVID-19.");            }
        });
        tv5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv5.setBackground(getApplication().getResources().getDrawable(R.drawable.colour2));
                tv1.setBackground(getApplication().getResources().getDrawable(R.drawable.colour1));
                tv3.setBackground(getApplication().getResources().getDrawable(R.drawable.colour1));
                tv4.setBackground(getApplication().getResources().getDrawable(R.drawable.colour1));
                tv2.setBackground(getApplication().getResources().getDrawable(R.drawable.colour1));
                cont.setText("Tourism is currently one of the most affected sectors and UNWTO has revised its 2020 forecast for international arrivals and receipts, though emphasizes that such any predictions are likely to be further revised.\n" +
                        "\n" +
                        "Against a backdrop of travel restrictions being introduced, UNWTO underscores the importance of international dialogue and cooperation and emphasizes the COVID-19 challenge also represents an opportunity to show how solidarity can go beyond borders." +
                        "");
            }
        });
    }
}

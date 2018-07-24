package sg.edu.rp.c346.boxlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvColours;
    ArrayList<ColourDisplay> ListViewColour;
    CustomAdapter caColour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvColours = findViewById(R.id.ListViewColour);

        ListViewColour = new ArrayList<>();

        ColourDisplay box1 = new ColourDisplay("blue");
        ColourDisplay box2 = new ColourDisplay("orange");
        ColourDisplay box3 = new ColourDisplay("brown");

        ListViewColour.add(box1);
        ListViewColour.add(box2);
        ListViewColour.add(box3);

        caColour = new CustomAdapter(this,R.layout.boxlist,ListViewColour);

        lvColours.setAdapter(caColour);
    }
}

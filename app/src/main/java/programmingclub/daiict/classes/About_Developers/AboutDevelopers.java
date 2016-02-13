package programmingclub.daiict.classes.About_Developers;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import programmingclub.daiict.R;

/**
 * Created by spock on 1/8/15.
 */
public class AboutDevelopers extends Activity {


    ListView list;
    String[] developers = {
            "Utsav Vyas",
            "Parth Panchal",
            "Omkar Damle",
            "Aditya Joglekar",
            "Rajdeep Pinge"
    } ;
    Integer[] imageId = {
            R.drawable.utsav,
            R.drawable.parth,
            R.drawable.omkardp1,
            R.drawable.aditya_dp,
            R.drawable.rajdeep,

    };

    String[] email = {
            "utsavvyas16\n@gmail.com",
            "parthpanchal12196\n@gmail.com",
            "omkarvdamle13\n@gmail.com",
            "joglekara1\n@gmail.com",
            "rajpinge\n@gmail.com"
    }
            ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_developers);

        CustomList adapter = new
                CustomList(AboutDevelopers.this, developers, imageId,email);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);
    }
}

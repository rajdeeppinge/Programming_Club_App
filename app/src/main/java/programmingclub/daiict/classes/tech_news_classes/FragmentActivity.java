package programmingclub.daiict.classes.tech_news_classes;

// this class is used as a holder for the various fragments of news meant to be displayed.
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import programmingclub.daiict.R;

/**
 * Created by omkar13 on 12/20/2015.
 */
public class FragmentActivity extends android.support.v4.app.FragmentActivity {


    public void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.rss_news_fragment_container); //an empty frame layout

        Bundle b = getIntent().getExtras();

        int no=b.getInt("feedNo"); //tells us which fragment to load

        switch(no){
            case 1: addPCWorldFragment();
                break;
            case 2: addTechFragment();
                break;
            case 3: addAndroidFragment();
                break;
            case 4: addStartUpFragment();
                break;
            case 5: addGamingFragment();
                break;
            case 6: addOpenSourceFragment();
                break;
            case 7: addInternetFragment();
                break;
            case 8: addSoftwareFragment();
                break;
        }
}
//currently 8 fragments have been made
// if you want ot add more sites add them here and make 2 classes for each - the fragment class and the service class


    public void addPCWorldFragment(){
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        PCWorldRssFragment fragment = new PCWorldRssFragment();
        transaction.add(R.id.fragment_container, fragment);

        transaction.commit();
    }

    public void addTechFragment() {
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        TechnologyAppRssFragment fragment = new TechnologyAppRssFragment();
        transaction.add(R.id.fragment_container, fragment);

        transaction.commit();
    }

    public void addAndroidFragment() {
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        AndroidRssFragment fragment = new AndroidRssFragment();
        transaction.add(R.id.fragment_container, fragment);

        transaction.commit();
    }


    public void addStartUpFragment(){
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        StartUpRssFragment fragment=new StartUpRssFragment();
        transaction.add(R.id.fragment_container, fragment);

        transaction.commit();


    }


    public void addGamingFragment(){
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        GamingRssFragment fragment=new GamingRssFragment();
        transaction.add(R.id.fragment_container, fragment);

        transaction.commit();


    }

    public void addOpenSourceFragment(){
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        OpenSourceRssFragment fragment=new OpenSourceRssFragment();
        transaction.add(R.id.fragment_container, fragment);

        transaction.commit();


    }
    public void addInternetFragment(){
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        InternetRssFragment fragment=new InternetRssFragment();
        transaction.add(R.id.fragment_container, fragment);

        transaction.commit();


    }
    public void addSoftwareFragment(){
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        SoftwareRssFragment fragment=new SoftwareRssFragment();
        transaction.add(R.id.fragment_container, fragment);

        transaction.commit();


    }

}

package in.shrey.gridrecycler;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import in.shrey.gridrecycler.MenuGridPage.ImageAdapter;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    public static int[] gridImage = {
            R.drawable.login,
            R.drawable.map,
            R.drawable.calender,
            R.drawable.chat,
            R.drawable.news,
            R.drawable.notices,
            R.drawable.video,
            R.drawable.emegency,
            R.drawable.services,
            R.drawable.ratethisapp,
    };
    public static String[] gridText = {
            "Login",
            "Map",
            "Calender",
            "Chat",
            "News",
            "Notices",
            "Video",
            "Emergency",
            "Services",
            "RateThisApp",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerViewGrid);
        GridLayoutManager layoutManager = new GridLayoutManager(getApplicationContext(), 3);
        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(new ImageAdapter(this));


    }

}

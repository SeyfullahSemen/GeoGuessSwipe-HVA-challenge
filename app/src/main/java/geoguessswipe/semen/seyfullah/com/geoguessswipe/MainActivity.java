package geoguessswipe.semen.seyfullah.com.geoguessswipe;

import android.graphics.Canvas;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;

import java.util.ArrayList;
import java.util.List;

import geoguessswipe.semen.seyfullah.com.geoguessswipe.Adapters.GeoObjectAdapter;
import geoguessswipe.semen.seyfullah.com.geoguessswipe.Classes.GeoObject;
import geoguessswipe.semen.seyfullah.com.geoguessswipe.Classes.SwipeController;
import geoguessswipe.semen.seyfullah.com.geoguessswipe.Classes.SwipeControllerActions;

public class MainActivity extends AppCompatActivity {
    SwipeController swipeController = null;
    GeoObjectAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setGeoLocationDataAdapter();
        setupRecyclerView();


    }

    private void setGeoLocationDataAdapter() {
        List<GeoObject> mGeoObjects = new ArrayList<>();
        for (int i = 0; i < GeoObject.PRE_DEFINED_GEO_OBJECT_IMAGE_IDS.length; i++) {
            mGeoObjects.add(new GeoObject(GeoObject.PRE_DEFINED_GEO_OBJECT_IMAGE_IDS[i]));
        }

        mAdapter = new GeoObjectAdapter(mGeoObjects);
    }

    private void setupRecyclerView() {
        RecyclerView mGeoRecyclerView = findViewById(R.id.recyclerview);

        mGeoRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        mGeoRecyclerView.setAdapter(mAdapter);

        swipeController = new SwipeController(new SwipeControllerActions() {
            @Override
            public void onRightClicked(int position) {
                mAdapter.listGeoObject.remove(position);
                mAdapter.notifyItemRemoved(position);
                mAdapter.notifyItemRangeChanged(position, mAdapter.getItemCount());
            }
        });

        ItemTouchHelper itemTouchhelper = new ItemTouchHelper(swipeController);
        itemTouchhelper.attachToRecyclerView(mGeoRecyclerView);

        mGeoRecyclerView.addItemDecoration(new RecyclerView.ItemDecoration() {
            @Override
            public void onDraw(Canvas c, RecyclerView parent, RecyclerView.State state) {
                swipeController.onDraw(c);
            }
        });
    }
}

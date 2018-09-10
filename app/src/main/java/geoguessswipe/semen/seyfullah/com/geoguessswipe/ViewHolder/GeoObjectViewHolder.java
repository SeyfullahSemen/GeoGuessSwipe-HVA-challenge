package geoguessswipe.semen.seyfullah.com.geoguessswipe.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import geoguessswipe.semen.seyfullah.com.geoguessswipe.R;


/*
 * Created by Seyfullah Semen on 5-9-2018.
 */
public class GeoObjectViewHolder extends RecyclerView.ViewHolder {
    public ImageView geoImage;
    public View view;


    public GeoObjectViewHolder(View itemView) {
        super(itemView);
        geoImage = itemView.findViewById(R.id.geoImageView);
        view = itemView;

    }
}

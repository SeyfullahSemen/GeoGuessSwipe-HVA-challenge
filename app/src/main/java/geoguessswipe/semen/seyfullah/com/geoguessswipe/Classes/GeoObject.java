package geoguessswipe.semen.seyfullah.com.geoguessswipe.Classes;


import geoguessswipe.semen.seyfullah.com.geoguessswipe.R;

/*
 * Created by Seyfullah Semen on 5-9-2018.
 */
public class GeoObject {

    private int mGeoImageName;
    private boolean isEurope;


    public int getmGeoImageName() {
        return mGeoImageName;
    }

    public void setmGeoImageName(int mGeoImageName) {
        this.mGeoImageName = mGeoImageName;
    }

    public boolean getIsEurope() {
        return isEurope;
    }


    public static final String[] PRE_DEFINED_GEO_OBJECT_NAMES = {
            "Denmark",
            "Canada",
            "Bangladesh",
            "Kazachstan",
            "Colombia",
            "Poland",
            "Malta",
            "Thailand"
    };

    public static final boolean IS_IN_EUROPE[] = {
            true,
            false,
            false,
            true,
            false,
            true,
            true,
            false
    };

    public static final int[] PRE_DEFINED_GEO_OBJECT_IMAGE_IDS = {
            R.drawable.img1_yes_denmark,
            R.drawable.img2_no_canada,
            R.drawable.img3_no_bangladesh,
            R.drawable.img4_yes_kazachstan,
            R.drawable.img5_no_colombia,
            R.drawable.img6_yes_poland,
            R.drawable.img7_yes_malta,
            R.drawable.img8_no_thailand
    };

    public GeoObject(int position) {
        this.mGeoImageName = PRE_DEFINED_GEO_OBJECT_IMAGE_IDS[position];
        this.isEurope = IS_IN_EUROPE[position];
    }

}

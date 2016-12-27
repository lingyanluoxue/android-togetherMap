package xiaomi.mich.com.android_togethermap.together;

import com.amap.api.maps.model.Marker;

/**
 * Created by zhanghongmei on 2016/12/27.
 */

public class ClusterAmapItem {

    //对应的网络数据
    private Marker marker;

    //marker的url
    private String markerUrl;

    public Marker getMarker() {
        return marker;
    }

    public void setMarker(Marker marker) {
        this.marker = marker;
    }

    public String getMarkerUrl() {
        return markerUrl;
    }

    public void setMarkerUrl(String markerUrl) {
        this.markerUrl = markerUrl;
    }
}

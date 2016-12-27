package xiaomi.mich.com.android_togethermap.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by aaron on 2016/10/17.
 */

public class DotInfo {

    private String dotId;
    private double dotLat;
    private double dotLon;
    private String dotIcon;


    public String getDotId() {
        return dotId;
    }

    public void setDotId(String dotId) {
        this.dotId = dotId;
    }

    public double getDotLat() {
        return dotLat;
    }

    public void setDotLat(double dotLat) {
        this.dotLat = dotLat;
    }

    public double getDotLon() {
        return dotLon;
    }

    public void setDotLon(double dotLon) {
        this.dotLon = dotLon;
    }

    public String getDotIcon() {
        return dotIcon;
    }

    public void setDotIcon(String dotIcon) {
        this.dotIcon = dotIcon;
    }

    /**
     * 初始化数据
     * @return
     */
    public static List<DotInfo> initData() {
        String iconPath = "http://60.205.146.135:8080/nav/upload/file/fcfa1c12-7576-40b6-94e0-b496d284ab44.png";
        List<DotInfo> dotInfoList = new ArrayList<>();

        DotInfo dotInfo1 = new DotInfo();
        dotInfo1.setDotLat(39.976318);
        dotInfo1.setDotLon(116.318988);
        dotInfo1.setDotId("dotInfo1");
        dotInfo1.setDotIcon(iconPath);
        dotInfoList.add(dotInfo1);

        DotInfo dotInfo2 = new DotInfo();
        dotInfo2.setDotLat(40.045813);
        dotInfo2.setDotLon(116.304504);
        dotInfo2.setDotId("dotInfo2");
        dotInfo2.setDotIcon(iconPath);
        dotInfoList.add(dotInfo2);

        DotInfo dotInfo3 = new DotInfo();
        dotInfo3.setDotLat(39.923347);
        dotInfo3.setDotLon(116.507537);
        dotInfo3.setDotId("dotInfo3");
        dotInfo3.setDotIcon(iconPath);
        dotInfoList.add(dotInfo3);

        DotInfo dotInfo4 = new DotInfo();
        dotInfo4.setDotLat(39.91125);
        dotInfo4.setDotLon(116.477378);
        dotInfo4.setDotId("dotInfo4");
        dotInfo4.setDotIcon(iconPath);
        dotInfoList.add(dotInfo4);

        DotInfo dotInfo5 = new DotInfo();
        dotInfo5.setDotLat(40.041337);
        dotInfo5.setDotLon(116.312181);
        dotInfo5.setDotId("dotInfo5");
        dotInfo5.setDotIcon(iconPath);
        dotInfoList.add(dotInfo5);

        DotInfo dotInfo6 = new DotInfo();
        dotInfo6.setDotLat(39.971879);
        dotInfo6.setDotLon(116.306446);
        dotInfo6.setDotId("dotInfo6");
        dotInfo6.setDotIcon(iconPath);
        dotInfoList.add(dotInfo6);

        DotInfo dotInfo7 = new DotInfo();
        dotInfo7.setDotLat(40.002434);
        dotInfo7.setDotLon(116.463232);
        dotInfo7.setDotId("dotInfo7");
        dotInfo7.setDotIcon(iconPath);
        dotInfoList.add(dotInfo7);

        DotInfo dotInfo8 = new DotInfo();
        dotInfo8.setDotLat(39.980959);
        dotInfo8.setDotLon(116.331772);
        dotInfo8.setDotId("dotInfo8");
        dotInfo8.setDotIcon(iconPath);
        dotInfoList.add(dotInfo8);

        DotInfo dotInfo9 = new DotInfo();
        dotInfo9.setDotLat(39.925659);
        dotInfo9.setDotLon(116.508567);
        dotInfo9.setDotId("dotInfo9");
        dotInfo9.setDotIcon(iconPath);
        dotInfoList.add(dotInfo9);

        DotInfo dotInfo10 = new DotInfo();
        dotInfo10.setDotLat(39.88543);
        dotInfo10.setDotLon(116.461778);
        dotInfo10.setDotId("dotInfo10");
        dotInfo10.setDotIcon(iconPath);
        dotInfoList.add(dotInfo10);

        DotInfo dotInfo11 = new DotInfo();
        dotInfo11.setDotLat(39.98343);
        dotInfo11.setDotLon(116.311843);
        dotInfo11.setDotId("dotInfo11");
        dotInfo11.setDotIcon(iconPath);
        dotInfoList.add(dotInfo11);

        DotInfo dotInfo12 = new DotInfo();
        dotInfo12.setDotLat(40.029849);
        dotInfo12.setDotLon(116.313302);
        dotInfo12.setDotId("dotInfo12");
        dotInfo12.setDotIcon(iconPath);
        dotInfoList.add(dotInfo12);

        DotInfo dotInfo13 = new DotInfo();
        dotInfo13.setDotLat(36.467939);
        dotInfo13.setDotLon(115.997571);
        dotInfo13.setDotId("dotInfo13");
        dotInfo13.setDotIcon(iconPath);
        dotInfoList.add(dotInfo13);

        DotInfo dotInfo14 = new DotInfo();
        dotInfo14.setDotLat(36.857609);
        dotInfo14.setDotLon(118.81726);
        dotInfo14.setDotId("dotInfo14");
        dotInfo14.setDotIcon(iconPath);
        dotInfoList.add(dotInfo14);

        DotInfo dotInfo15 = new DotInfo();
        dotInfo15.setDotLat(36.857369);
        dotInfo15.setDotLon(118.813483);
        dotInfo15.setDotId("dotInfo15");
        dotInfo15.setDotIcon(iconPath);
        dotInfoList.add(dotInfo15);

        DotInfo dotInfo16 = new DotInfo();
        dotInfo16.setDotLat(36.86053);
        dotInfo16.setDotLon(118.802071);
        dotInfo16.setDotId("dotInfo16");
        dotInfo16.setDotIcon(iconPath);
        dotInfoList.add(dotInfo16);

        DotInfo dotInfo17 = new DotInfo();
        dotInfo17.setDotLat(36.857094);
        dotInfo17.setDotLon(118.776876);
        dotInfo17.setDotId("dotInfo17");
        dotInfo17.setDotIcon(iconPath);
        dotInfoList.add(dotInfo17);

        DotInfo dotInfo18 = new DotInfo();
        dotInfo18.setDotLat(36.85641);
        dotInfo18.setDotLon(118.7707);
        dotInfo18.setDotId("dotInfo18");
        dotInfo18.setDotIcon(iconPath);
        dotInfoList.add(dotInfo18);

        DotInfo dotInfo19 = new DotInfo();
        dotInfo19.setDotLat(19.603086);
        dotInfo19.setDotLon(110.757545);
        dotInfo19.setDotId("dotInfo19");
        dotInfo19.setDotIcon(iconPath);
        dotInfoList.add(dotInfo19);

        return dotInfoList;
    }
}

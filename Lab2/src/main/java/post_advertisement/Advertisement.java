package post_advertisement;

import java.awt.image.BufferedImage;

public class Advertisement {
    private String adName;
    private String adDescription;
    private BufferedImage adPreview;

    public String getAdName() {
        return adName;
    }

    public void setAdName(String adName) {
        this.adName = adName;
    }

    public String getAdDescription() {
        return adDescription;
    }

    public void setAdDescription(String adDescription) {
        this.adDescription = adDescription;
    }

    public BufferedImage getAdPreview() {
        return adPreview;
    }

    public void setAdPreview(BufferedImage adPreview) {
        this.adPreview = adPreview;
    }
}

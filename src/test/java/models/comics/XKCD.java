package models.comics;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class XKCD {

    @JsonProperty("safe_title")
    private String safeTitle;
    private String img;

    public String getSafeTitle() {
        return safeTitle;
    }

    public void setSafeTitle(String safeTitle) {
        this.safeTitle = safeTitle;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}

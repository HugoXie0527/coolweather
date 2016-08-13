package app.coolweather.hugo_xie.com.coolweather.model;

/**
 * Created by Hugo_Xie on 2016/8/13.
 */
public class County {
    private int id ;
    private String countyName;
    private String coyntyCode;
    private int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getCoyntyCode() {
        return coyntyCode;
    }

    public void setCoyntyCode(String coyntyCode) {
        this.coyntyCode = coyntyCode;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}

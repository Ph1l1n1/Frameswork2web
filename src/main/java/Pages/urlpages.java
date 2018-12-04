package Pages;

public enum urlpages {
    url("Page_Mobile_tariffs");

    private String wlc;

    urlpages(String wlc) {
        this.wlc = wlc;
    }

    public String getwlc(String wlc) {
        this.wlc = wlc;
        return wlc;
    }

    public String getWlc() {
        return wlc;
    }



}

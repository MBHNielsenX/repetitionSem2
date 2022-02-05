public class Bog {
    private int iSBNNumber;
    private String title;
    private int releaseYear;

    public Bog(int iSBNNumber, String title, int releaseYear) {
        this.iSBNNumber = iSBNNumber;
        this.title = title;
        this.releaseYear = releaseYear;
    }

    public int getiSBNNumber() {
        return iSBNNumber;
    }

    public void setiSBNNumber(int iSBNNumber) {
        this.iSBNNumber = iSBNNumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    @Override
    public String toString() {
        return "Bog{" +
                "iSBNNumber=" + iSBNNumber +
                ", title='" + title + '\'' +
                ", releaseYear=" + releaseYear +
                '}';
    }
}


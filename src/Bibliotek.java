import java.util.ArrayList;

public class Bibliotek {
    private ArrayList<Bog> bookList;

    public Bibliotek(ArrayList<Bog> bookList) {
        this.bookList = bookList;
    }

    public ArrayList<Bog> getBookList() {
        return bookList;
    }

    public boolean checkISBNNum (Bog currentBook) {
        boolean validation = false;
        for (int i = 0; i < getBookList().size(); i++) {
            if (currentBook.getiSBNNumber() == getBookList().get(i).getiSBNNumber()) {
                validation = true;
            }
        }


        return validation;
    }

}


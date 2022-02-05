import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //Opgave 2 Bog
        Bog jJRMartin = new Bog(3345,"Ringenes Herre", 1967);
        Bog wilburSmith = new Bog(4444, "Warlock", 1969);
        Bog tolkien = new Bog(3333, "Game of Thrones", 1989);

        ArrayList<Bog> fantasy = new ArrayList<Bog>();
        fantasy.add(jJRMartin);
        fantasy.add(wilburSmith);
        fantasy.add(tolkien);

        Bog andersMathesen = new Bog(5692, "Djævlens Lærling" , 2008);
        Bog testISBN = new Bog(3333, "test" , 2022);

        Bibliotek koegeBibliotek = new Bibliotek(fantasy);

        System.out.println(koegeBibliotek.checkISBNNum(andersMathesen));
        System.out.println(koegeBibliotek.checkISBNNum(testISBN));


    }
}

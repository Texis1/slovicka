package eu.ciganek.slovicka;

/**
 * Created by z003mkuc on 22.12.2016.
 */

class Word {

    public Word(String foreign, String translation, String note, Boolean known) {
        super();
        this.foreign = foreign;
        this.translation = translation;
        this.note = note;
        this.known = known;

    }

    String foreign;
    String translation;
    String note;
    Boolean known;
}

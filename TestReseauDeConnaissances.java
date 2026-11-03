package TP03;

public class TestReseauDeConnaissances {
    public static void main(String[] args) {
        Lyumine grandLyumine = new Lyumine("GrandLyumine");
        Lyumine lyuminePapa = new Lyumine("LyuminePapa");
        grandLyumine.apprendreQueEstNe(lyuminePapa);
        Lyumine lyumineMama = new Lyumine("LyumineMama");
        grandLyumine.apprendreQueEstNe(lyumineMama);
        lyuminePapa.apprendreQueEstNe(lyumineMama);
        lyumineMama.apprendreQueEstNe(lyuminePapa);
        lyuminePapa.direLyuminesConnus();
        lyumineMama.direLyuminesConnus();
        Lyumine lyuminePetit = new Lyumine("LyuminePetit");
        grandLyumine.apprendreQueEstNe(lyuminePetit);
        lyuminePetit.direLyuminesConnus();
        grandLyumine.fairePresentationDesConnaissances();
        lyuminePetit.direLyuminesConnus();
        lyumineMama.direLyuminesConnus();
 }
}

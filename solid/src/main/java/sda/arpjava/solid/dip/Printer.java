package sda.arpjava.solid.dip;


// Interfejs drukarki definiuje zchowanie wszystkich drukarek,
// a każda implementacja zajmuje się niskopoziomowymi szczegółami
public interface Printer {

    void print(String string);

    void configure(double resolution);
}

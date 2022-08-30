package sda.arpjava.solid.ocp;

public class PictureDemo {
    public static void main(String[] args) {
        //Klasa Picture ignoruje dodanie nowej klasy Line
        Picture picture = new Picture();

        picture.add(new Rectangle());
        picture.add(new Circle());
        picture.add(new Line());
        picture.draw();

        System.out.println("********************");

        //Klasa OpenPicture uwzględnia klasę Line
        OpenPicture openPicture = new OpenPicture();

        openPicture.add(new Rectangle());
        openPicture.add(new Circle());
        openPicture.add(new Line());
        openPicture.draw();
    }
}

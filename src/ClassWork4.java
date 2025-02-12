public class ClassWork4 {
    public static void main(String[] args) {
        //psv


        //  8 peremennix
        // boolet logica
        // true  folse 0 ili 1

        boolean raining = true; //false
        System.out.println(raining);
        raining = true;
        System.out.println("raining");
        int teaTemperature = 85;
        boolean hot = (85 > 100);
        System.out.println("hot");


        double myTemperature = 37.5;
        double normalTemperatur = 36.6;
        boolean ill = (myTemperature > normalTemperatur);
        System.out.println("ill");

        int boulingStrike = 10;
        int myScore = 0;
        boolean caniGetStrice = (boulingStrike == myScore);

        System.out.println(caniGetStrice);
        // esli he odinakobi to true
        //esli odinakoviy bto false

        int firstPerson = 181;
        int secondPerson = 181;
        boolean similar = (firstPerson >= secondPerson);
        System.out.println(similar);
        //< > == ravno  !=-neravno  !-otricanie ,>= <=

        // dala 1000 ostlos 1000 chto kupil Vasya ' kupil -true 'neupil -false
        //Petya imeet cr bal 3'49 on xochey 5 za chetvert
        //on uveren chto povsit na+1
        //Polucht Petya 5? da true .net =false

        int PetyaImel = 1000;
        int PetyaOstaloc=1000;
        boolean similarr = (PetyaImel <= PetyaOstaloc);
        System.out.println(similarr);

        double sredniyBalPeti=3.49;
        boolean five = (sredniyBalPeti+1)>=4.5;
        System.out.println(five);


    }
}
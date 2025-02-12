public class Zadachka {
    public static void main(String[] args) {
        //basya poluchaet 5.6 v chas .rabotaet 12 chasov
        //u nego het vixodnix rabotaet 364 dnya
        // Solko chasov otrabotal za god i skolko deneg zarabotal
        // emu doli otpusk oplachivaemiy 50% ot zarplati 14 dneu
        float zarplatavchas = 5.6f;
        int chasiivden = 12;
        int dneyvgod = 364;
        float otzp = zarplatavchas * 0.5f;
        System.out.println("Chsivgod = " + chasiivden * dneyvgod);

        System.out.println("Vasya-zarabotal = " + zarplatavchas * chasiivden * dneyvgod);
        System.out.println("Vasya-zarabotalotp = " +
                ((zarplatavchas * chasiivden * dneyvgod) - (otzp * chasiivden * 14)));



    }
}

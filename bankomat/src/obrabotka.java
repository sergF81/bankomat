public class obrabotka {
    public static int RUB = 0;
    public static int USD = 65;
    public static int EUR = 75;
    public static String otvet = "";
    public static int result_obmena = 0;

    public obrabotka() {
    }

    public static String obraborka_rub(int vibor, String summa_vvod) {
        String var10000;
        switch(vibor) {
            case 1:
                otvet = "1";
                break;
            case 2:
                result_obmena = 2;
                var10000 = String.format("%.2f", Double.parseDouble(summa_vvod) * (double)USD);
                otvet = " ? " + var10000 + " за $ " + summa_vvod;
                break;
            case 3:
                var10000 = String.format("%.2f", Double.parseDouble(summa_vvod) * (double)EUR);
                otvet = " ? " + var10000 + " за € " + summa_vvod;
                result_obmena = 3;
        }

        return otvet;
    }

    public static String obraborka_usd(int vibor, String summa_vvod) {
        String var10000;
        switch(vibor) {
            case 1:
                result_obmena = 4;
                var10000 = String.format("%.2f", Double.parseDouble(summa_vvod) / (double)USD);
                otvet = " $ " + var10000 + " за ? " + summa_vvod;
                break;
            case 2:
                otvet = "1";
                break;
            case 3:
                result_obmena = 5;
                var10000 = String.format("%.2f", Double.parseDouble(summa_vvod) * (double)EUR / (double)USD);
                otvet = " $ " + var10000 + " за € " + summa_vvod;
        }

        return otvet;
    }

    public static String obraborka_eur(int vibor, String summa_vvod) {
        String var10000;
        switch(vibor) {
            case 1:
                var10000 = String.format("%.2f", Double.parseDouble(summa_vvod) / (double)EUR);
                otvet = " € " + var10000 + " за ? " + summa_vvod;
                result_obmena = 6;
                break;
            case 2:
                var10000 = String.format("%.2f", Double.parseDouble(summa_vvod) * (double)USD / (double)EUR);
                otvet = " $ " + var10000 + " за € " + summa_vvod;
                result_obmena = 7;
                break;
            case 3:
                otvet = "1";
        }

        return otvet;
    }

    public static String obrabotka_yes(int result_obmena, String summa_vvod) {
        String var10000;
        switch(result_obmena) {
            case 2:
                var10000 = String.format("%.2f", Double.parseDouble(summa_vvod) * (double)USD);
                otvet = " ? " + var10000 + " за $ " + summa_vvod;
                break;
            case 3:
                var10000 = String.format("%.2f", Double.parseDouble(summa_vvod) * (double)EUR);
                otvet = " ? " + var10000 + " за € " + summa_vvod;
                break;
            case 4:
                var10000 = String.format("%.2f", Double.parseDouble(summa_vvod) / (double)USD);
                otvet = " $ " + var10000 + " за ? " + summa_vvod;
                break;
            case 5:
                var10000 = String.format("%.2f", Double.parseDouble(summa_vvod) * (double)EUR / (double)USD);
                otvet = " $ " + var10000 + " за € " + summa_vvod;
                break;
            case 6:
                var10000 = String.format("%.2f", Double.parseDouble(summa_vvod) / (double)EUR);
                otvet = " € " + var10000 + " за ? " + summa_vvod;
                break;
            case 7:
                var10000 = String.format("%.2f", Double.parseDouble(summa_vvod) * (double)USD / (double)EUR);
                otvet = " $ " + var10000 + " за € " + summa_vvod;
        }

        return otvet;
    }
}

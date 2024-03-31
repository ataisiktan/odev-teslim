

import java.util.Arrays;

public class Odev6_2 {

    public static void main(String[] args) {
        int diziBoyutu = 4;
        int[] dizi = new int[diziBoyutu];

        // Diziyi rastgele sayılarla doldurma
        for (int i = 0; i < diziBoyutu; i++) {
            dizi[i] = (int) (Math.random() * 100) + 1;
        }

        // Diziyi sıralama
        Arrays.sort(dizi);

        // Dizinin elemanlarını yazdırma
        System.out.println("Sıralanmış Dizi: " + Arrays.toString(dizi));

        // Dizinin elemanlarının çarpımının toplamını hesaplama
        int toplam = 0;
        int carpim = 1;
        for (int i = 0; i < dizi.length; i++) {
            carpim *= dizi[i];
            toplam += carpim;
        }

        // Sonucu yazdırma
        System.out.println("Çarpımın Toplamı: " + toplam);
    }
}

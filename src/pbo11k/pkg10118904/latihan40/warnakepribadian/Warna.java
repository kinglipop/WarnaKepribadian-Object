/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118904.latihan40.warnakepribadian;

/**
 *
 * @author Firman Alfinas
 */
public class Warna {
    private static void merah(){
        System.out.println("1. Periang,");
        System.out.println("2. Pemberani,");
        System.out.println("3. Berani mengambil keputusan,");
        System.out.println("4. Menyukai tantangan,");
        System.out.println("5. Kurang sabar,");
        System.out.println("6. Dapat menahan marah namun jika sudah ditahap puncak toleransi, kemarahannya akan sulit dikontrol,");
        System.out.println("7. Memiliki energi kehangatan dan cinta");
    }
    private static void hijau(){
        System.out.println("1. Romantis,");
        System.out.println("2. Menyukai hal yang berbau alami dan keindahan,");
        System.out.println("3. Teguh pada prinsip,");
        System.out.println("4. Menginginkan kesempurnaan,");
        System.out.println("5. Mudah cemburu,");
        System.out.println("6. Mudah merasa iri,");
        System.out.println("7. Menjungjung tinggi suatu nilai toleransi dan kepercayaan");
    }
    private static void kuning(){
        System.out.println("1. Optimis,");
        System.out.println("2. Suka bergaul,");
        System.out.println("3. Periang,");
        System.out.println("4. Senang menolong,");
        System.out.println("5. Lincah dan aktif,");
        System.out.println("6. Tidak suka meremehkan kekurangan orang lain");
        System.out.println("7. Loyal,");
        System.out.println("8. Hangat,");
        System.out.println("9. Meskipun karakternya optimis dan idealis, seringkali goyak dan tidak stabil,");
        System.out.println("10. Cenderung penakut");
    }
    private static void biru(){
        System.out.println("1. Menyenangkan,");
        System.out.println("2. Bijaksana,");
        System.out.println("3. Pembawaan diri tenang saat menghadapi masalah,");
        System.out.println("4. Dinamis,");
        System.out.println("5. Senang berbagi,");
        System.out.println("6. Bersahabat,");
        System.out.println("7. Tidak terlalu suka menjadi sorotan banyak orang orang,");
        System.out.println("8. Menyembunyikan perasaan karena karakternya yang cenderung mencari jalan damai");
    }
    private static void ungu(){
        System.out.println("1. Optimis,");
        System.out.println("2. Tidak pernah ragu,");
        System.out.println("3. Menurutnya pasangan yang ideal adalah yang memiliki mental yang kuat,");
        System.out.println("4. Memiliki ambisi yang besar,");
        System.out.println("5. Memiliki empati yang besar,");
        System.out.println("6. Memiliki sisi misterius, sebab seringkali menutupi perasaanya,");
        System.out.println("7. Terkadang bersikap keras kepala dan angkuh");
    }
    public static void hasilTes(String d){
        System.out.print("Warna favoritmu adalah ");
        
        switch(d) {
            case "MERAH" :
                System.out.println("\u001b[31m"+"MERAH"+"\u001b[0m");
                merah();
                break;
            case "HIJAU" : 
                System.out.println("\u001b[32m"+"HIJAU"+"\u001b[0m");
                hijau();
                break;
            case "KUNING" : 
                System.out.println("\u001b[33m"+"KUNING"+"\u001b[0m");
                kuning();
                break;
            case "BIRU" :
                System.out.println("\u001b[34m"+"BIRU"+"\u001b[0m");
                biru();
                break;
            case "UNGU" : 
                System.out.println("\u001b[35m"+"UNGU"+"\u001b[0m");
                ungu();
                break;
        }
    }
}
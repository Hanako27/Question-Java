import java.util.Scanner;
public class Tested {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

        System.out.print("Nama Lengkap : ");
        String nama = input.nextLine();

        System.out.print("Umur : ");
        int Umur = input.nextInt();

        System.out.print("Alamat : ");
        String alamat = input.next();
        String alamat2 = input.nextLine();

        System.out.println("\n");

        System.out.println("Nama Saya : " + nama);
        System.out.println("Umur Saya : " + Umur);
        System.out.println("Alamat Saya : " + alamat + alamat2);

        System.out.println("\n");

        System.out.println("############# PERTANYAAN WIBU #############");

        System.out.println("\n");

        System.out.println("Apakah Anda Ingin Melanjutkan : (Y/T)");
        String Jawabannya = input.next();
        String Ya = "Y";

        System.out.println("\n");

        if (Jawabannya.equals(Ya)) {

//        ########### variable Jawaban Benarnya ################
            String KunciSoal1 = "C";
            String KunciSoal2 = "D";

//        ########### Soalnya ################
            System.out.println("Siapakah Main Character Di Anime Jujutsu Kaisen ?");
            System.out.println("A. Gojo Satoru");
            System.out.println("B. Yuta Okkotsu");
            System.out.println("C. Itadori Yuji");
            System.out.println("D. Dazai Osamu");

            System.out.println("\n");


            int pointBenar = 25;
            int pointSalah = 25;




//        ########### Input Jawaban Yang Harus Diketik Oleh Lu ################

            System.out.print("Jawaban : ");
            String jawaban = input.next();

//        ########### Hmmm yg jelas biar si programnya bisa ngenalin mana jawaban Yang benar sama yg salahnya pake if-else ################
            if (jawaban.equals(KunciSoal1)) {
                System.out.println("Jawaban Anda Benar");
                System.out.println("Anda Mendapatkan Point : " + pointBenar);
                System.out.println("Point Anda Saat Ini : " + pointBenar);

            } else {
                System.out.println("Jawaban Anda Salah");
                System.out.println("Pengurangan Point Menjadi : " + pointSalah);

            }

            System.out.print("Apakah Anda Ingin Melanjutkan Ke Soal Berikutnya : ");
            String lanjut = input.next();
            String Oke = "Oke";

            if (lanjut.equals(Oke)) {
                System.out.println("Yang Bukan Termasuk Genre Di Anime Adalah ?");
                System.out.println("A. Slice Of Life");
                System.out.println("B. Comedy");
                System.out.println("C. Romance");
                System.out.println("D. Netorare");

                System.out.print("Jawaban : ");
                String Soal2 = input.next();

            if(Soal2.equals(KunciSoal2)) {
                    System.out.println("Jawaban Anda Benar");
                    System.out.println("Anda Mendapatkan Point : " + pointBenar);
            }else {
                    System.out.println("Jawaban Anda Salah");
                    System.out.println("Point Anda Dikurangi" + pointSalah);
                }



            }


//        ########### Jika Lu gk mau melanjutkan Ke PERTANTAAN WIBU ################
        }else{
            System.out.println("Oke Terima Kasih "  + nama + " Atas Partisipasinya");
        }

    }
}

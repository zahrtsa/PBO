import com.handphone.FeaturePhone;
import com.handphone.Smartphone;
import com.handphone.Handphone;

public class Main {
    public static void main(String[] args) {
        // Membuat array atau list dari Handphone
        Handphone[] daftarHandphone = new Handphone[2];

        // Mengisi array dengan objek Smartphone dan FeaturePhone
        daftarHandphone[0] = new Smartphone("Samsung", "Galaxy S21");
        daftarHandphone[1] = new FeaturePhone("Nokia", "3310");

        // Menggunakan loop untuk memanggil metode secara polimorfik
        for (Handphone hp : daftarHandphone) {
            hp.nyalakan();
            hp.kirimPesan("08123456789", "Halo!"); // Mengirim pesan ke satu nomor
            if (hp instanceof Smartphone) {
                ((Smartphone) hp).kirimPesan("admin@gmail.com", "Request Access ", "Please give me access to role admin and give the grant access key");
            } else {
                hp.kirimPesan("08976492321", "0808204702", "Apakabar Bagaimana Harimu di Kamis Ini?");
            }
        
            hp.matikan();
            System.out.println();
        }

        // Mengakses metode khusus dengan casting
        for (Handphone hp : daftarHandphone) {
            if (hp instanceof Smartphone) {
                // Cast ke objek Smartphone dan panggil metode aksesInternet
                ((Smartphone) hp).aksesInternet();
                // Kirim email menggunakan metode overload
            } else if (hp instanceof FeaturePhone) {
                // Cast ke objek FeaturePhone dan panggil metode mainGameSnake
                ((FeaturePhone) hp).mainGameSnake();
            } 
        }

        // Contoh mengirim pesan ke beberapa nomor sekaligus
        String[] daftarNomor = {"08123456789", "08987654321", "08129876543"};
        System.out.println("\nMengirim pesan ke beberapa nomor sekaligus:");
        for (Handphone hp : daftarHandphone) {
            hp.kirimPesan(daftarNomor, "Hai! Silahkan chat ke nomor baru saya [089623118977]");
        }
    }
}

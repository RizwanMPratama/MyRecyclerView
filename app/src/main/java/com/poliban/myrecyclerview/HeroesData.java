package com.poliban.myrecyclerview;

import java.util.ArrayList;
import java.util.List;

public class HeroesData {
    private static String[] heroesName = {
            "Ahmad Dahlan",
            "Ahmad Yani",
             "Sutomo",
             "Gatot Soebroto",
             "Ki Hadjar Dewantarai",
             "Mohammad Hatta",
             "Soedirman",
             "Soekarno",
             "Soepomo",
             "Tan Malaka"
    };

    private static String[] heroDetail = {
                    "Salah seorang ulama dan khatib terkemuka di Masjid Besar Kasultanan Yogyakarta\n" +
                "pada masa itu, dan ibu dari K.H. Ahmad Dahlan adalah puteri dari H. Ibrahim yang juga\n" +
                "menjabat penghulu Kesultanan Ngayogyakarta Hadiningrat pada masa itu.KH. Ahmad Dahlan telah\n" +
                "mempelopori kebangkitan ummat Islam untuk menyadari nasibnya sebagai bangsa terjajah yang\n" +
                "masih harus belajar dan berbuat.",
                    "Jenderal TNI Anumerta Ahmad Yani (juga dieja Achmad Yani; lahir di Purworejo,\n" +
                            "Jawa Tengah, 19 Juni 1922 – meninggal di Lubang Buaya, Jakarta, 1 Oktober 1965 pada umur 43\n" +
                            "tahun) adalah komandan Tentara Nasional Indonesia Angkatan Darat, dan dibunuh oleh anggota\n" +
                            "Gerakan 30 September saat mencoba untuk menculik dia dari rumahnya.",
            "Sutomo (lahir di Surabaya, Jawa Timur, 3 Oktober 1920 – meninggal di Padang\n" +
                    "Arafah, Arab Saudi, 7 Oktober 1981 pada umur 61 tahun) lebih dikenal dengan sapaan akrab oleh\n" +
                    "rakyat sebagai Bung Tomo, adalah pahlawan yang terkenal karena peranannya dalam membangkitkan\n" +
                    "semangat rakyat untuk melawan kembalinya penjajah Belanda melalui tentara NICA, yang berakhir\n" +
                    "dengan pertempuran 10 November 1945 yang hingga kini diperingati sebagai Hari Pahlawan.",
            "Jenderal TNI (Purn.) Gatot Soebroto (lahir di Sumpiuh, Banyumas, Jawa Tengah, 10\n" +
                    "Oktober 1907 – meninggal di Jakarta, 11 Juni 1962 pada umur 54 tahun) adalah tokoh perjuangan\n" +
                    "militer Indonesia dalam merebut kemerdekaan dan juga pahlawan nasional Indonesia. Ia\n" +
                    "dimakamkan di Ungaran, kabupaten Semarang.",
            "Raden Mas Soewardi Soerjaningrat (EBI: Suwardi Suryaningrat, sejak 1922 menjadi\n" +
                    "Ki Hadjar Dewantara, EBI: Ki Hajar Dewantara, beberapa menuliskan bunyi bahasa Jawanya dengan\n" +
                    "Ki Hajar Dewantoro; lahir di Pakualaman, 2 Mei 1889 – meninggal di Yogyakarta, 26 April 1959\n" +
                    "pada umur 69 tahun; selanjutnya disingkat sebagai \\\"Soewardi\\\" atau \\\"KHD\\\") adalah aktivis\n" +
                    "pergerakan kemerdekaan Indonesia, kolumnis, politisi, dan pelopor pendidikan bagi kaum\n" +
                    "pribumi Indonesia dari zaman penjajahan Belanda. Ia adalah pendiri Perguruan Taman Siswa,\n" +
                    "suatu lembaga pendidikan yang memberikan kesempatan bagi para pribumi untuk bisa memperoleh\n" +
                    "hak pendidikan seperti halnya para priyayi maupun orang-orang Belanda.",
            "Dr.(HC) Drs. H. Mohammad Hatta (lahir dengan nama Mohammad Athar, dikenal\n" +
                    "sebagai Bung Hatta; lahir di Fort de Kock (sekarang Bukittinggi, Sumatera Barat), Hindia\n" +
                    "Belanda, 12 Agustus 1902 – meninggal di Jakarta, 14 Maret 1980 pada umur 77 tahun) adalah\n" +
                    "tokoh pejuang, negarawan, ekonom, dan juga Wakil Presiden Indonesia yang pertama. Ia bersama\n" +
                    "Soekarno memainkan peranan penting untuk memerdekakan bangsa Indonesia dari penjajahan\n" +
                    "Belanda sekaligus memproklamirkannya pada 17 Agustus 1945. Ia juga pernah menjabat sebagai\n" +
                    "Perdana Menteri dalam Kabinet Hatta I, Hatta II, dan RIS. Ia mundur dari jabatan wakil\n" +
                    "presiden pada tahun 1956, karena berselisih dengan Presiden Soekarno. Hatta juga dikenal\n" +
                    "sebagai Bapak Koperasi Indonesia.",
            "Jenderal Besar Raden Soedirman (EYD: Sudirman; lahir 24 Januari 1916 – meninggal\n" +
                    "29 Januari 1950 pada umur 34 tahun) adalah seorang perwira tinggi Indonesia pada masa\n" +
                    "Revolusi Nasional Indonesia. Menjadi panglima besar Tentara Nasional Indonesia pertama, ia\n" +
                    "secara luas terus dihormati di Indonesia. Terlahir dari pasangan rakyat biasa di Purbalingga,\n" +
                    "Hindia Belanda, Soedirman diadopsi oleh pamannya yang seorang priyayi. Setelah keluarganya\n" +
                    "pindah ke Cilacap pada tahun 1916, Soedirman tumbuh menjadi seorang siswa rajin; ia sangat\n" +
                    "aktif dalam kegiatan ekstrakurikuler, termasuk mengikuti program kepanduan yang dijalankan\n" +
                    "oleh organisasi Islam Muhammadiyah. Saat di sekolah menengah, Soedirman mulai menunjukkan\n" +
                    "kemampuannya dalam memimpin dan berorganisasi, dan dihormati oleh masyarakat karena\n" +
                    "ketaatannya pada Islam. Setelah berhenti kuliah keguruan, pada 1936 ia mulai bekerja sebagai\n" +
                    "seorang guru, dan kemudian menjadi kepala sekolah, di sekolah dasar Muhammadiyah; ia juga\n" +
                    "aktif dalam kegiatan Muhammadiyah lainnya dan menjadi pemimpin Kelompok Pemuda Muhammadiyah\n" +
                    "pada tahun 1937. Setelah Jepang menduduki Hindia Belanda pada 1942, Soedirman tetap mengajar.\n" +
                    "Pada tahun 1944, ia bergabung dengan tentara Pembela Tanah Air (PETA) yang disponsori Jepang,\n" +
                    "menjabat sebagai komandan batalion di Banyumas. Selama menjabat, Soedirman bersama rekannya\n" +
                    "sesama prajurit melakukan pemberontakan, namun kemudian diasingkan ke Bogor.",
            "Dr.(H.C.) Ir. H. Soekarno (ER, EYD: Sukarno, nama lahir: Koesno Sosrodihardjo)\n" +
                    "(lahir di Surabaya, Jawa Timur, 6 Juni 1901 – meninggal di Jakarta, 21 Juni 1970 pada umur 69\n" +
                    "tahun) adalah Presiden pertama Republik Indonesia yang menjabat pada periode 1945–1967. Ia\n" +
                    "memainkan peranan penting dalam memerdekakan bangsa Indonesia dari penjajahan Belanda. Iaadalah Proklamator Kemerdekaan Indonesia (bersama dengan Mohammad Hatta) yang terjadi pada\n" +
                    "tanggal 17 Agustus 1945. Soekarno adalah yang pertama kali mencetuskan konsep mengenai\n" +
                    "Pancasila sebagai dasar negara Indonesia dan ia sendiri yang menamainya.",
            "Prof. Mr. Dr. Soepomo (Ejaan Soewandi: Supomo; lahir di Sukoharjo, Jawa Tengah,\n" +
                    "22 Januari 1903 – meninggal di Jakarta, 12 September 1958 pada umur 55 tahun) adalah seorang\n" +
                    "pahlawan nasional Indonesia. Soepomo dikenal sebagai arsitek Undang-undang Dasar 1945,\n" +
                    "bersama dengan Muhammad Yamin dan Soekarno.",
            "Tan Malaka atau Ibrahim gelar Datuk Sutan Malaka (lahir di Nagari Pandam Gadang,\n" +
                    "Suliki, Lima Puluh Kota, Sumatera Barat, 2 Juni 1897 – meninggal di Desa Selopanggung,\n" +
                    "Kediri, Jawa Timur, 21 Februari 1949 pada umur 51 tahun) adalah seorang pembela kemerdekaan\n" +
                    "Indonesia, tokoh Partai Komunis Indonesia, juga pendiri Partai Murba, dan merupakan salah\n" +
                    "satu Pahlawan Nasional Indonesia."

        };

            private static int [] heroesImages = {
                     R.drawable.ahmad_dahlan,
                     R.drawable.ahmad_yani,
                     R.drawable.bung_tomo,
                     R.drawable.gatot_subroto,
                     R.drawable.ki_hadjar_dewantara,
                     R.drawable.mohammad_hatta,
                     R.drawable.sudirman,
                     R.drawable.sukarno,
                     R.drawable.supomo,
                     R.drawable.tan_malaka
            };

    static List<Hero> getListData() {
        List<Hero> list = new ArrayList<>();
        for (int i = 0; i < heroesName.length; i++) {
            list.add(new Hero(heroesName[i], heroDetail[i], heroesImages[i]));
        }
        return list;
    }
}

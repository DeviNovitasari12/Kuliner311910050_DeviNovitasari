package com.DeviLestari.Kuliner311910050;

import java.util.ArrayList;

public class DataKuliner {

    public static String[][] data = new String[][]{
            {"Rendang", "Siapa yang tidak tahu makanan khas dari Sumatera Barat yang satu ini. Irisan daging sapi yang dimasak dengan rempah khas padang yang gurih.", "https://cdnwpseller.gramedia.net/wp-content/uploads/2021/11/26104659/Makanan-Khas-Indonesia-Rendang-364x249.jpg"},
            {"Sate", "Sate juga salah satu makanan yang mudah untuk dijumpai di Indonesia. Sate adalah kuliner khas Indonesia yang menggunakan daging ayam, sapi, kambing, kelinci, ataupun kerbau sebagai bahan bakunya.", "https://cdnwpseller.gramedia.net/wp-content/uploads/2021/11/26104839/Makanan-Khas-Indonesia-sate-1.jpg"},
            {"Nasi Goreng", "Nasi goreng sendiri banyak versinya, ada nasi goreng kampung, nasi goreng ijo, nasi goreng jawa, nasi goreng teri, nasi goreng seafood, nasi goreng, nasi goreng sunda, nasi goreng mawut, dll.", "https://cdnwpseller.gramedia.net/wp-content/uploads/2021/11/26104649/Makanan-Khas-Indonesia-Nasi-goreng-364x241.jpg"},
            {"Bakso", "Bakso merupakan olahan dari daging sapi yang dihaluskan, dicampur dengan bumbu halus, tepung terigu, dan penyedap rasa. Adonan tersebut dibentuk bola lalu direbus hingga matang.", "https://cdnwpseller.gramedia.net/wp-content/uploads/2021/11/26104637/Makanan-Khas-Indonesia-bakso.jpg"},
            {"Rawon", "Rawon adalah makan khas dari Kota Surabaya yang mirip dengan sup daging namun memiliki kuah hitam pekat.", "https://cdnwpseller.gramedia.net/wp-content/uploads/2021/11/26104658/Makanan-Khas-Indonesia-rawon.jpg"},
            {"Gado-gado", "Gado-gado adalah makanan khas dari Jakarta yang menyehatkan karena terdiri dari rebusan sayuran seperti kangkung, wortel, labu siam, selada, timun dan irisan tempe yang disiram dengan saus kacang yang gurih", "https://cdnwpseller.gramedia.net/wp-content/uploads/2021/11/26104642/Makanan-Khas-Indonesia-gado-gado.jpg"},
            {"Nasi Padang", "Nasi Padang sebenarnya adalah nasi putih yang disajikan bersama aneka jenis lauk khas Padang seperti rendang, gulai ikan, ayam bakar, ayam pop, telor dadar, kering tempe, daging cincang, daun singkong rebus dan sambal ijo.", "https://cdnwpseller.gramedia.net/wp-content/uploads/2021/11/26104654/Makanan-Khas-Indonesia-nasi-padang.jpg"},
            {"Pempek", "Pempek merupakan kuliner khas Sumatra yang terbuat dari ikan tenggiri, toman, atau gabus yang dihaluskan, dicampur bersama tepung sagu dan bumbu halus.", "https://cdnwpseller.gramedia.net/wp-content/uploads/2021/11/26104656/Makanan-Khas-Indonesia-pempek.jpg"},
            {"Mie Ayam", "Mie Ayam adalah salah satu jenis makanan khas Indonesia menggunakan ketupat yang mudah dijumpai. Biasanya ketoprakdijajakan menggunakan kereta dorong di jalan-jalan atau kaki lima", "https://imgx.sonora.id/crop/0x0:0x0/x/photo/2021/12/31/desain-tanpa-judul-2021-05-10t13-20211231094828.jpg"},
            {"Gudeg", "Gudeg memiliki citasrasa manis dan sering disantap bersama kuah santan kental (areh), ayam kampung, telur, tahu tempe serta krecek", "https://cdnwpseller.gramedia.net/wp-content/uploads/2021/11/26104645/Makanan-Khas-Indonesia-gudeg.jpg"},
            {"Cakalang Rica-rica", "Kuliner yang memiliki citarasa pedas ini terbuat dari ikan cakalang yang diasap hingga harum dan bertekstur kering.", "https://cdnwpseller.gramedia.net/wp-content/uploads/2021/11/26104640/Makanan-Khas-Indonesia-Cakalang-rica-rica.jpg"},
            {"Woko belanga", "Woku adalah bumbu makanan ala Manado yang terbuat dari berbagai macam bumbu khas Minahasa", "https://cdnwpseller.gramedia.net/wp-content/uploads/2021/11/26104714/Makanan-Khas-Indonesia-Woku-Belanga.jpg"},
    };

    public static ArrayList<ModelKuliner> ambilDataKuliner() {
        ArrayList<ModelKuliner> dataKuliner = new ArrayList<>();
        for (String[] varData : data) {
            ModelKuliner model = new ModelKuliner();
            model.setNama(varData[0]);

            model.setTentang(varData[1]);
            model.setFoto(varData[2]);
            dataKuliner.add(model);
        }
        return dataKuliner;
    }
}


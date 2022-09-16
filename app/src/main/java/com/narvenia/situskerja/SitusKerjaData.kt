package com.narvenia.situskerja

import java.util.ArrayList

object SitusKerjaData {
    private val situsName = arrayOf(
        "KarirHub Kemnaker",
        "Kalibrr",
        "TechInAsia Jobs",
        "TopKarir",
        "Glints",
        "Karir.com",
        "Loker ID",
        "Linkedin Jobs",
        "JobStreet",
        "Jobs ID"
    )

    private val domainName = arrayOf(
        "https://karirhub.kemnaker.go.id",
        "https://www.kalibrr.id",
        "https://www.techinasia.com/jobs",
        "https://www.topkarir.com",
        "https://glints.com",
        "https://www.karir.com",
        "https://www.loker.id",
        "https://www.linkedin.com/jobs",
        "https://www.jobstreet.co.id",
        "https://www.jobs.id"
    )

    private val aboutUs = arrayOf(
        "Kementerian Tenaga Kerja Indonesia, sebagai jembatan bagi pencari lapangan kerja dan pencari tenaga kerja." +
                "\n" +
                "Fiturnya juga lumayan lengkap, disediakan juga rincian seperti pekerjaan yang dicari, lokasi pekerjaan, bidang keahlian, sampai ke tipe pekerjaan." +
                "\n" +
                "Menariknya lagi, para pencari kerja juga bisa mengetahui gaji yang ditawarkan oleh perusahaan pencari tenaga kerja.",
        "Di dirikan pada tahun 2013, situs ini adalah tempat mencari lowongan kerja terbesar di Asia Tenggara. " +
                "\n" +
                "Selain itu, situs ini juga bekerjasama dengan beberpa perguruan tinggi untuk memberikan akes informasi lowong kerja yang tersedia di Kalibrr. " +
                "\n" +
                "Situs ini juga sudah menjadi rujukan para pencari kerja dari beberbagai negara di asia tenggara, termasuk Indonesia.",
        "Situs TechInAsia Jobs ini juga sudah cukup populer di kawasan Asia Tenggara. " +
                "\n" +
                "Lowongan yang tersedia bukan hanya dari dalam negeri aja lho! Bahkan ada lowongan yang berasal dari negara tetangga, yakni Malaysia, Singapura dan Filipina. " +
                "\n" +
                "Menariknya lagi, situs ini ada di peringkat ke-5 dari 15 StartUp dengan pendanaan paling besar di Asia Tenggara. " +
                "\n" +
                "Selain itu, perkiraan gaji yang ditawarkan oleh perusahaan juga bisa dilihat oleh para Jobseeker, jadi bisa diperkirakan dengan kebutuhan dan kinerja kalian.",
        "Situs ini menyediakan dua piihan, yaitu mencari lowongan pekerjaan dan mencari tempat magang. " +
                "\n" +
                "Nah, untuk mencari lowongan pekerjaan, kalian bisa memilih menu Lowongan Pekerjaan, lalu filter pencarian pada bagian atas, piliha bagian yang sesuai dengan keahlian kalian, lalu situs ini akan memberikan lowongan pekerjaan yang sesuai dengan keahlian kalian tadi." +
                "\n" +
                "Untuk mencari tempat magang, kalian bisa memilih menu Magang, lalu kalian bisa menemukan posisi intenrship. Menariknya lagi, situs TopKarir juga menyediakan informasi tentang beasiswa, sampai ke info pelatihan kerja juga ada lho!",
        "Mengengar namanya mungkin udah gak asing lagi di telinga kalian ya." +
                "\n" +
                "Pada situs Glints, kalian akan di suguhkan 3 fitur menarik, yaitu fitur komunitas yang bisa kalian gunakan untuk berdiskusi tentang suatu bidang pekerjaan dengan Jobseeker lainnya." +
                "\n" +
                "Kemudian, fitur expert class, yaitu fitur yang memungkinkan kalian untuk memilih kelas-kelas yang akan mendukung upgrade diri kalian menjadi lebih profesional dalam suatu bidang keahlian." +
                "\n" +
                "Yang terakhir ada fitur upgrade, disini kalian akan belajar tentang hal-hal baru yang lebih realistis tentang dunia pekerjaan.",
        "Situs ini memberikan kemudahan untuk para pencari kerja, agar bisa lebih menyortir pekerjaan berdasarkan posisi yang di inginkan, nama perusahaan hingga kata kunci lainnya. " +
                "\n" +
                "Menariknya lagi, situs ini juga akan memberikan rekomendasi deretan perusahaan terbaik versi mereka, dan Jobseeker juga akan mendapatkan email tentang lowongan pekerjaan sesuai dengan resume yang di isikan saat pertama kali membuat akun pada situs ini.",
        "Kemudahan dalam pencarian lowongan kerja juga akan diberikan oleh situs Loker ID ini, didalamnya kalian akan dimudahkan dengan menentukan pekerjaan yang di inginkan, lokasi pekerjaan hingga fitur edukasi yang akan menentukan kualifikasi pendidikan yang dibutuhkan." +
                "\n" +
                "Menariknya lagi, di dalam situs ini sudah di sediakan fitur untuk membuat resume online dan gratis, jadi para pencari kerja tidak perlu repot-repot membuat cv secara manual di luar situs.",
        "Linkedin adalah sebuah aplikasi dan tempat terbaik untuk para pencari pekerjaan, hingga tempat magang." +
                "\n" +
                "Situs ini juga sudah cukup populer di kalangan profesional, mulai pemilik bisnis, manajer, HRD, supervisor dan tentunya karyawan." +
                "\n" +
                "Aplikasi ini juga bisa digunakan untuk berkomunikasi dan membangun hubungan baik dengan rekan bisnis." +
                "\n" +
                "Jadi, biar profil kalian lebih menarik, bagusnya kalian lengkapi detail pada halam profil kalian, seperti data pendidikan, pengalaman pekerjaan, kegiatan, skill, dll.",
        "Situs ini sudah cukup lama berdiri, yakni sejak 1997 dan didirikan di Malaysia, situs ini juga digunakan di berbagai negara, seperti Indonesia, Singapura, Vietnam, Filipina dan tentunya Malaysia itu sendiri." +
                "\n" +
                "Mitra yang terhubung denga JobStreet juga sangat beragam, dari perusahaan Australia hingga Afrika Selatan juga ada lho!" +
                "\n" +
                "Menariknya lagi, situs ini juga memberikan tips karir, yang bisa membantu kalian untuk mendapatkan informasi seputar tips-tips berkarir yang profesional.",
        "Jobs ID juga punya fitur yang menarik seperti situs-situs lainnya, didalamnya kalian akan mendapati lima fitur pencarian kerja, seperti mencari lowongan berdasarkan posisi, lokasi, profil perusahaan, dll\n" +
                "\n" +
                "Pada situs ini juga tersedia menu yang menampilkan lowongan palin populer, jadi Jobseeker tidak perlu repot-repot melakuka pencarian lowongan.\n" +
                "\n" +
                "Kalian juga bisa mencari pekerjaan sesuai dengan level yang dimiliki, mulai level paling bawah yaitu magang, hingga ke level profesional.",
    )

    private val situsImages = intArrayOf(
        R.drawable.karirhub,
        R.drawable.kalibrr,
        R.drawable.techinasia,
        R.drawable.topkarir,
        R.drawable.glints,
        R.drawable.karir,
        R.drawable.loker,
        R.drawable.linkedin,
        R.drawable.jobstreet,
        R.drawable.jobsid
    )

    val situsKerjaData : ArrayList<SitusKerja>
        get(){
            val list = arrayListOf<SitusKerja>()
            for (position in situsName.indices){
                val jobs = SitusKerja()
                jobs.nameSitus = situsName[position]
                jobs.domainSitus = domainName[position]
                jobs.aboutSitus = aboutUs[position]
                jobs.photoSitus = situsImages[position]
                list.add(jobs)
            }
            return list
        }
}
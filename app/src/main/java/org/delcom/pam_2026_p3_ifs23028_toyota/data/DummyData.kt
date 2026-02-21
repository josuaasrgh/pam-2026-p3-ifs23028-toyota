package org.delcom.pam_2026_p3_ifs23028_toyota.data

import org.delcom.pam_2026_p3_ifs23028_toyota.R // Sesuaikan juga nama package untuk import R ini

object DummyData {
    fun getToyotaData(): List<ToyotaData> {
        return listOf(
            ToyotaData(
                nama = "Toyota Avanza",
                gambar = R.drawable.avanza,
                deskripsi = "MPV keluarga legendaris yang dikenal sebagai mobil sejuta umat dengan konsumsi bahan bakar yang sangat irit dan kabin lega.",
                spesifikasi = "Mesin 1.5L Dual VVT-i, 7-Seater, Penggerak Depan (FWD)",
                harga = "Mulai dari Rp 235.000.000"
            ),
            ToyotaData(
                nama = "Toyota Innova Zenix",
                gambar = R.drawable.zenix,
                deskripsi = "Generasi terbaru Kijang Innova dengan desain crossover yang mewah dan dilengkapi teknologi Hybrid terkini.",
                spesifikasi = "Mesin 2.0L Hybrid Engine, TNGA Platform, Panoramic Sunroof",
                harga = "Mulai dari Rp 425.000.000"
            ),
            ToyotaData(
                nama = "Toyota Fortuner",
                gambar = R.drawable.fortuner,
                deskripsi = "SUV tangguh dengan desain gagah, sangat cocok untuk medan off-road maupun jalanan perkotaan.",
                spesifikasi = "Mesin 2.8L VRZ Diesel, Penggerak 4x4 / 4x2, Ground Clearance Tinggi",
                harga = "Mulai dari Rp 560.000.000"
            ),
            ToyotaData(
                nama = "Toyota Alphard",
                gambar = R.drawable.alphard,
                deskripsi = "Premium Luxury MPV yang menawarkan kenyamanan kelas atas layaknya kabin pesawat first-class.",
                spesifikasi = "Mesin 2.5L Hybrid, Captain Seat with Massage, Power Back Door",
                harga = "Mulai dari Rp 1.350.000.000"
            ),
            ToyotaData(
                nama = "Toyota Yaris",
                gambar = R.drawable.yaris,
                deskripsi = "Hatchback sporty yang lincah dan gesit, sangat cocok untuk gaya hidup anak muda perkotaan.",
                spesifikasi = "Mesin 1.5L, 5-Seater, 7 Airbags, Sport Drive Mode",
                harga = "Mulai dari Rp 326.000.000"
            ),
            ToyotaData(
                nama = "Toyota Rush",
                gambar = R.drawable.rush,
                deskripsi = "Compact SUV 7-penumpang dengan desain tangguh yang siap menemani petualangan keluarga.",
                spesifikasi = "Mesin 1.5L, Penggerak Belakang (RWD), Ground Clearance 220mm",
                harga = "Mulai dari Rp 282.000.000"
            ),
            ToyotaData(
                nama = "Toyota Raize",
                gambar = R.drawable.raize,
                deskripsi = "Compact Crossover bergaya modern dengan mesin turbo yang bertenaga namun tetap irit bahan bakar.",
                spesifikasi = "Mesin 1.0L Turbocharge, 5-Seater, Toyota Safety Sense (TSS)",
                harga = "Mulai dari Rp 235.000.000"
            ),
            ToyotaData(
                nama = "Toyota Camry",
                gambar = R.drawable.camry,
                deskripsi = "Sedan eksekutif yang memadukan performa dinamis, kenyamanan premium, dan teknologi hybrid mutakhir.",
                spesifikasi = "Mesin 2.5L Hybrid EV, TNGA Platform, Premium Audio System",
                harga = "Mulai dari Rp 800.000.000"
            ),
            ToyotaData(
                nama = "Toyota Voxy",
                gambar = R.drawable.voxy,
                deskripsi = "High MPV dengan desain boxy (kotak) yang memaksimalkan ruang kabin dan kemudahan akses penumpang.",
                spesifikasi = "Mesin 2.0L Dynamic Force, Dual Power Sliding Door, Captain Seat",
                harga = "Mulai dari Rp 600.000.000"
            ),
            ToyotaData(
                nama = "Toyota Hilux",
                gambar = R.drawable.hilux,
                deskripsi = "Kendaraan pick-up Double Cabin legendaris yang tak kenal kompromi di berbagai medan berat.",
                spesifikasi = "Mesin 2.4L Diesel 4x4, Payload Besar, Suspensi Heavy Duty",
                harga = "Mulai dari Rp 405.000.000"
            )
        )
    }
}
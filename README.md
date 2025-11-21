# 📌 Deskripsi Proyek

Proyek ini dikembangkan sebagai bagian dari tugas Mata Kuliah Pemrograman Berbasis Objek (Java), dengan fokus pada peningkatan keamanan, fungsionalitas, dan pengelolaan data pada aplikasi desktop berbasis Java Swing. Beberapa fitur utama yang dikembangkan meliputi:

**🔐 1. Peningkatan Keamanan Ubah Password**

Fitur ubah password dirancang dengan mekanisme keamanan berlapis untuk mencegah penyalahgunaan akun. Sistem memastikan bahwa perubahan password tidak dapat dilakukan hanya dengan mengetahui username, tetapi juga memerlukan verifikasi tambahan, seperti: Memasukkan password lama, atau Melalui autentikasi berlapis lainnya

Pendekatan ini diterapkan untuk memastikan hanya pemilik akun yang sah yang bisa melakukan perubahan.

**📥 2. Implementasi Fitur Download**

Aplikasi juga dilengkapi tombol Download yang memungkinkan pengguna mengunduh laporan, file, atau data tertentu langsung dari aplikasi.
Fitur ini terhubung dengan backend sehingga file yang diunduh:

- Memiliki format sesuai kebutuhan pengguna

- Akurat berdasarkan data terkini

- Rapi dan terstruktur sesuai standar penyajian laporan

**🗄️ 3. Normalisasi & Perancangan Database**

Proyek turut menerapkan normalisasi database yang tepat sesuai kaidah perancangan basis data, untuk memastikan:

- Struktur data efisien

- Minim duplikasi

- Mudah dikembangkan

- Konsisten dengan penerapan OOP dan validasi input

# 🎯 Tujuan Pengembangan

- Meningkatkan keamanan proses ubah password, sehingga perubahan hanya bisa dilakukan oleh pemilik akun melalui verifikasi yang sah.

- Mengimplementasikan fitur download dinamis untuk menghasilkan laporan atau file dari aplikasi dengan format profesional.

- Meningkatkan keterampilan mahasiswa dalam membangun aplikasi Java yang memperhatikan keamanan, arsitektur, database, dan integrasi fitur.

- Mengembangkan aplikasi yang stabil, aman, dan mudah digunakan, dengan penerapan konsep OOP, pengelolaan database yang benar, serta penyajian data melalui laporan profesional menggunakan Java dan iReport.

# Langkah-langkah praktikum yang diambil dari file Pertemuan Sebelumnya

1.	Ganti nama projek sebelumnya dengan nama PertemuanKeempatbelas
  <img width="647" height="374" alt="image" src="https://github.com/user-attachments/assets/db064748-2e20-4d9d-be45-b020150db5bf" />


2.	Pada Jdialog registrasi kita menambahkan kata rahasia untuk memverifikasi jika lupa password akunnya.
 <img width="633" height="337" alt="image" src="https://github.com/user-attachments/assets/10dc82fd-77ad-46f6-8f4a-1ec1a8a5aee6" />


3.	Kemudian, tambahkan sedikit code untuk menginput kata rahasia yang akan di gunakan untuk verifikasi, jika kita lupa password
  <img width="574" height="434" alt="image" src="https://github.com/user-attachments/assets/16f0f51d-804a-4892-a58b-59b97d218289" />

 

4.	Kemudian menambahkan jdialog kata rahasia untuk verifikasi yang nanti akan disambungkan ke jdialog ganti sandi dan dibagian tombol selesai ditambahkan code.
<img width="412" height="269" alt="image" src="https://github.com/user-attachments/assets/567a366c-51d0-4a84-aaa4-e740f9b796aa" />
  <img width="451" height="58" alt="image" src="https://github.com/user-attachments/assets/d5de9929-27f7-4178-9cf3-6d3a1046a7d3" />


5.	Kemudian di button cari kita tambahkan code untuk memunculkan jdialog kata rahasia dan untuk memverifikasi apakah benar dia pemilik dari akun tersebut. 
   <img width="460" height="280" alt="image" src="https://github.com/user-attachments/assets/0aed5fef-78e5-427b-969d-b0403c2dfbae" />
<img width="377" height="372" alt="image" src="https://github.com/user-attachments/assets/5de3acd6-a04c-4238-b8e7-21801fe871a4" />



6.	Untuk praktek button download, pada Menu Utama kita tambahkan button download pada designnya dan tambahkan code supaya dapat mendownload data menjadi csv.
   <img width="418" height="304" alt="image" src="https://github.com/user-attachments/assets/d2a27919-65ff-4711-9177-447b0e3fefc6" />
   <img width="392" height="295" alt="image" src="https://github.com/user-attachments/assets/5a8518df-cc50-4034-9269-52d08fc62bb6" />
<img width="461" height="127" alt="image" src="https://github.com/user-attachments/assets/d016e80f-e90e-4871-9398-54db4456f90c" />




> Muhammad Ilham Zikri (2206083533)

# MODUL 1

## Refleksi 1
Pada tutorial pertama, sya fokus memahami pentingnya clean code dan secure code. Clean code menjadikrusial karena mempermudah pengembangan dan perawatan kode. Sementara itu, secure code menjadi aspek kunci untuk mengurangi risiko keamanan.
Beberapa prinsip clean code yang saya terapkan di tutorial ini antara lain:
1. Menggunakan nama variabel yang mudah dimengerti
2. Menerapkan fungsi yang singkat dan mudah dipahami

Namun karena kompleksitas program masih rendah, implementasi secure code belum maksimal. Saya menyadari perlunya pemahaman lebih mendalam untuk menerapkan secure code pada proyek yang lebih rumit. Saat ini, saya sedang mengumpulkan informasi terkait secure code untuk meningkatkan kemampuan dalam hal ini.

## Refleksi 2
1. Saya meyakini bahwa unit test merupakan elemen penting dalam pengembangan perangkat lunak. Unit test memastikan keberfungsaan kode dan mempermudah proses debugging. Meskipun memiliki 100% code coverage, hal ini tidak menjamin kebebasan dari bug. Oleh karena itu, unit test tetap menjadi langkah krusial.
Setelah memahami code coverage, saya menyadari kepentingannya. Code coverage memastikan setiap baris kode diuji, meskipun perlu diingat bahwa ini bukan jaminan absolut kebenaran kode. Pemahaman ini mendorong saya untuk tetap konsisten dalam penerapan unit test secara cermat.
2. Membuat kelas Java baru dengan kesamaan terhadap suite pengujian fungsional sebelumnya bisa menimbulkan tantangan, terutama terkait dengan prinsip clean code. Duplikasi kode dapat menjadi masalah, membuat kode sulit dikelola dan dipelihara. Strategi alternatif perlu dipertimbangkan untuk mengurangi duplikasi dan meningkatkan keterbacaan serta efisiensi kode.

# MODUL 2

## Refleksi
1. Setelah melakukan pemeriksaan kode, beberapa permasalahan terdeteksi, diantaranya:
    - Impor yang tidak digunakan:
      Dengan menghilangkan impor yang tidak diperlukan.
    - Pemeliharaan:
      Melakukan pemeliharaan secara berkala terhadap kode kita.
2. Menurut pendapat saya, penerapan yang saya lakukan telah memenuhi prinsip CI/CD. Untuk continuous integration, saya menerapkan menggunakan workflows seperti ci.yml, scorecard.yml, dan pmd_action.yml. Sedangkan, untuk continuous deployment, saya menggunakan koyeb untuk melakukan auto-deployment ketika terjadi perubahan di cabang utama (main branch).
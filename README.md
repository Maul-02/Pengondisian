# Pengondisian

Penjelasan dan fungsi

1. Git Init = git init pada Git Bash berfungsi untuk menginisialisasi repositori Git lokal baru di dalam folder proyek Anda. Perintah ini menciptakan subdirektori tersembunyi bernama .git, yang menyimpan semua catatan riwayat, konfigurasi, dan file pelacakan perubahan. Ini adalah langkah pertama untuk melacak proyek dengan Git.

2. Git Status = Fungsi utama command git status di Git Bash adalah untuk memeriksa kondisi working directory dan staging area. Perintah ini menampilkan informasi file yang telah diubah (modified), file baru yang belum dilacak (untracked), file yang siap di-commit (staged), serta cabang (branch) yang sedang aktif.

3. Git add = Perintah git add di Git Bash berfungsi untuk memasukkan perubahan file dari working directory ke staging area (indeks) agar siap di-commit. Ini adalah tahap krusial sebelum menyimpan perubahan secara permanen di repositori, memungkinkan pemilahan file yang akan disertakan dalam snapshot berikutnya.

4. Git Commit = Fungsi utama perintah git commit di Git Bash adalah menyimpan snapshot atau rekaman perubahan file yang telah di-staging (git add) ke dalam repository lokal. Commit bertindak sebagai checkpoint atau riwayat revisi, memungkinkan pelacakan evolusi kode, serta memudahkan pengembalian ke versi sebelumnya jika terjadi kesalahan.

5. Git push origin main = Perintah git push origin main digunakan untuk mengunggah perubahan kode dari repositori lokal (di komputer) ke repositori remote (misal: GitHub/GitLab) pada cabang main. Ini menyelaraskan branch utama lokal dengan branch utama remote agar kode terbaru tersedia secara online.

Perintah yang sering digunakan dalam penggunaan Command line

1. pwd
2. ls
3. touch
4. chmod
5. cd ..
6. perintah untuk menghapus apa?git rm <nama_file>
7. Perintah: nano nama_file.txt
   Cara Mengedit: Gunakan tombol panah untuk navigasi dan ketik langsung.
   Menyimpan & Keluar: Tekan Ctrl + O, lalu Enter (untuk menyimpan), dan Ctrl + X (untuk keluar).
8.
9.

cheat sheet

1. Repository = Repository (Repo)

   Tempat penyimpanan project Git (folder yang berisi file + riwayat versi)
   Perintah:

   git init # membuat repo baru
   git clone URL # menyalin repo dari remote

2. commit = Snapshot/perubahan yang disimpan ke riwayat Git
   Perintah:

   git add .
   git commit -m "pesan commit"

3. Hash = ID unik dari setiap commit (contoh: a1b2c3d...)
   Digunakan untuk identifikasi commit
   Perintah:

   git log

4. Checkout =
   Berpindah ke branch atau commit tertentu
   Perintah:

   git checkout nama-branch
   git checkout hash_commit

5. Branch =
   Cabang pengembangan terpisah dari main
   Perintah:

   git branch nama-branch
   git checkout nama-branch

6. Merge =
   Menggabungkan branch ke branch lain
   Perintah:

   git merge nama-branch

7. Remote =
   Repo yang ada di server (misalnya GitHub)
   Perintah:

   git remote add origin URL
   git remote -v

8. Clone =
   Menyalin repo dari remote ke lokal
   Perintah:

   git clone URL

9. Push =
   Mengirim perubahan dari lokal ke remote
   Perintah:

   git push origin nama-branch

10. Pull =
    Mengambil update dari remote ke lokal
    Perintah:

    git pull origin nama-branch

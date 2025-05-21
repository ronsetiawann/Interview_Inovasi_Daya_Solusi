# Interview_Inovasi_Daya_Solusi
API berbasis **Spring Boot** yang terhubung ke **PostgreSQL** menggunakan **Docker Compose**. API ini menyediakan data transaksi dan status dari database `interview_test`.

## Prasyarat

- [Docker](https://www.docker.com/)
- [Docker Compose](https://docs.docker.com/compose/) (versi 2 ke atas)

## Menjalankan Proyek

1.  Clone repository:
    ```bash
    git clone <repo-url>
    cd <repo-directory>
    ```
2.  Build dan jalankan dengan Docker Compose:
    ```bash
    docker compose down -v   # Bersihkan volume lama
    docker compose up --build
    ```
3.  Akses API:
    ```bash
    http://localhost:8080/api/viewData
    ```

## Konfigurasi Database

Host: localhost
Port: 5434
DB Name: interview_test
Username: postgres
Password: postgre


## Troubleshooting

Jika Anda mendapatkan error `"relation transactions does not exist"`:

1.  Hapus volume Docker Compose yang lama:
    ```bash
    docker compose down -v
    ```
2.  Cek koneksi dan keberadaan tabel di database:
    ```bash
    docker exec -it postgres_db psql -U postgres -d interview_test
    ```

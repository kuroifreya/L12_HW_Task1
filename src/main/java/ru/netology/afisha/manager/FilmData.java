package ru.netology.afisha.manager;

public class FilmData {
    private int id;
    private String filmName;
    private String genre;
    private int releaseDate;
    private String producerCountry;

    public FilmData() {
    }

    public FilmData(int id, String filmName, String genre, int releaseDate, String producerCountry) {
        this.id = id;
        this.filmName = filmName;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.producerCountry = producerCountry;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getProducerCountry() {
        return producerCountry;
    }

    public void setProducerCountry(String producerCountry) {
        this.producerCountry = producerCountry;
    }
}

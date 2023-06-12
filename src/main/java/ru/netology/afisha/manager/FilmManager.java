package ru.netology.afisha.manager;

public class FilmManager {
    private FilmData[] poster = new FilmData[0];
    private int lastFilmQuantity = 5;

    public FilmManager() {
    }

    public FilmManager(int lastFilmQuantity) {
        this.lastFilmQuantity = lastFilmQuantity;
    }

    public void addFilm(FilmData movie) {
        FilmData[] tmp = new FilmData[poster.length + 1];
        for (int i = 0; i < poster.length; i++) {
            tmp[i] = poster[i];
        }
        tmp[tmp.length - 1] = movie;
        poster = tmp;
    }

    public FilmData[] findAll() {
        return poster;
    }

    public FilmData[] findLast() {
        if (poster.length <= 1) {
            return poster;
        } else {
            int lastFilmLength;
            if (poster.length <= lastFilmQuantity) {
                lastFilmLength = poster.length;
            } else {
                lastFilmLength = lastFilmQuantity;
            }
            FilmData[] lastFilms = new FilmData[lastFilmLength];
            for (int i = 0; i < lastFilmLength; i++) {
                lastFilms[i] = poster[poster.length - 1 - i];
            }
            return lastFilms;
        }
    }
}

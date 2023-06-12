package ru.netology.afisha.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FilmManagerTest {

    FilmData movie1 = new FilmData(1, "Люди в чёрном", "фантастика", 1997, "США");
    FilmData movie2 = new FilmData(2, "Вторая жизнь Уве", "мелодрама", 2015, "Швеция");
    FilmData movie3 = new FilmData(3, "Ла-ла ленд", "мюзикл", 2016, "США");
    FilmData movie4 = new FilmData(4, "Паразиты", "триллер", 2019, "Южная Корея");
    FilmData movie5 = new FilmData(5, "День сурка", "драма", 1993, "США");
    FilmData movie6 = new FilmData(6, "Как приручить дракона", "фэнтези", 2010, "США");
    FilmData movie7 = new FilmData(7, "Король говорит", "драма", 2010, "Великобритания");
    FilmData movie8 = new FilmData(8, "Джентельмены удачи", "комедия", 1971, "СССР");
    FilmData movie9 = new FilmData(9, "Укрась прощальное утро цветами обещания", "аниме", 2018, "Япония");
    FilmData movie10 = new FilmData(10, "Песнь моря", "фэнтези", 2014, "Ирландия");
    FilmData movie11 = new FilmData(11, "Хоббит", "фэнтези", 2013, "Новая Зеландия");

    FilmManager movieEmptySet = new FilmManager();
    FilmManager movieFilledSet = new FilmManager(7);

    @BeforeEach
    public void setup() {
        movieFilledSet.addFilm(movie1);
        movieFilledSet.addFilm(movie2);
        movieFilledSet.addFilm(movie3);
        movieFilledSet.addFilm(movie4);

    }

    @Test
    public void shouldAddNewItem() {
        movieFilledSet.addFilm(movie11);

        FilmData[] expected = {movie1, movie2, movie3, movie4, movie11};
        FilmData[] actual = movieFilledSet.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldNotShowFilms() {


        FilmData[] expected = {};
        FilmData[] actual = movieEmptySet.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowOneFilm() {
        movieEmptySet.addFilm(movie3);

        FilmData[] expected = {movie3};
        FilmData[] actual = movieEmptySet.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowLessLastFilms() { //в массиве 4 фильма, а просим показать 7

        FilmData[] expected = {movie4, movie3, movie2, movie1};
        FilmData[] actual = movieFilledSet.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void shouldShowLastFilms() { //в массиве 11 фильмов, а просим показать 7
        movieFilledSet.addFilm(movie4);
        movieFilledSet.addFilm(movie5);
        movieFilledSet.addFilm(movie6);
        movieFilledSet.addFilm(movie7);
        movieFilledSet.addFilm(movie8);
        movieFilledSet.addFilm(movie9);
        movieFilledSet.addFilm(movie10);
        movieFilledSet.addFilm(movie11);

        FilmData[] expected = {movie11, movie10, movie9, movie8, movie7, movie6, movie5};
        FilmData[] actual = movieFilledSet.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowDefaultLastFilms() { //в массиве 5 фильмов, просим показать последние 5 по умолчанию
        movieFilledSet.addFilm(movie5);

        FilmData[] expected = {movie5, movie4, movie3, movie2, movie1};
        FilmData[] actual = movieFilledSet.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

}
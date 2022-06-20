package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void shouldSetCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.setCurrentVolume(11);
        radio.setCurrentVolume(-1);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

   @Test
    void shouldSetToMax() {
       Radio radio = new Radio();
       radio.toMax(10);
       int expected = 10;
       int actual = radio.getCurrentVolume();
       assertEquals(expected, actual);

   }

    @Test
    void shouldSetToMin() {
        Radio radio = new Radio();
        radio.toMin(0);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);
        radio.increaseVolume();
        int expected = 10;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }
    @Test
    void shouldNotIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.increaseVolume();
        int expected = 10;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldNotDecreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);
        radio.decreaseVolume();
        int expected = 8;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void setCurrentRadioNumber() {
        Radio radio = new Radio();
        radio.setCurrentRadioNumber(10);
        radio.setCurrentRadioNumber(-1);
        radio.setCurrentRadioNumber(0);
        int expected = 0;
        int actual = radio.getCurrentRadioNumber();
        assertEquals(expected, actual);
    }

    @Test
    void shouldTurnToMaxRadioNumber() {
        Radio radio = new Radio();
        radio.setMaxRadioNumber(9);
        int expected = 9;
        int actual = radio.getCurrentRadioNumber();
        assertEquals(expected, actual);
    }

    @Test
    void shouldTurnToMinRadioNumber() {
        Radio radio = new Radio();
        radio.setMinRadioNumber(0);
        int expected = 0;
        int actual = radio.getCurrentRadioNumber();
        assertEquals(expected, actual);
    }


    @Test
    void shouldSwitchNextRadio() {
        Radio radio = new Radio();
        radio.setMaxRadioNumber(9);
        radio.nextRadio();
        int expected = 0;
        int actual = radio.getCurrentRadioNumber();
        assertEquals(expected, actual);

    }

    @Test
    void shouldTurnOnNextRadio() {
        Radio radio = new Radio();
        radio.setCurrentRadioNumber(7);
        radio.nextRadio();
        int expected = 8;
        int actual = radio.getCurrentRadioNumber();
        assertEquals(expected, actual);
    }

    @Test
    void shouldSwitchPrevRadio() {
        Radio radio = new Radio();
        radio.setMinRadioNumber(0);
        radio.prevRadio();
        int expected = 9;
        int actual = radio.getCurrentRadioNumber();
        assertEquals(expected, actual);
    }


    @Test
    void shouldTurnOnPrevRadio() {
        Radio radio = new Radio();
        radio.setCurrentRadioNumber(8);
        radio.prevRadio();
        int expected = 7;
        int actual = radio.getCurrentRadioNumber();
        assertEquals(expected, actual);
    }
}
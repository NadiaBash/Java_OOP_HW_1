package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void setCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        radio.setCurrentVolume(60);
        assertEquals(60, radio.getCurrentVolume());
    }


    @Test
    void shouldSetVolumeMax() {
        Radio radio = new Radio();
        radio.setVolumeMax(100);
        radio.setCurrentVolume(100);
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(60);
        radio.increaseVolume();
        assertEquals(61, radio.getCurrentVolume());
    }

    @Test
    void shouldNotIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    void shouldDecreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(70);
        radio.decreaseVolume();
        assertEquals(69, radio.getCurrentVolume());
    }

    @Test
    void shouldSetVolumeMin() {
        Radio radio = new Radio();
        radio.setVolumeMin(0);
        radio.setCurrentVolume(0);
        assertEquals(0, radio.getCurrentVolume());
    }


    @Test
    void shouldSetCurrentRadioNumber() {
        Radio radio = new Radio();
        radio.setCurrentRadioNumber(4);
        assertEquals(4, radio.getCurrentRadioNumber());
    }

    @Test
    void shouldSetNumberMinRadio() {
        Radio radio = new Radio();
        radio.setNumberMinRadio(0);
        radio.setCurrentRadioNumber(0);
        assertEquals(0, radio.getCurrentRadioNumber());
    }

    @Test
    void setNumberMaxRadio() {
        Radio radio = new Radio();
        radio.setNumberMaxRadio(9);
        radio.setCurrentRadioNumber(9);
        assertEquals(9,radio.getCurrentRadioNumber());
    }

    @Test
    void shouldSetNextRadio() {
        Radio radio = new Radio();
        radio.setCurrentRadioNumber(3);
        radio.nextRadio();
        assertEquals(4, radio.getCurrentRadioNumber());
    }


    @Test
    void shouldSetPrevRadio() {
        Radio radio = new Radio();
        radio.setCurrentRadioNumber(4);
        radio.prevRadio();
        assertEquals(3, radio.getCurrentRadioNumber());
    }

    @Test
    void shouldNotSetRadioNumberAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentRadioNumber(9);
        radio.nextRadio();
        assertEquals(9, radio.getCurrentRadioNumber());
    }

    @Test
    void shouldNotSetRadioNumberBelongMin() {
        Radio radio = new Radio();
        radio.setNumberMinRadio(0);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentRadioNumber());
    }

    @Test
    void setAmountOfRadio() {
        Radio radio = new Radio();
        radio.setAmountOfRadio(10);
        assertEquals(10, radio.getAmountOfRadio());
    }

    @Test
    void shouldTestNotSetAmountOfRadioAboveMax() {
        Radio radio = new Radio (10);
        radio.setAmountOfRadio(11);
        assertEquals(10, radio.getAmountOfRadio());
    }

    @Test
    void shouldNotTernBelowMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void shouldNotTernAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    void shouldNotTurnRadioBelowMin() {
        Radio radio = new Radio();
        radio.setCurrentRadioNumber(-1);
        assertEquals(0, radio.getCurrentRadioNumber());
    }

    @Test
    void shouldNotTurnRadioAboveMax()  {
        Radio radio = new Radio();
        radio.setCurrentRadioNumber(12);
        assertEquals(0, radio.getCurrentRadioNumber());
    }

    @Test
    void prevRadio() {
        Radio radio = new Radio();
        radio.setNumberMaxRadio(12);
        radio.prevRadio();
        assertEquals(10, radio.getCurrentRadioNumber());

    }
}
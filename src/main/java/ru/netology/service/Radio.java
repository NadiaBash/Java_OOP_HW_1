package ru.netology.service;

public class Radio {
    private int currentVolume;
    private int volumeMin = 0;
    private int volumeMax = 100;
    private int currentRadioNumber;
    private int numberMinRadio = 0;
    private int numberMaxRadio = 9;
    private int amountOfRadio = 10;

    public Radio(){
    }

    public Radio(int amountOfRadio) {
        this.amountOfRadio = amountOfRadio;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }


    public void setVolumeMin(int volumeMin) {
        this.volumeMin = volumeMin;
    }


    public void setVolumeMax(int volumeMax) {
        this.volumeMax = volumeMax;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    public int getCurrentRadioNumber() {
        return currentRadioNumber;
    }

    public void setCurrentRadioNumber(int currentRadioNumber) {
        if (currentRadioNumber < 0) {
            return;
        }
        if (currentRadioNumber > 9) {
            return;
        }
        this.currentRadioNumber = currentRadioNumber;
    }


    public void setNumberMinRadio(int numberMinRadio) {
        this.numberMinRadio = numberMinRadio;
    }


    public int getAmountOfRadio() {
        return amountOfRadio;
    }

    public void setNumberMaxRadio(int numberMaxRadio) {
        this.numberMaxRadio = numberMaxRadio;
    }

    public int nextRadio() {
        currentRadioNumber = currentRadioNumber + 1;
        if (currentRadioNumber >= amountOfRadio) {
            currentRadioNumber = currentRadioNumber -1;
        }
        return currentRadioNumber;
    }

    public int prevRadio() {
        currentRadioNumber = currentRadioNumber - 1;
        if (currentRadioNumber < numberMinRadio) {
            currentRadioNumber = amountOfRadio;
        }
        return currentRadioNumber;
    }


    public void setAmountOfRadio(int amountOfRadio) {
        if (amountOfRadio > 10){
            return;
        }

        this.amountOfRadio = amountOfRadio;
    }
}

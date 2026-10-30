//L0325001_ArifaSyifaulQulbi
package com.praktikum9;

public class Penghitung {
    private int nilai = 0;

    public synchronized void tambah() {
        nilai++;
    }

    public int getNilai() {
        return nilai;
    }
}
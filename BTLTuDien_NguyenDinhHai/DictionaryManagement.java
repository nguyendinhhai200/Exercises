package com.company;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class DictionaryManagement {
    public Word insertFromComman() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap tu tieng Anh: ");
        String wordE, wordV;
        wordE = scan.nextLine();
        System.out.print("Nhap giai thich sang Tieng Viet: ");
        wordV = scan.nextLine();
        Word newWord = new Word(wordE, wordV);
        return newWord;
    }
}

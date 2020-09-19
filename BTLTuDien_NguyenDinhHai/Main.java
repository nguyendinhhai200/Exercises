package com.company;

import java.awt.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int choose ;
        Scanner scan = new Scanner(System.in);
        System.out.println("Tu Dien Anh Viet: ");
        Dictionary dic = new Dictionary();
        DictionaryManagement dic_management = new DictionaryManagement();
        DictionaryCommandline dicCommandline = new DictionaryCommandline();
        Word temp = new Word ();
        do{
            System.out.println("Chon thao tac:");
            input();
            choose = scan.nextInt();
            switch (choose)
            {
                case 1:
                    {
                    int n ;
                    System.out.print("Nhap so tu moi vao tu dien : ");
                    n = scan.nextInt();
                    for (int i = 0 ; i < n ; i++)
                    {
                        System.out.println("Nhap tu thu " + (int)(i+1));
                        temp = dic_management.insertFromComman();
                        dic.getListWord().add(temp);
                    }
                    break;
                }
                case 2:
                {
                    // Show Dictionary by showAllWords
                    dicCommandline.showAllWords(dic);
                    // Show Dictionary by dictionaryBasic;
                    dicCommandline.dictionaryBasic();
                    break;
                }
                case 3:
                {

                    break;
                }
            }

        }while (choose!= 5);
    }
    public static void input()
    {
        System.out.println("1, Nhap them tu dien");
        System.out.println("2, Hien thi");
        System.out.println("3, Goi ham ");
    }
}

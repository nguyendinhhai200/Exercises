package com.company;

import java.util.ArrayList;

public class DictionaryCommandline {
        private Dictionary dictionary;
        private DictionaryManagement dicmanagement = new DictionaryManagement();
    public void showAllWords(Dictionary dic) // hiên thị danh sach kêt quả
    {
        System.out.println("N0\t |" +"English\t\t| Vietnamese");
        for(int i = 0 ; i < dic.getListWord().size() ; i++)
        {
            System.out.println(i+1 +"\t |" + dic.getListWord().get(i).getWord_target() + "\t\t| " + dic.getListWord().get(i).getWord_explain());
        }
        this.dictionary = dic;
    }
    public void dictionaryBasic() // gọi hàm insertFromComman và showAllWords
    {
       showAllWords(dictionary);
       dictionary.getListWord().add(dicmanagement.insertFromComman());
    }
}

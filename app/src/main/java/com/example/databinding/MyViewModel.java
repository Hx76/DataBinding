package com.example.databinding;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MyViewModel extends ViewModel {
    public MutableLiveData<Integer> getNumber() {
        if (number == null){
            number = new MutableLiveData<>();
            number.setValue(0);
        }
        return number;
    }

    public void setNumber(MutableLiveData<Integer> number) {
        this.number = number;
    }

    public void add(){
        number.setValue(number.getValue()+1);
    }

    private MutableLiveData<Integer> number;

}

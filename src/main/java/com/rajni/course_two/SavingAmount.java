package com.rajni.course_two;

public class SavingAmount {
    private int saving;

    public int getSaving() {
        return saving;
    }

    public void setSaving(int saving) {
        this.saving = saving;
    }

    public void increment() {
        setSaving(this.saving + 1000);
    }

    public void decrement() {
        setSaving(this.saving - 100);
    }

    public void checkSavings() {
        if(saving >= 1000) {
            System.out.println("Congratulations! You have saved a good amount");
        } else if(saving < 1000 && saving >= 0) {
            System.out.println("Insufficient saving!");
        } else {
            System.out.println("You are in debt");
        }
    }
}

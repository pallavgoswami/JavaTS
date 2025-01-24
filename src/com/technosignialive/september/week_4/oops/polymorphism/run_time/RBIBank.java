package com.technosignialive.september.week_4.oops.polymorphism.run_time;

public class RBIBank {
    float getROI() {
        return 4.5f;
    }
}

class SBI extends RBIBank {
    float getROI() {
        return 10.5f;
    }
}

class HDFC extends RBIBank {
    float getROI() {
        return 9.5f;
    }
}

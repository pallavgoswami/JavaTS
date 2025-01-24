package com.technosignialive.january.solid_principles.dependency_inversion;

import java.security.InvalidKeyException;

interface InputDevice {
    void type();
}

class Keyboard implements InputDevice {
    @Override
    public void type() {
        System.out.println("Typing using keyboard");
    }
}

class VirtualKeyboard implements InputDevice {
    @Override
    public void type() {
        System.out.println("Typing using virtual keyboard");
    }
}

class Notepad {
    InputDevice device;

    public Notepad(String keyboardType) throws InvalidKeyException {
        if (keyboardType.equals("Virtual")) {
            device = new VirtualKeyboard();
        } else if (keyboardType.equals("Keyboard")) {
            device = new Keyboard();
        } else {
            throw new InvalidKeyException("Please enter a correct typing method");
        }
    }

    public void startTyping() {
        device.type();
    }
}

public class TypingApp {
    public static void main(String[] args) throws InvalidKeyException {
        Notepad n1 = new Notepad("Virtual");
        n1.startTyping();
    }
}

package com.vladproduction.control_flow;

import java.util.Scanner;

public class MainWhile {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean isOnRepeat = true;
        while (isOnRepeat){
            System.out.println("Playing current song");
            System.out.println("Would you like this song off of repeat? If answer 'yes' it stop");
            String userInput = input.next();
            if(userInput.equals("yes")){
                isOnRepeat = false;
            }
        }
        //if song not repeat any longer - play another song
        System.out.println("Playing next song");

    }
}

/** @file

;******************************************************************************
;* Copyright (c) 2018, Chugn-Chien,An [fiva1987@gmail.com]. All Rights Reserved.
;*
;* You may not reproduce, distribute, publish, display, perform, modify, adapt,
;* transmit, broadcast, present, recite, release, license or otherwise exploit
;* any part of this publication in any form, by any means, without the prior
;* written permission of Insyde Software Corporation.
;*
;******************************************************************************
*/

public class BackgammonTest {
    public static BackgammonBoard br1 = new BackgammonBoard();
    public static final String strCorrect = "CORRECT";
    public static final String strError = "BUG";
    private static final Boolean setWhitchMan = false;
    private static final Boolean setBlackMan = true;


    public static void main(String[] args1) {
        
 
        System.out.println(strCorrect);
        System.out.println(args1[0]);
   

    }

    public static void move(int a, int b) {

        System.out.println("Move, " + a +" "+ b);
    }

}
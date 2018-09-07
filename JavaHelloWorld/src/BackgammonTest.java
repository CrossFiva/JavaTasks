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

    public static void main(String[] args1) {
        
        System.out.println( br1.getBarBlackCount());
        System.out.println( br1.getBarWhiteCount());
        System.out.println( br1.getPointCount(0));
        System.out.println( br1.getPointBlack(1));
        br1.setPoint(1,5,true);
        br1.move(0,2);
        System.out.println( br1.getBarBlackCount());
        System.out.println( br1.getBarWhiteCount());
        System.out.println( br1.getPointCount(1));
        System.out.println( br1.getPointBlack(1));

    }

}
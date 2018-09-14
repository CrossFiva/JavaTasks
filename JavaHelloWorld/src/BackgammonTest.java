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
    
    //
    // Value setting
    //
    public static final String strCorrect = "CORRECT";
    public static final String strError = "BUG";
    public static final Boolean flagError = false;
    public static final Boolean flagPass = true;

    
    //
    // Setting the Player ID
    //
    private static final Boolean WHITE_PLAYER = false;
    private static final Boolean BLACK_PLAYER = true;   

    //
    // Setting the Test value
    //
    private static final int TEST_VAL_0 = 0;
    private static final int TEST_VAL_1 = 1;
    private static final int TEST_VAL_2 = 2;
    private static final int TEST_VAL_3 = 3;
    private static final int TEST_VAL_4 = 4;
    private static final int TEST_VAL_5 = 5;

    //
    // Setting Node Values
    //
    private static final int TEST_NODE_0 = 0;
    private static final int TEST_NODE_1 = 1;
    private static final int TEST_NODE_2 = 2;
    private static final int TEST_NODE_3 = 3;
    private static final int TEST_NODE_4 = 4;
    private static final int TEST_NODE_5 = 5;
    private static final int TEST_NODE_6 = 6;
    private static final int TEST_NODE_7 = 7;
    private static final int TEST_NODE_8 = 8;
    private static final int TEST_NODE_9 = 9;
    private static final int TEST_NODE_10 = 10;
    private static final int TEST_NODE_11 = 11;
    private static final int TEST_NODE_12 = 12;
    private static final int TEST_NODE_13 = 13;
    private static final int TEST_NODE_14 = 14;
    private static final int TEST_NODE_15 = 15;
    private static final int TEST_NODE_16 = 16;
    private static final int TEST_NODE_17 = 17;    
    private static final int TEST_NODE_18 = 18;
    private static final int TEST_NODE_19 = 19;
    private static final int TEST_NODE_20 = 20;
    private static final int TEST_NODE_21 = 21;
    private static final int TEST_NODE_22 = 22;
    private static final int TEST_NODE_23 = 23;

    private static final int TEST_NODE_24 = 24;

    public static void example () {

    
    }
    public static void main(String[] args1) {
      
        // Testing Area
        if (tMove2EmptySpace() ||
            !tMoveMoreThan6Steps () ||
            tMoveOppositeWay_1 () ||
            tMoveOppositeWay_2 () ||
            tMoveOverThanGameBoard () ||
            !tTakenPlace() ||
            tIncreasingMoving () || 
            tWhiteObtain2Bar () ||
            tBlackObtain2Bar () ||
            tMoveMoreoneMen ()

        )
        {
            System.out.println(strError);
        } else {
            System.out.println(strCorrect);
        }
       

    }

    private static boolean tMoveMoreoneMen(){
        BackgammonBoard board = new BackgammonBoard();
        
        board.setPoint(TEST_NODE_7, TEST_VAL_3, WHITE_PLAYER);    
        board.setPoint(TEST_NODE_11, TEST_VAL_5, BLACK_PLAYER);   
        board.move(TEST_NODE_11, TEST_NODE_7);

        return board.getPointCount(TEST_NODE_7) != TEST_VAL_3;
    }

    private static boolean tBlackObtain2Bar () {
        BackgammonBoard board = new BackgammonBoard(); //check if bar obtain a black men
		board.setPoint(TEST_NODE_11, TEST_VAL_1, WHITE_PLAYER);
		board.setPoint(TEST_NODE_12, TEST_VAL_1, BLACK_PLAYER);
		int PeriousVar = board.getBarBlackCount();
		board.move(TEST_NODE_11, TEST_NODE_12);
		int ProcceedVar = board.getBarBlackCount();
		
        return ProcceedVar == PeriousVar;
    }

    private static boolean tWhiteObtain2Bar () {

		BackgammonBoard board = new BackgammonBoard(); //check if bar obtain a white men
		board.setPoint(TEST_NODE_11, TEST_VAL_1, WHITE_PLAYER);
		board.setPoint(TEST_NODE_12, TEST_VAL_1, BLACK_PLAYER);
		int PeriousVar = board.getBarWhiteCount();
		board.move(TEST_NODE_12, TEST_NODE_11);
		int ProcceedVar = board.getBarWhiteCount();
		return ProcceedVar == PeriousVar;

    }

    private static boolean tIncreasingMoving () {

        BackgammonBoard board = new BackgammonBoard(); //check if fromPoint reduce a men
		board.setPoint(TEST_NODE_11, TEST_VAL_1, WHITE_PLAYER);
		board.setPoint(TEST_NODE_12, TEST_VAL_1, WHITE_PLAYER);
		int PeriousVar = board.getPointCount(11);
		board.move(TEST_NODE_11, TEST_NODE_12);
		int ProcceedVar = board.getPointCount(11);
        
        return ProcceedVar == PeriousVar;

    }

    private static boolean tTakenPlace () {
        BackgammonBoard board = new BackgammonBoard(); 
        // BLACK's men eats White's men on the white's node
		board.setPoint(TEST_NODE_12, TEST_VAL_1, BLACK_PLAYER);
		board.setPoint(TEST_NODE_11, TEST_VAL_1, WHITE_PLAYER);
		board.move(TEST_NODE_12, TEST_NODE_11);
		boolean result = board.getPointBlack(TEST_NODE_11);
         
        return result;
    }

    private static boolean tMoveOverThanGameBoard () {

        BackgammonBoard board = new BackgammonBoard(); //check if point over 24
		board.setPoint(TEST_NODE_23, 1, WHITE_PLAYER);
		
		int PeriousVar = board.getPointCount(TEST_NODE_23);
		board.move(TEST_NODE_23, TEST_NODE_24);
		int ProcceedVar = board.getPointCount(TEST_NODE_23);
		
        return PeriousVar != ProcceedVar;
    }
    
    private static boolean tMoveOppositeWay_1 () {
		BackgammonBoard board = new BackgammonBoard(); // move oppsit way to move against the rule
        board.setPoint(TEST_NODE_11, TEST_VAL_3, BLACK_PLAYER);
		board.setPoint(TEST_NODE_12, TEST_VAL_3, BLACK_PLAYER);

		int PeriousVar = board.getPointCount(TEST_NODE_11);
		board.move(TEST_NODE_11, TEST_NODE_12);
		int ProcceedVar = board.getPointCount(TEST_NODE_11);

        return PeriousVar != ProcceedVar;
    }

    private static boolean tMoveOppositeWay_2 () {
		BackgammonBoard board = new BackgammonBoard(); // move oppsit way to move against the rule
        board.setPoint(TEST_NODE_11, TEST_VAL_3, WHITE_PLAYER);
		board.setPoint(TEST_NODE_12, TEST_VAL_3, WHITE_PLAYER);

		int PeriousVar = board.getPointCount(TEST_NODE_11);
		board.move(TEST_NODE_12, TEST_NODE_11);
		int ProcceedVar = board.getPointCount(TEST_NODE_11);

        return PeriousVar != ProcceedVar;
    }


    // Test whether we can move man to empty space correctly
    private static boolean tMove2EmptySpace(){

        BackgammonBoard board = new BackgammonBoard();

        board.setPoint(TEST_NODE_11, TEST_VAL_3, WHITE_PLAYER);
        board.move(TEST_NODE_11,TEST_NODE_12); // Move 1 black man to an empty point
        

        return board.getPointCount(TEST_NODE_12) == TEST_VAL_0;
    }

    private static boolean tMoveMoreThan6Steps () {
        BackgammonBoard board = new BackgammonBoard();

        board.setPoint(TEST_NODE_11, TEST_VAL_2, WHITE_PLAYER);
		board.setPoint(TEST_NODE_18, TEST_VAL_2, WHITE_PLAYER);
		int PeriousVar = board.getPointCount(TEST_NODE_11);
		board.move(TEST_NODE_11, TEST_NODE_18);
        int ProcceedVar = board.getPointCount(TEST_NODE_11);
        
        return PeriousVar == ProcceedVar;

    }

}
/** @file BackgammonBoard.java
 ;******************************************************************************
;* Copyright (c) 2018, Chugn-Chien,An [fiva1987@gmail.com]. All Rights Reserved.
;*
;* You may not reproduce, distribute, publish, display, perform, modify, adapt,
;* transmit, broadcast, present, recite, release, license or otherwise exploit
;* any part of this publication in any form, by any means, without the prior
;* written permission from Chugn-Chien,An [fiva1987@gmail.com].
;*
;******************************************************************************
*/


public class BackgammonBoard  {
  //
  // Private variable 
  //
  private static final int FLAG_BLACK_MAN = 1; // the flag for black
  private static final int FLAG_WHITE_MAN = 2; // the flag for white
  private static final int VAR_QUANTITY_PLAYER = 2; // only 2 players in a game
  private static final int VAR_MIN_NODE = 0; // the minimum node on the gaming board
  private static final int VAR_MAX_NODE = 23; // the maximum node on the gaming board
  private static final int VAR_QUANTITY_NODE = 24; // the quantity of node on the gaming board.
  private static final int VAR_STATUS_ERROR = 0; // error status
  private static final boolean VAR_STATUS_ERROR_B = false; // error status
  private static final int VAR_MOVING_RANGE = 6;

  //
  // Public Variable
  //


  //
  // Global variable 
  //
  private static String mName; 
  private static int [] mMen = new int [VAR_QUANTITY_NODE]; // array for saving the men on a node.
  private static int [] mPlayer = new int [VAR_QUANTITY_NODE]; // array for saving the players on a node.
  private static int [] mBar = new int [VAR_QUANTITY_PLAYER]; // array for saving bar for each player
  
  
  // public BackgammonBoard(String name) {  
  //   this.mName = name; 
  // }
  public BackgammonBoard() {  
    mMen = new int [VAR_QUANTITY_NODE];
    mPlayer = new int [VAR_QUANTITY_NODE]; 
    mBar = new int [VAR_QUANTITY_PLAYER]; 
  }
  
  public static int getPointCount(int point) {
    if (point < VAR_MIN_NODE || point > VAR_MAX_NODE) return VAR_STATUS_ERROR; // error handle
    return mMen[point]; // return the men on the node.
  }
 
  public static boolean getPointBlack(int point) {
    if (point < VAR_MIN_NODE || point > VAR_MAX_NODE) return VAR_STATUS_ERROR_B; // error handle

    return mPlayer[point] == FLAG_BLACK_MAN;
  }

  public static boolean getPointWhite(int point) {
    if (point < VAR_MIN_NODE || point > VAR_MAX_NODE) return VAR_STATUS_ERROR_B; // error handle
    return mPlayer[point] == FLAG_WHITE_MAN;
  }

  public static void setPoint(int point, int count, boolean black) {
    if (point < VAR_MIN_NODE || point > VAR_MAX_NODE) return; // error handle

    mMen [point] = count;
    if (black) {
      // player : black
      mPlayer [point] = FLAG_BLACK_MAN; 
    } else {
      // player : white
      mPlayer [point] = FLAG_WHITE_MAN;
    }
    return;
  }

  public static int getBarBlackCount() {
    return mBar[FLAG_BLACK_MAN - 1];
  }

  public static int getBarWhiteCount() {
    return mBar[FLAG_WHITE_MAN - 1];
  }

  public static void move(int fromPoint, int toPoint) {
    if (fromPoint < VAR_MIN_NODE || fromPoint > VAR_MAX_NODE ||
        toPoint < VAR_MIN_NODE || toPoint > VAR_MAX_NODE ) return; // error handle : out of node range

    if (Math.abs(fromPoint - toPoint) > VAR_MOVING_RANGE) return; // error handle : over moving steps

    // error handle : wrong direction for both players
    if ((mPlayer[fromPoint] == FLAG_BLACK_MAN && toPoint > fromPoint) || 
        (mPlayer[fromPoint] == FLAG_WHITE_MAN && toPoint < fromPoint)) return; 
        
    
    // error handle : moving to different player's node
    if ((getPointBlack(fromPoint) != getPointBlack(toPoint)) && getPointCount(toPoint) > 1) return;

    // all inputs are fulfilled for the game's rule
    // moving the node
           
    if (getPointBlack(fromPoint) && !getPointBlack(toPoint) && getPointCount(toPoint) == 1){
      // If black player hit white player, white bar will be added
      mMen[fromPoint]--;
      mPlayer[toPoint] = FLAG_BLACK_MAN;
      // add white bar
      mBar[FLAG_WHITE_MAN - 1]++;
    } else if (!getPointBlack(fromPoint) && getPointBlack(toPoint) && getPointCount(toPoint) == 1){
      // If white player hits black player, black bar will be added
      mMen[fromPoint]--;
      mPlayer[toPoint] = FLAG_WHITE_MAN;
      // add black bar
      mBar[FLAG_BLACK_MAN - 1]++;
    } else {
      // same player or empty node situation.
      mMen[fromPoint]--;
      if (getPointCount(toPoint) > 0) {
        mMen[toPoint]++;
      } else {
        // the empty node, the new player and its man are fulled into the node
        mMen[toPoint]++;
        mPlayer[toPoint] = mPlayer[fromPoint];
        // the start node is empty, set the distence node as empty too.
        if (getPointCount(fromPoint) == 0) {
          mPlayer[fromPoint] = 0;
        }
      }
    }
    return;
  }
}
package com.jeffreymanzione.jef.resurrection.exceptions;

public class CouldNotUpdateEntityException extends ClassFillingException {

  /**
   * 
   */
  private static final long serialVersionUID = -47297391878701983L;

  /**
   * 
   */

  public CouldNotUpdateEntityException (String string) {
    super("Error: could not fill class: " + string);
  }
}

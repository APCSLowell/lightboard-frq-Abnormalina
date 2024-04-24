public class LightBoard
{
  /** The lights on the board, where true represents on and false represents off.
   */
  private boolean[][] lights;

  /** Constructs a LightBoard object having numRows rows and numCols columns.
   * Precondition: numRows > 0, numCols > 0
   * Postcondition: each light has a 40% probability of being set to on.
   */
  private int rows, cols;
  public LightBoard(int numRows, int numCols)
  {
    rows = numRows;
    cols = numCols;

  }

  /** Evaluates a light in row index row and column index col and returns a status
   *  as described in part (b).
   *  Precondition: row and col are valid indexes in lights.
   */
  public boolean evaluateLight(int row, int col)
  {
    for(int r = 0; r < lights.length; r++){
      for(int c = 0; c < lights[0].length; c++){
        if((lights[r][c] %2 == 0) && (lights[r][c].getLights() == true)){
          return false;
        }
        if((lights[r][c] % 3 == 0) && (lights[r][c].getLights() == false)){
          return true;
        }
      }
    }
   return lights[row][col].getLights();
  }
  public boolean[][] getLights()
  {
    return lights;
  }
  //used for testing
  public String toString()
  {
    String s = "";
    for (int r = 0; r < lights.length; r++)
    {
      for (int c = 0; c < lights[0].length; c++)
        if (lights[r][c])
          s += "*";
        else
          s += ".";
      s += "\n";
    }
    return s;
  }
  
}

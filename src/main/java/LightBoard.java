public class LightBoard
{

  private boolean[][] lights;


  public LightBoard(int numRows, int numCols)
  {
     lights = new boolean[numRows][numCols];
 for (int j = 0; j < numRows; j++)
 {
 for (int i = 0; i < numCols; i++)
 {
 double rnd = Math.random();
 lights[j][i] = rnd < 0.4;
 }
 }
  }

  public boolean evaluateLight(int row, int col)
  {
     int numOn = 0;

 for (int r = 0; r < lights.length; r++){
 if (lights[r][col]){
 numOn++;
 }
 }
if (lights[row][col] && numOn % 2 == 0)
 {
 return false;
 }
 if (!lights[row][col] && numOn % 3 == 0)
 {
 return true;
 }
 return lights[row][col];
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

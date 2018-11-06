public class ArrayMethods{
  public static int rowSum(int[][]ary, int x){
    int sum = 0;
    if(x >= ary.length){
      return 0;
    }
    for(int i = 0; i < ary[x].length; i++){
      sum = sum + ary[x][i];
    }
    return sum;
  }
  public static int columnSum(int[][] ary, int x){
    int sum = 0;
    for(int i = 0; i < ary.length; i++){
      if(ary[i].length > x){
        sum = sum + ary[i][x];
      }
    }
    return sum;
  }
  public static int[] allRowSums(int[][] ary){
    int[] sums = new int[ary.length];
    for(int i = 0; i < ary.length; i++){
      sums[i] = rowSum(ary, i);
    }
    return sums;
  }
  public static int[] allColSums(int[][] ary){
    int longest = 0;
    for(int i = 0; i < ary.length; i++){
      if(longest < ary[i].length){
        longest = ary[i].length;
      }
    }
    int[] sums = new int[longest];
    for(int j = 0; j < longest; j++){
      sums[j] = columnSum(ary, j);
    }
    return sums;
  }
  public static boolean isRowMagic(int[][] ary){
    int plate = allRowSums(ary)[0];
    for(int i = 0; i < allRowSums(ary).length; i++){
      if(allRowSums(ary)[i] != plate){
        return false;
      }
    }
    return true;
  }
  public static boolean isColumnMagic(int[][] ary){
    if(allColSums(ary).length == 0){
      return true;
    }
    int plate = allColSums(ary)[0];
    for(int i = 0; i < allColSums(ary).length; i++){
      if(allColSums(ary)[i] != plate){
        return false;
      }
    }
    return true;
  }
}

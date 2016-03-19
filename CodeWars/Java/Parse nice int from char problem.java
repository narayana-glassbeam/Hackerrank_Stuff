public class CharProblem {
    public static int howOld(final String herOld) {
        return Integer.parseInt(herOld.substring(0, 1));
    }
}

//other solutions
public class CharProblem {
  public static int howOld(final String herOld) {
    return Character.getNumericValue(herOld.charAt(0));
  }
}

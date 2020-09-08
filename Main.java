class Main {
  public static void main(String[] args) {
    // Starting line
    System.out.println("M&M Color Counts");
    // Declare variables
    int total;
    double blue;
    double brown;
    double green;
    double orange;
    double red;
    double yellow;
    // Do calculations
    total = 55 * 10;
    blue = total * .24;
    brown = total * .13;
    green = total * .16;
    orange = total * .2;
    red = total * .13;
    yellow = total * .14;
    // Print statements
    System.out.println("Blue: " + blue);
    System.out.println("Brown: " + brown);
    System.out.println("Green: " + green);
    System.out.println("Orange: " + orange);
    System.out.println("Red: " + red);
    System.out.println("Yellow: " + yellow);
    // Total variable
    double sum;
    sum = blue + brown + green + orange + red + yellow;
    // Print statement
    System.out.println("Sum: " + sum);
    //If statements
    if (blue > brown && green > orange) {
      System.out.println("Blue over Brown and Green over Orange");
    }
    if (brown <= red) {
      System.out.println("Brown is less than or equal to Red");
    }
    if (sum == total) {
      System.out.println("Numbers match");
    }
  }
}
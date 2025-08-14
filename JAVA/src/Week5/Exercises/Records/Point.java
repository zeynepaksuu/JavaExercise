package Week5.Exercises.Records;

public record Point(int x, int y) {
   //private int z; böyle bişey yapamayız ---- static demeliyiz
    public Point {
        if (x==y) {
            System.out.println("x ve y değeri birbirine eşit olamaz");
        }
    }
}

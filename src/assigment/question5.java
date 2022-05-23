package assigment;

public class question5 {
	static double distance(int x1, int y1, int x2, int y2)
    {
        // Calculating distance
        return Math.sqrt(Math.pow(x2 - x1, 2)
                         + Math.pow(y2 - y1, 2) * 1.0);
    }
    // Driver code
    public static void main(String[] args)
    {
        System.out.println(
            Math.round(distance(25, 4, 1, -6) * 100000.0)
            / 100000.0);
    }

}

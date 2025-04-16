package timus2semester.task_1020;

import java.util.*;
import java.awt.geom.Point2D;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = scanner.nextInt();
        double r = scanner.nextDouble();


        List<Point2D.Double> nails = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            nails.add(new Point2D.Double(x, y));
        }


        Point2D.Double center = findCentroid(nails);

        nails.sort(Comparator.comparingDouble(point -> Math.atan2(point.y - center.y, point.x - center.x)));


        double ropeLength = 0.0;
        for (int i = 0; i < nails.size(); i++) {
            Point2D.Double p1 = nails.get(i);
            Point2D.Double p2 = nails.get((i + 1) % nails.size());
            ropeLength += p1.distance(p2);
        }
        ropeLength += 2 * Math.PI * r;


        System.out.printf("%.2f\n", ropeLength);

        scanner.close();
    }

    private static Point2D.Double findCentroid(List<Point2D.Double> points) {
        double xSum = 0.0, ySum = 0.0;
        for (Point2D.Double point : points) {
            xSum += point.x;
            ySum += point.y;
        }
        return new Point2D.Double(xSum / points.size(), ySum / points.size());
    }
}
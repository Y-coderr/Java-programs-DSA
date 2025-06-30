import java.util.*;

public class NearByCarsPriorityQueue {
    static class Point implements Comparable<Point>{
        int x;
        int y;
        int distSq;
        int i;
        Point(int x, int y, int distSq,int i){
            this.x =x;
            this.y=y;
            this.distSq=distSq;
            this.i=i;
        }

        @Override
        public int compareTo(Point p2){
            return this.distSq - p2.distSq;
        }
    }

    
}

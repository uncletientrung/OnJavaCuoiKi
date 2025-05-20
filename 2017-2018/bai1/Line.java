/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class Line {
    private  Point begin;
    private Point end;
    public Line(int x1,int y1, int x2,int y2){
        begin=new Point();
        end=new Point();
        begin.setX(x1);
        begin.setY(y1);
        end.setX(x2);
        end.setY(y2);
    }
    public Line(Point begin, Point end){
        this.begin=begin;
        this.end=end;
    }

    public Point getBegin() {
        return begin;
    }

    public Point getEnd() {
        return end;
    }

    public void setBegin(Point begin) {
        this.begin = begin;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return "Line[begin=("+begin.toString()+"), end=("+end.toString()+")]";
    }
    public double getLength(){
        return (double) Math.sqrt(Math.pow(end.getX()-begin.getX(),2)+Math.pow(end.getY()-begin.getY(),2));
    }
    
    public Boolean inLine(Point p){
        if((p.getX()-begin.getX())*(end.getY()-begin.getY())==(p.getY()-begin.getY())*(end.getX()-begin.getX())){
            return true;
        }else{
            return false;
        }
    }
    public double distanceToPoint(Point p) {
        double x1 = begin.getX();
        double y1 = begin.getY();
        double x2 = end.getX();
        double y2 = end.getY();
        double x0 = p.getX();
        double y0 = p.getY();

        // Công thức khoảng cách từ điểm đến đường thẳng: |ax + by + c| / sqrt(a^2 + b^2)
        // Với a = y2 - y1, b = x1 - x2, c = x2*y1 - x1*y2
        double a = y2 - y1;
        double b = x1 - x2;
        double c = x2 * y1 - x1 * y2;
        double denominator = Math.sqrt(a * a + b * b);

        // Tránh chia cho 0 (trường hợp đường thẳng thoái hóa thành điểm)
        if (denominator == 0) {
            return 0.0;
        }

        double distance = Math.abs(a * x0 + b * y0 + c) / denominator;
        return distance;
    }

    public double distanceToHalfLine(Point p) {
        // Kiểm tra xem điểm p có nằm trong đoạn nửa đường thẳng hay không
        double x1 = begin.getX();
        double y1 = begin.getY();
        double x2 = end.getX();
        double y2 = end.getY();
        double x0 = p.getX();
        double y0 = p.getY();

        // Tính vector từ begin đến end và từ begin đến p
        double vectorX = x2 - x1;
        double vectorY = y2 - y1;
        double toPointX = x0 - x1;
        double toPointY = y0 - y1;

        // Tính tham số t (t >= 0 cho nửa đường thẳng từ begin)
        double t = (vectorX * toPointX + vectorY * toPointY) / (vectorX * vectorX + vectorY * vectorY);

        if (t < 0) {
            // Nếu t < 0, khoảng cách là từ p đến begin
            return Math.sqrt(Math.pow(x0 - x1, 2) + Math.pow(y0 - y1, 2));
        } else {
            // Nếu t >= 0, tính khoảng cách từ p đến đường thẳng
            return distanceToPoint(p);
        }
    }
    
    
}

package ece2017440140;

public class Point {
	private double x;
	private double y;
	
	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public void setX(double xx) {
		this.x = xx;
		xx = 100;
	}
	
    public void setY(double yy) {
		this.y = yy;
	}
    
    public void print() {
		System.out.println("("+this.getX()+","+this.getY()+")");
		System.out.println("("+getX()+","+getY()+")");
		System.out.println("("+this.x+","+this.y+")");
    }
	
	public double distance() {
		//��ȯ�� ����� ����
		double result; //���������� ��ȿ������ �޼ҵ� ����
		
		//�Ÿ� ���
		result = Math.sqrt(x*x+y*y);
		
		//�Ÿ� ��ȯ
		return result;
	}
	
	public Point move(Point p) { //�Ű� ���� p�� ��ȿ������ �޼ҵ� ����
	
		//temp ���� ����
		double a;
	    double b;
	    //����Ʈ p ��ŭ �̵�
		a = this.x + p.x; //x�� �ʵ� ���� ��� this�� ����ؼ� ���� the filed of this object x
		b = this.y + p.y;	
		//���ο� ����Ʈ ����
		Point pnt = new Point();
		pnt.x = a;
		pnt.y = b;	
		//���ο� ����Ʈ ��ȯ
		return pnt;
	}
}

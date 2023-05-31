import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i;
		System.out.println("Enter the number of polyline's endpoints");
		int n=sc.nextInt();
		System.out.println("Enter the number of papers");
		int k=sc.nextInt();
		int[][] points = new int[n][2];
		for(i=0;i<n;i++){
		    System.out.println("Enter the coordinates of polyline's endpoint " + (i + 1));
		    points[i][0]=sc.nextInt();
		    points[i][1]=sc.nextInt();
		}
		double totalDistance = 0;
		for(i=0;i<n-1;i++){
		    totalDistance+=getDistance(points[i][0],points[i][1],points[i+1][0],points[i+1][1]);
		}
		double totalTime=(totalDistance / 50)*k;
		System.out.printf("The total time Scrooges wastes on signing the papers in seconds = %.2f",totalTime);
		sc.close();
	}
	 public static double getDistance(int x1,int y1,int x2,int y2){
	     int dx=x2-x1;
	     int dy=y2-y1;
	     return Math.sqrt(dx * dx + dy * dy);
	 }
}
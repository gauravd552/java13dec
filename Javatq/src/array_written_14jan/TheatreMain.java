package array_written_14jan;
import java.util.Scanner;
public class TheatreMain {




	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Theatre[] t = new Theatre[3];
		for (int i = 0; i < t.length; i++) {
			System.out.println("Enter the Theatre id :");
			int Theatreid = sc.nextInt();
			System.out.println("Enter the Theatre name :");
			String Theatrename = sc.next();
			System.out.println("Enter the Theatre location :");
			String location = sc.next();
			System.out.println("Enter the movieid");
			int movieid = sc.nextInt();
			System.out.println("Enter the moviename");
			String moviename = sc.next();
			System.out.println("Enter the movie rating");
			double rating = sc.nextDouble();
			Movie mv = new Movie(movieid, moviename, rating);
			t[i] = new Theatre(Theatreid, Theatrename, location, mv);
			for (int i1 = 0; i1 < t.length; i1++) {
				for (int j = i + 1; j < t.length; j++) {
					if (t[i].movie.Rating < t[j].movie.Rating) {
						double temp = t[i].movie.Rating;
						t[i].movie.Rating = t[j].movie.Rating;
						t[j+1].movie.Rating = temp;
					}
				}
				System.out.println(t[i]);
			}

		}

	
}
}
	



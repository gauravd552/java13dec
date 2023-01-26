package array_written_14jan;

public class Movie {
	

	
		int Movieid;
		String Moviename;
		double Rating;

		public Movie(int movieid, String moviename, double rating) {
			Movieid = movieid;
			Moviename = moviename;
			Rating = rating;
		}

		public int getMovieid() {
			return Movieid;
		}

		public void setMovieid(int movieid) {
			Movieid = movieid;
		}

		public String getMoviename() {
			return Moviename;
		}

		public void setMoviename(String moviename) {
			Moviename = moviename;
		}

		public double getRating() {
			return Rating;
		}

		public void setRating(double rating) {
			Rating = rating;
		}

		@Override
		public String toString() {
			return "Movie [Movieid=" + Movieid + ", Moviename=" + Moviename + ", Rating=" + Rating + "]";
		}
	}



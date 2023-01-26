package array_written_14jan;


	

	public class Theatre {
		private int Theatreid;
		private String Theatrename;
		private String location;
		Movie movie;

		public Theatre(int theatreid, String theatrename, String location, Movie movie) {
			Theatreid = theatreid;
			Theatrename = theatrename;
			this.location = location;
			this.movie = movie;
		}

		public int getTheatreid() {
			return Theatreid;
		}

		public void setTheatreid(int theatreid) {
			Theatreid = theatreid;
		}

		public String getTheatrename() {
			return Theatrename;
		}

		public void setTheatrename(String theatrename) {
			Theatrename = theatrename;
		}

		public String getLocation() {
			return location;
		}

		public void setLocation(String location) {
			this.location = location;
		}

		public Movie getMovie() {
			return movie;
		}

		public void setMovie(Movie movie) {
			this.movie = movie;
		}


	}
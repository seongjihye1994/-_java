package com.kh.mini_Project.model;

import java.util.ArrayList;

public class Person {
		
		private String name;
		private int age;
		private String id;
		private String pw;
		private ArrayList<Bank> favoriteBank;   
		private ArrayList<Exhibit> favoriteExhibit; 
		private ArrayList<Hobby> favoriteHobby; 
		private ArrayList<Book> favoriteBook; 
		private ArrayList<Library> favoriteLibrary; 
		private ArrayList<Movie> favoriteMovie; 
		private ArrayList<Restaurant> favoriteRestaurant; 
		private ArrayList<Review> favoriteReview;
		private ArrayList<Hotel> favoriteHotel;
		private ArrayList<Health> favoriteHealth;
		private ArrayList<BookAndLibrary> favoriteBookAndLibrary;
		private ArrayList<HobbyAndHealth> favoriteHobbyAndHealth;
		
		public Person() {}

		public Person(String name, int age, String id, String pw, ArrayList<Bank> favoriteBank,
				ArrayList<Exhibit> favoriteExhibit, ArrayList<Hobby> favoriteHobby, ArrayList<Book> favoriteBook,
				ArrayList<Library> favoriteLibrary, ArrayList<Movie> favoriteMovie,
				ArrayList<Restaurant> favoriteRestaurant, ArrayList<Review> favoriteReview,
				ArrayList<Hotel> favoriteHotel, ArrayList<Health> favoriteHealth,
				ArrayList<BookAndLibrary> favoriteBookAndLibrary, ArrayList<HobbyAndHealth> favoriteHobbyAndHealth) {
			super();
			this.name = name;
			this.age = age;
			this.id = id;
			this.pw = pw;
			this.favoriteBank = favoriteBank;
			this.favoriteExhibit = favoriteExhibit;
			this.favoriteHobby = favoriteHobby;
			this.favoriteBook = favoriteBook;
			this.favoriteLibrary = favoriteLibrary;
			this.favoriteMovie = favoriteMovie;
			this.favoriteRestaurant = favoriteRestaurant;
			this.favoriteReview = favoriteReview;
			this.favoriteHotel = favoriteHotel;
			this.favoriteHealth = favoriteHealth;
			this.favoriteBookAndLibrary = favoriteBookAndLibrary;
			this.favoriteHobbyAndHealth = favoriteHobbyAndHealth;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + age;
			result = prime * result + ((favoriteBank == null) ? 0 : favoriteBank.hashCode());
			result = prime * result + ((favoriteBook == null) ? 0 : favoriteBook.hashCode());
			result = prime * result + ((favoriteBookAndLibrary == null) ? 0 : favoriteBookAndLibrary.hashCode());
			result = prime * result + ((favoriteExhibit == null) ? 0 : favoriteExhibit.hashCode());
			result = prime * result + ((favoriteHealth == null) ? 0 : favoriteHealth.hashCode());
			result = prime * result + ((favoriteHobby == null) ? 0 : favoriteHobby.hashCode());
			result = prime * result + ((favoriteHobbyAndHealth == null) ? 0 : favoriteHobbyAndHealth.hashCode());
			result = prime * result + ((favoriteHotel == null) ? 0 : favoriteHotel.hashCode());
			result = prime * result + ((favoriteLibrary == null) ? 0 : favoriteLibrary.hashCode());
			result = prime * result + ((favoriteMovie == null) ? 0 : favoriteMovie.hashCode());
			result = prime * result + ((favoriteRestaurant == null) ? 0 : favoriteRestaurant.hashCode());
			result = prime * result + ((favoriteReview == null) ? 0 : favoriteReview.hashCode());
			result = prime * result + ((id == null) ? 0 : id.hashCode());
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			result = prime * result + ((pw == null) ? 0 : pw.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Person other = (Person) obj;
			if (age != other.age)
				return false;
			if (favoriteBank == null) {
				if (other.favoriteBank != null)
					return false;
			} else if (!favoriteBank.equals(other.favoriteBank))
				return false;
			if (favoriteBook == null) {
				if (other.favoriteBook != null)
					return false;
			} else if (!favoriteBook.equals(other.favoriteBook))
				return false;
			if (favoriteBookAndLibrary == null) {
				if (other.favoriteBookAndLibrary != null)
					return false;
			} else if (!favoriteBookAndLibrary.equals(other.favoriteBookAndLibrary))
				return false;
			if (favoriteExhibit == null) {
				if (other.favoriteExhibit != null)
					return false;
			} else if (!favoriteExhibit.equals(other.favoriteExhibit))
				return false;
			if (favoriteHealth == null) {
				if (other.favoriteHealth != null)
					return false;
			} else if (!favoriteHealth.equals(other.favoriteHealth))
				return false;
			if (favoriteHobby == null) {
				if (other.favoriteHobby != null)
					return false;
			} else if (!favoriteHobby.equals(other.favoriteHobby))
				return false;
			if (favoriteHobbyAndHealth == null) {
				if (other.favoriteHobbyAndHealth != null)
					return false;
			} else if (!favoriteHobbyAndHealth.equals(other.favoriteHobbyAndHealth))
				return false;
			if (favoriteHotel == null) {
				if (other.favoriteHotel != null)
					return false;
			} else if (!favoriteHotel.equals(other.favoriteHotel))
				return false;
			if (favoriteLibrary == null) {
				if (other.favoriteLibrary != null)
					return false;
			} else if (!favoriteLibrary.equals(other.favoriteLibrary))
				return false;
			if (favoriteMovie == null) {
				if (other.favoriteMovie != null)
					return false;
			} else if (!favoriteMovie.equals(other.favoriteMovie))
				return false;
			if (favoriteRestaurant == null) {
				if (other.favoriteRestaurant != null)
					return false;
			} else if (!favoriteRestaurant.equals(other.favoriteRestaurant))
				return false;
			if (favoriteReview == null) {
				if (other.favoriteReview != null)
					return false;
			} else if (!favoriteReview.equals(other.favoriteReview))
				return false;
			if (id == null) {
				if (other.id != null)
					return false;
			} else if (!id.equals(other.id))
				return false;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			if (pw == null) {
				if (other.pw != null)
					return false;
			} else if (!pw.equals(other.pw))
				return false;
			return true;
		}

		@Override
		public String toString() {
			return "Person [name=" + name + ", age=" + age + ", id=" + id + ", pw=" + pw + ", favoriteBank="
					+ favoriteBank + ", favoriteExhibit=" + favoriteExhibit + ", favoriteHobby=" + favoriteHobby
					+ ", favoriteBook=" + favoriteBook + ", favoriteLibrary=" + favoriteLibrary + ", favoriteMovie="
					+ favoriteMovie + ", favoriteRestaurant=" + favoriteRestaurant + ", favoriteReview="
					+ favoriteReview + ", favoriteHotel=" + favoriteHotel + ", favoriteHealth=" + favoriteHealth
					+ ", favoriteBookAndLibrary=" + favoriteBookAndLibrary + ", favoriteHobbyAndHealth="
					+ favoriteHobbyAndHealth + "]";
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getPw() {
			return pw;
		}

		public void setPw(String pw) {
			this.pw = pw;
		}

		public ArrayList<Bank> getFavoriteBank() {
			return favoriteBank;
		}

		public void setFavoriteBank(ArrayList<Bank> favoriteBank) {
			this.favoriteBank = favoriteBank;
		}

		public ArrayList<Exhibit> getFavoriteExhibit() {
			return favoriteExhibit;
		}

		public void setFavoriteExhibit(ArrayList<Exhibit> favoriteExhibit) {
			this.favoriteExhibit = favoriteExhibit;
		}

		public ArrayList<Hobby> getFavoriteHobby() {
			return favoriteHobby;
		}

		public void setFavoriteHobby(ArrayList<Hobby> favoriteHobby) {
			this.favoriteHobby = favoriteHobby;
		}

		public ArrayList<Book> getFavoriteBook() {
			return favoriteBook;
		}

		public void setFavoriteBook(ArrayList<Book> favoriteBook) {
			this.favoriteBook = favoriteBook;
		}

		public ArrayList<Library> getFavoriteLibrary() {
			return favoriteLibrary;
		}

		public void setFavoriteLibrary(ArrayList<Library> favoriteLibrary) {
			this.favoriteLibrary = favoriteLibrary;
		}

		public ArrayList<Movie> getFavoriteMovie() {
			return favoriteMovie;
		}

		public void setFavoriteMovie(ArrayList<Movie> favoriteMovie) {
			this.favoriteMovie = favoriteMovie;
		}

		public ArrayList<Restaurant> getFavoriteRestaurant() {
			return favoriteRestaurant;
		}

		public void setFavoriteRestaurant(ArrayList<Restaurant> favoriteRestaurant) {
			this.favoriteRestaurant = favoriteRestaurant;
		}

		public ArrayList<Review> getFavoriteReview() {
			return favoriteReview;
		}

		public void setFavoriteReview(ArrayList<Review> favoriteReview) {
			this.favoriteReview = favoriteReview;
		}

		public ArrayList<Hotel> getFavoriteHotel() {
			return favoriteHotel;
		}

		public void setFavoriteHotel(ArrayList<Hotel> favoriteHotel) {
			this.favoriteHotel = favoriteHotel;
		}

		public ArrayList<Health> getFavoriteHealth() {
			return favoriteHealth;
		}

		public void setFavoriteHealth(ArrayList<Health> favoriteHealth) {
			this.favoriteHealth = favoriteHealth;
		}

		public ArrayList<BookAndLibrary> getFavoriteBookAndLibrary() {
			return favoriteBookAndLibrary;
		}

		public void setFavoriteBookAndLibrary(ArrayList<BookAndLibrary> favoriteBookAndLibrary) {
			this.favoriteBookAndLibrary = favoriteBookAndLibrary;
		}

		public ArrayList<HobbyAndHealth> getFavoriteHobbyAndHealth() {
			return favoriteHobbyAndHealth;
		}

		public void setFavoriteHobbyAndHealth(ArrayList<HobbyAndHealth> favoriteHobbyAndHealth) {
			this.favoriteHobbyAndHealth = favoriteHobbyAndHealth;
		}
		
		
		
		
		

}
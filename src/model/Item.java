package model;

public class Item {
	private String title;
	private String author;
        private String imageName;
	
	public Item(String title, String author, String imageName) {
		this.title = title;
		this.author = author;
                this.imageName = imageName;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
        
        public String getImageName(){
            return imageName;
        }
}

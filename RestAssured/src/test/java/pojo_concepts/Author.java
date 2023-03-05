package pojo_concepts;

public class Author {
	
	private int id;
	private int idBook;
	private String firstName;
	private String lastName;
	
	public int getId() {
		
//		System.out.println("GETTER:" + id);
		return id;
		
	}
	public void setId(int id) {
		
//		System.out.println("SETTER:" + id);
		this.id = id;
		
	}
	public int getIdBook() {
		
//		System.out.println("GETTER:" + idBook);
		return idBook;
		
	}
	public void setIdBook(int idBook) {
		
//		System.out.println("SETTER:" + idBook);
		this.idBook = idBook;
		
	}
	public String getFirstName() {
		
//		System.out.println("GETTER:" + firstName);
		return firstName;
		
	}
	public void setFirstName(String firstName) {
		
//		System.out.println("SETTER:" + firstName);
		this.firstName = firstName;
		
	}
	public String getLastName() {
		
//		System.out.println("GETTER:" + lastName);
		return lastName;
		
	}
	public void setLastName(String lastName) {
		
//		System.out.println("SETTER:" + lastName);
		this.lastName = lastName;
		
	}
	
	

}


public class Settersexample {
   /**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
    int id;
   private String name;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Settersexample ob = new Settersexample();
		ob.setId(101);
		System.out.println("id is  "+ob.getId());
		ob.setName("palak");
		System.out.println("name is"+ob.getName());
        
	}

}

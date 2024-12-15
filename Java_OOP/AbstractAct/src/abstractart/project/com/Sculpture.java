package abstractart.project.com;



public class Sculpture extends Art {
    private String material;
	public Sculpture(String material,String title,String author,String description) {
		super(title,author,description);
		setMaterial(material);
			}

	@Override
	public void viewArt() {
				
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

}

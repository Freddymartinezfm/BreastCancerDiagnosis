public class Record {
	private String ID = "id";
	private String THICKNESS = "thickness";
	private String UNIFORMITY_SIZE = "uniformity_size";
	private String UNIFORMITY_SHAPE = "uniformity_shape";
	private String ADHESION = "adhesion";
	private String EPITHELIAL_SIZE = "epithelial_size";
	private String BARE_NUCLEI = "bare_nuclei";
	private String CHROMATIN = "chromatin";
	private String NUCLEOLI = "nucleoli";
	private String MITOSES = "mitoses";
	private String CLASS = "class";


	public void set_id(String id) {
		this.ID = id;
	}

	public String getID() {
		return ID;
	}

	public String getTHICKNESS() {
		return THICKNESS;
	}

	public String getUNIFORMITY_SIZE() {
		return UNIFORMITY_SIZE;
	}

	public String getUNIFORMITY_SHAPE() {
		return UNIFORMITY_SHAPE;
	}

	public String getADHESION() {
		return ADHESION;
	}

	public String getEPITHELIAL_SIZE() {
		return EPITHELIAL_SIZE;
	}

	public String getBARE_NUCLEI() {
		return BARE_NUCLEI;
	}

	public String getCHROMATIN() {
		return CHROMATIN;
	}

	public String getNUCLEOLI() {
		return NUCLEOLI;
	}

	public String getMITOSES() {
		return MITOSES;
	}

	public String getCLASS() {
		return CLASS;
	}

	public void set_thickness(String thickness) {
		this.THICKNESS = thickness;
	}

	public void set_uniformity_size(String uniformity_size) {
		this.UNIFORMITY_SIZE = uniformity_size;
	}

	public void set_uniformity_shape(String uniformity_shape) {
		this.UNIFORMITY_SHAPE = uniformity_shape;
	}

	public void set_adhesion(String adhesion) {
		this.ADHESION = adhesion;
	}

	public void set_epithelial_size(String epithelial_size) {
		this.EPITHELIAL_SIZE = epithelial_size;
	}

	public void set_bare_nuclei(String bare_nuclei) {
		this.BARE_NUCLEI = bare_nuclei;
	}

	public void set_chromatin(String chromatin) {
		this.CHROMATIN = chromatin;
	}

	public void set_nucleoli(String nucleoli) {
		this.NUCLEOLI = nucleoli;
	}

	public void set_mitoses(String mitoses) {
		this.MITOSES = mitoses;
	}

	public void set_class(String CLASS) {
		this.CLASS = CLASS;
	}



	@Override
	public String toString() {
		return "ID:" + ID + '\n' +
				"THICKNESS:" + THICKNESS + '\n' +
				"UNIFORMITY_SIZE:" + UNIFORMITY_SIZE + '\n' +
				"UNIFORMITY_SHAPE:" + UNIFORMITY_SHAPE + '\n' +
				"ADHESION:" + ADHESION + '\n' +
				"EPITHELIAL_SIZE:" + EPITHELIAL_SIZE + '\n' +
				"BARE_NUCLEI:" + BARE_NUCLEI + '\n' +
				"CHROMATIN:" + CHROMATIN + '\n' +
				"NUCLEOLI:" + NUCLEOLI + '\n' +
				"MITOSES:" + MITOSES + '\n' +
				"CLASS:" + CLASS + '\n';
	}
}

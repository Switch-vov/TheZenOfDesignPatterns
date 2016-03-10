package ii;

public class Client {
	public static void main(String[] args) {
		IPettyGirl pettyGirl = new PettyGirl("美眉");
		AbstractSearcher searcher = new Searcher(pettyGirl);
		searcher.show();
	}
}

package utilities;

	public class TestClassMarket implements TestInterfaceStores {
	    private String name;
	    private String address;
	    private int size;

	    public TestClassMarket(String name, String address, int size) {
	        this.name = name;
	        this.address = address;
	        this.size = size;
	    }

	    @Override
	    public String getName() {
	        return name;
	    }

	    @Override
	    public String getAddress() {
	        return address;
	    }

	    public int getSize() {
	        return size;
	    }
	}


@artifact.package@import com.tord.TDomainOperations;

class @artifact.name@ implements TDomainOperations{
	String name

	static constraints = {
		name unique: true
	}

	static mapping = {
	}

	@Override
	public String toString() {
		"${name}"
	}
}

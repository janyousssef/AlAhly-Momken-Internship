
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "failing")
public class FailingStudent extends Student {
	
	
	private float GPA;
	private long extraFees;

	public FailingStudent() {

	}

	public FailingStudent(int id, String name, long fees, float GPA, long extraFees) {
		super(id, name, fees);
		this.GPA = GPA;
		this.extraFees = extraFees;
	}

	public float getGPA() {
		return GPA;
	}

	public void setGPA(float GPA) {
		this.GPA = GPA;
	}

	public long getExtraFees() {
		return extraFees;
	}

	public void setExtraFees(long extraFees) {
		this.extraFees = extraFees;
	}

	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return super.getId();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	public void setId(int id) {
		// TODO Auto-generated method stub
		super.setId(id);
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		super.setName(name);
	}

	@Override
	public long getFees() {
		// TODO Auto-generated method stub
		return super.getFees();
	}

	@Override
	public void setFees(long fees) {
		// TODO Auto-generated method stub
		super.setFees(fees);
	}

}

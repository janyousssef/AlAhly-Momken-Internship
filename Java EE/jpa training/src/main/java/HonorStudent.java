import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "Honor List")
public class HonorStudent extends Student {
	private int ranking;

	public HonorStudent() {

	}

	public HonorStudent(int id, String name, long fees, int ranking) {
		super(id, name, fees);
		this.ranking = ranking;
	}

	public int getRanking() {
		return ranking;
	}

	public void setRanking(int ranking) {
		this.ranking = ranking;
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

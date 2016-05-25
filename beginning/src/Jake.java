
public class Jake implements CharacterInterface {

	@Override
	public String getHIt() {
		// TODO Auto-generated method stub
		String jakeGotHit = "What was that!";
		return jakeGotHit;
	}

	@Override
	public int damage(int currentHealth, int damage) {
		// TODO Auto-generated method stub
		int newHealth = currentHealth - damage;
		if (newHealth >0){
		return newHealth;
		}else{
			return 0;	
		}
		
	}

}

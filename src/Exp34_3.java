
public class Exp34_3 {

	public static void main(String[] args) {
		GameCharacter[] party = {
				new GameCharacter(),
				new Wizard(),
				new Ninja()
		};
		
		for(GameCharacter g:party) {
			g.specialMove();
			System.out.println();
		}
	}

}

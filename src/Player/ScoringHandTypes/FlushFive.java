package Player.ScoringHandTypes;

public class FlushFive extends ScoringHand{
    private int level = 0;
    private int multiplier = 16 + (level * 3);
    private int chips = 160 + (level * 50);

    public FlushFive(int level) {
        super();
        super.setLevel(level);
        super.setChips(chips);
        super.setMultiplier(multiplier);
    }
}

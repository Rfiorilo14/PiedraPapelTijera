import com.mycompany.piedrapapeltijera.Move;
import com.mycompany.piedrapapeltijera.Paper;
import com.mycompany.piedrapapeltijera.Rock;
import com.mycompany.piedrapapeltijera.Scissors;

/**
 *
 * @author Roy Fiorilo
 */
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RulesTest {
    private final Move rock = new Rock();
    private final Move paper = new Paper();
    private final Move scissors = new Scissors();

    @Test
    public void rockBeatsScissors() {
        assertEquals(rock, rock.vs(scissors));
    }

    @Test
    public void rockLostWithPaper() {
        assertEquals(paper, rock.vs(paper));
    }

    @Test
    public void paperBeatsRock() {
        assertEquals(paper, paper.vs(rock));
    }

    @Test
    public void scissorsBeatsPaper() {
        assertEquals(scissors, scissors.vs(paper));
    }

    @Test
    public void scissorsLostWithRock() {
        assertEquals(rock, scissors.vs(rock));
    }

    @Test
    public void paperLostWithScissors() {
        assertEquals(scissors, paper.vs(scissors));
    }
}
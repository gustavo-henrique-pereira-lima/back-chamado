
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Chamado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
}

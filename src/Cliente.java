import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Cliente {
    private String nome;
    private String endereco;
    private String telefone;
    private String email;
}

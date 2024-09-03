package model;

/**
 * The type Freelancer.
 *
 * @author Ivo
 */
public class Freelancer {
    
    private final String NOME;
    private final String NIF;
    private final int TELEFONE;
    private final String EMAIL;
    private ListaReconhecimentos lr;

    /**
     * Instantiates a new Freelancer.
     *
     * @param nome     the nome
     * @param NIF      the nif
     * @param telefone the telefone
     * @param email    the email
     */
    public Freelancer(String nome, String NIF, int telefone, String email){
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome é inválido!");
        }else if(NIF == null || NIF.trim().isEmpty()) {
            throw new IllegalArgumentException("NIF é inválido!");
        }else if (telefone < 111111111 || telefone>999999999) {
            throw new IllegalArgumentException("Telefone é inválido!");
        }else if(email == null || email.trim().isEmpty()) {
            throw new IllegalArgumentException("Email é inválido!");
        }
    this.NOME=nome;
    this.NIF=NIF;
    this.TELEFONE=telefone;
    this.EMAIL=email;
    
    }

    /**
     * Get lista reconhecimentos lista reconhecimentos.
     *
     * @return the lista reconhecimentos
     */
    public ListaReconhecimentos getListaReconhecimentos(){
        return lr;
    }

    /**
     * Set lista reconhecimentos.
     *
     * @param lr the lr
     */
    public void setListaReconhecimentos(ListaReconhecimentos lr){
        this.lr=lr;
    }

    /**
     * Get nome string.
     *
     * @return the string
     */
    public String getNome(){
        return NOME;
    }
    
}

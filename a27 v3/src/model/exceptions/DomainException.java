package model.exceptions;

// CRIANDO EXCESSOES PERSONALIZADAS
/* é possível usar apenas o Exception, mas será necessário usar o throws DomainException nos métodos (q usarem a DomainException) em Reservation
e não será necessário usar o catch RuntimeException lá no App. Entretanto, com o RuntimeException lá no App é possível tratar quaisquer excessoes "desconhecidas"
*/
public class DomainException extends RuntimeException{
    
    public DomainException(String msg)
    {
        super(msg);
    }

}

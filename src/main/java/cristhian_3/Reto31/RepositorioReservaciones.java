package cristhian_3.Reto31;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author USUARIO
 */
@Repository
public class RepositorioReservaciones {
  
 @Autowired
    private InterfaceReservaciones crud8;

    public List<Reservaciones> getAll(){
        return (List<Reservaciones>) crud8.findAll();
    }
    public Optional<Reservaciones> getReservaciones(int id){
        return crud8.findById(id);
    }

    public Reservaciones save(Reservaciones reservation){
        return crud8.save(reservation);
    }
    public void delete(Reservaciones reservation){
        crud8.delete(reservation);
    }   

    Optional<Reservaciones> getReservation(int reservationId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

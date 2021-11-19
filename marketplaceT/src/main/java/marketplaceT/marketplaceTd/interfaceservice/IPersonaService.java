package marketplaceT.marketplaceTd.interfaceservice;

import java.util.List;
import marketplaceT.marketplaceTd.modelo.persona;

/**
 *
 * @author PC
 */
public interface IPersonaService {
    public List<persona> listar();
    public persona listarId(int id);
    public void save(persona p);
    public void delete(int id);
    public List<persona> buscarnombre(String dni);
}

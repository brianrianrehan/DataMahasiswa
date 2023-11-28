package springHibernate.service;
import java.util.List;
import springHibernate.model.Mahasiswa;

/**
 *
 * @author Brian Rian Rehan
 */
public interface MahasiswaService {
    public void save(Mahasiswa mahasiswa);
    public void update(Mahasiswa mahasiswa);
    public void delete(Mahasiswa mahasiswa);
    public Mahasiswa getMahasiswa(String npm);
    public List<Mahasiswa> getMahasiswas();
}

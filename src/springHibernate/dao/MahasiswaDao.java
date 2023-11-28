package springHibernate.dao;
import springHibernate.model.Mahasiswa;
import java.util.List;
/**
 *
 * @author Brian Rian Rehan
 */
public interface MahasiswaDao {
    public void save(Mahasiswa mahasiswa);
    public void update(Mahasiswa mahasiswa);
    public void delete(Mahasiswa mahasiswa);
    public Mahasiswa getMahasiswa(String npm);
    public List<Mahasiswa> getMahasiswas();
}